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


    @GetMapping("/gameNextTurn")
    public String nextTurnPage(Model model, @ModelAttribute("game") GameModel gameModel) {

        gameService.addNewBuilding(gameModel, model);
        gameService.addSupplyedBuilding(gameModel);
        gameService.addFields(gameModel);
        gameService.sumBuying(gameModel);
        gameService.supplyedField(model);
        gameService.addSupplyedField(gameModel);
        gameService.addNewGoods(gameModel);
        gameService.startVilageLoaded(gameModel, model);
        gameService.totalArea(gameModel);
        gameService.gameIncome(gameModel);
        gameService.agrarSystem(gameModel);
        gameService.totalMerchant(gameModel);
        gameService.typeOfVilage(gameModel);
        gameService.nextTurnMoney(gameModel);
        gameService.availableToBuyFirstBuilding(gameModel, model);
        gameService.availableToBuyFirstField(gameModel, model);
        gameService.availableGoodsToSell(gameModel);
        gameService.deleteDoubleGoods(gameModel, model);



        if (gameService.getModel() == null)
            gameService.setModel(gameModel);
        updateViewModel(model, gameService.getModel());


        return "gameNextTurn";
    }

    private void updateViewModel(Model model, GameModel gameModel) {
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






