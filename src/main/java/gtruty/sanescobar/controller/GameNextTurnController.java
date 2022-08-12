package gtruty.sanescobar.controller;


import gtruty.sanescobar.dao.BuildingDao;
import gtruty.sanescobar.dao.BuildingSupplyDao;
import gtruty.sanescobar.dao.GoodsAvailableDao;
import gtruty.sanescobar.dao.startlocation.BuildingNorthDao;
import gtruty.sanescobar.dao.startlocation.FieldNorthDao;
import gtruty.sanescobar.entities.GoodsAvailableEntities;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityNorth;
import gtruty.sanescobar.entities.PlaceOfStart.FieldNorthEntity;
import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.GameModel;
import gtruty.sanescobar.service.*;
import gtruty.sanescobar.service.location.BuildingNorthService;
import gtruty.sanescobar.service.location.FieldNorthService;
import gtruty.sanescobar.service.location.GoodsNorthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@SessionAttributes("game")
public class GameNextTurnController {

    @Autowired
    GameService gameService;

    @Autowired
    VilageService vilageService;

    @Autowired
    BuildingDao buildingDao;

    @Autowired
    BuildingNorthService buildingNorthService;

    @Autowired
    BuildingSupplyService buildingSupplyService;

    @Autowired
    BuildingSupplyDao buildingSupplyDao;

    @Autowired
    FieldSupplyService fieldSupplyService;

    @Autowired
    FieldNorthService fieldNorthService;

    @Autowired
    GoodsNorthService goodsNorthService;

    @Autowired
    GoodsAvailableDao goodsAvailableDao;

    @Autowired
    GoodsAvailableService goodsAvailableService;

    @Autowired
    BuildingNorthDao buildingNorthDao;

    @Autowired
    FieldNorthDao fieldNorthDao;

    @GetMapping("/gameNextTurn")
    public String nextTurnPage(Model model, @ModelAttribute("game") GameModel gameModel) {

        VilageEntity vilage = vilageService.getAnyVilage();
        gameService.saveVilage(gameModel);
        gameService.addNewBuilding(vilage, gameModel, model);
        gameService.addSupplyedBuilding(gameModel);
        gameService.addFields(gameModel, vilage);
        gameService.sumBuying(gameModel);
        gameService.supplyedField(model);
        gameService.addSupplyedField(gameModel);
        gameService.addNewGoods(gameModel);
        gameService.startVilageLoaded(vilage, model);
        gameService.totalArea(vilage, gameModel);
        gameService.gameIncome(gameModel);
        gameService.agrarSystem(gameModel);
        gameService.totalMerchant(vilage, gameModel);
        gameService.typeOfVilage(gameModel, vilage);
        gameService.nextTurnMoney(gameModel);
        gameService.availableToBuyFirstBuilding(gameModel, model);
        gameService.availableToBuyFirstField(gameModel, model);
        gameService.availableGoodsToSell(gameModel);
        gameService.deleteDoubleGoods(gameModel, model);



         model.addAttribute("kurczak", gameModel.getGoodsName());















        if (gameService.getModel() == null)
            gameService.setModel(gameModel);
        updateViewModel(model, gameService.getModel());


        return "gameNextTurn";
    }

    private void updateViewModel(Model model/*, String vilageName, Long locationId*/, GameModel gameModel) {
        // model.addAttribute("nazwa", vilageName);
        // model.addAttribute("lokalization", locationId);
        model.addAttribute("game", gameModel);
    }

    @PostMapping("/gameNextTurn")
    public String nextTurn(@ModelAttribute("game") GameModel gameModel,
                           RedirectAttributes redirect,
                           Model model) {
        gameModel.setTurnNumber(gameModel.getTurnNumber() + 1);
        gameService.saveIntoTabela(gameModel.getBuildingName(), gameModel);
        gameService.setModel(gameModel);
        updateViewModel(model, gameService.getModel());
        redirect.addFlashAttribute("game", gameModel);
        return "redirect:/event";
    }
}






