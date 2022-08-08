package gtruty.sanescobar.controller;


import gtruty.sanescobar.dao.GameEventDao;
import gtruty.sanescobar.entities.GameEventEntity;
import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.GameModel;
import gtruty.sanescobar.service.GameEventService;
import gtruty.sanescobar.service.GameService;
import gtruty.sanescobar.service.VilageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Random;


@Controller
public class GameNextTurnController {

    @Autowired
    GameService gameService;

    @Autowired
    VilageService vilageService;

    @GetMapping("/gameNextTurn")
    public String nextTurnPage(Model model, GameModel gameModel) {

        VilageEntity vilage = vilageService.getAnyVilage();
        gameService.saveVilage(gameModel);
        gameService.startVilageLoaded(vilage, model);
        gameService.totalArea(vilage, gameModel);
        gameService.agrarSystem(gameModel);
        gameService.totalMerchant(vilage, gameModel);
        gameService.gameIncome(gameModel, vilage);
        gameService.availableToBuyFirstBuilding(gameModel, model);
        gameService.availableToBuyFirstField(gameModel, model);


        model.addAttribute("kurczak",gameModel.getBuildingName());


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
                           Model model) {
        gameModel.setTurnNumber(gameModel.getTurnNumber() + 1);
        gameService.saveIntoTabela(gameModel.getBuildingName());
        gameService.setModel(gameModel);
        updateViewModel(model, gameService.getModel());
        return "redirect:/event";
    }
}






