package gtruty.sanescobar.controller;

import gtruty.sanescobar.dao.*;
import gtruty.sanescobar.dao.startlocation.*;
import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.entities.BuildingsSupplyEntity;
import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.GameModel;
import gtruty.sanescobar.service.*;
import gtruty.sanescobar.service.location.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@SessionAttributes("game")
public class GameViewController {

    @Autowired
    GameService gameService;

    @Autowired
    VilageService vilageService;


    @ModelAttribute("game")
    public GameModel initiateGameModel() {
        return new GameModel();
    }

    @GetMapping("/gameView")
    public String startPage(Model model, @ModelAttribute("game") GameModel gameModel) {
        VilageEntity vilage = vilageService.getAnyVilage();
        gameService.saveVilage(gameModel);
        gameService.createBuildingTable();
        gameService.createLocationBuildingTable();
        gameService.createAnimalTable();
        gameService.createFieldTable();
        gameService.createLocationFieldTable();
        gameService.createPlantTable();
        gameService.createLocationGoods();
        gameService.createEventTable();
        gameService.startVilageLoaded(gameModel, model);
        gameService.totalArea(gameModel);
        gameService.gameIncome(gameModel);
        gameService.agrarSystem(gameModel);
        gameService.totalMerchant(gameModel);
        gameService.typeOfVilage(gameModel);
        gameService.startMoney(gameModel);
        gameService.availableToBuyFirstBuilding(gameModel, model);
        gameService.availableToBuyFirstField(gameModel, model);




        return "gameView";
    }

    private void updateViewModel(Model model, GameModel gameModel) {
        model.addAttribute("game", gameModel);


    }

    @PostMapping("/gameView")
    public String nextTurn(@ModelAttribute("game") GameModel gameModel,
                           RedirectAttributes redirect
                       ) {
        gameModel.setTurnNumber(gameModel.getTurnNumber() + 1);
        gameService.saveIntoTabela(gameModel.getBuildingName(), gameModel);
        gameService.setModel(gameModel);
        redirect.addFlashAttribute("game", gameModel);
        return "redirect:/event";
    }
}






