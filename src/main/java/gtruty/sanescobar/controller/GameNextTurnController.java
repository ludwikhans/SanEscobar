package gtruty.sanescobar.controller;


import gtruty.sanescobar.dao.BuildingDao;
import gtruty.sanescobar.dao.BuildingSupplyDao;
import gtruty.sanescobar.dao.GameEventDao;
import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.entities.FieldsSupplyEntity;
import gtruty.sanescobar.entities.GameEventEntity;
import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.GameModel;
import gtruty.sanescobar.model.field.FieldsModelOfMeadow;
import gtruty.sanescobar.model.field.FieldsModelOfPloughtFields;
import gtruty.sanescobar.service.*;
import gtruty.sanescobar.service.location.BuildingNorthService;
import gtruty.sanescobar.service.location.FieldNorthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;


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
    FieldSupplyService  fieldSupplyService;

    @Autowired
    FieldNorthService fieldNorthService;

    @GetMapping("/gameNextTurn")
    public String nextTurnPage(Model model, @ModelAttribute("game") GameModel gameModel) {

        VilageEntity vilage = vilageService.getAnyVilage();
        gameService.saveVilage(gameModel);
        gameService.addNewBuilding(vilage,gameModel,model);
        gameService.addSupplyedBuilding(gameModel);
        gameService.addFields(gameModel, vilage);
        gameService.supplyedField(model);
        gameService.addSupplyedField(gameModel);
        gameService.startVilageLoaded(vilage, model);
        gameService.totalArea(vilage, gameModel);
        gameService.gameIncome(gameModel, vilage);
        gameService.agrarSystem(gameModel);
        gameService.totalMerchant(vilage, gameModel);
        gameService.typeOfVilage(gameModel, vilage);
        gameService.nextTurnMoney(gameModel);
        gameService.availableToBuyFirstBuilding(gameModel, model);
        gameService.availableToBuyFirstField(gameModel, model);
        gameService.availableGoodsToSell(gameModel,model);







        model.addAttribute("kurczak",gameModel.getPlantInFields());


   /*




        gameService.deleteDoubleGoods(vilage);
        gameService.saveGoods(vilage,gameModel);
        gameService.addNewGoods(gameModel,vilage);
        gameService.sumBuying(gameModel);*/










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
        gameService.saveIntoTabela(gameModel.getBuildingName(),gameModel);
        gameService.setModel(gameModel);
        updateViewModel(model, gameService.getModel());
        redirect.addFlashAttribute("game", gameModel);
        return "redirect:/event";
    }
}






