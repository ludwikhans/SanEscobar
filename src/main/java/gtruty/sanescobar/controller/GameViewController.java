package gtruty.sanescobar.controller;

import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.GameModel;
import gtruty.sanescobar.service.BuildingService;
import gtruty.sanescobar.service.VilageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class GameViewController {

@Value("${Gorlice}")
    private String title;

@Autowired
    BuildingService buildingService;
    @Autowired
    VilageService vilageService;
    //GameService gameService;


    @GetMapping("/gameView")
    public String startPage(Model model){
        VilageEntity vilage = vilageService.getAnyVilage();
        updateViewModel(model, vilage.getName());


        return "gameView";
    }

    private void updateViewModel(Model model, String vilageName) {
        model.addAttribute("nazwa", vilageName);
        model.addAttribute("buildings", buildingService.getAllData());
        model.addAttribute("gameModel", new GameModel());
    }

    @PostMapping("/gameView")
    public String nextTurn(@ModelAttribute("gameModel") GameModel gameModel, @ModelAttribute("buildings") List<BuildingsEntity> buildings, @ModelAttribute("nazwa") String name, Model model) {
//Logika odpowiadająca za obliczaie modyfikatorów
        gameModel.setAgrarsystem(gameModel.agrarSystem());
        //gameService.calculateIncome(gameModel);
        gameModel.setTurnNumber(gameModel.getTurnNumber() + 1);
        updateViewModel(model, name);
        return "gameView";
    }



}
