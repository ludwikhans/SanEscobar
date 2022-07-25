package gtruty.sanescobar.controller;

import gtruty.sanescobar.entities.PlaceOfStart.FieldsStartEntity;
import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.GameModel;
import gtruty.sanescobar.service.BuildingService;
import gtruty.sanescobar.service.location.BuildingSouthService;
import gtruty.sanescobar.service.FieldStartService;
import gtruty.sanescobar.service.VilageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class GameViewController {

@Value("${Gorlice}")
    private String title;

    @Autowired
    BuildingService buildingService;

    @Autowired
    BuildingSouthService buildingSouthService;

    @Autowired
    FieldStartService fieldStartService;

    @Autowired
    VilageService vilageService;
    //GameService gameService;


    @GetMapping("/gameView")
    public String startPage(Model model){

        List<FieldsStartEntity> startField = fieldStartService.getAllData();
        Map<String,Long> startFieldMap = startField.stream().collect(Collectors.groupingBy(FieldsStartEntity::getName, Collectors.counting()));


        model.addAttribute("buildings", buildingSouthService.getAllData());
        model.addAttribute("startField",fieldStartService.getAllData());
        model.addAttribute("fieldCategory",startFieldMap.keySet());
        model.addAttribute("fieldCategoryValues",startFieldMap.values());
        VilageEntity vilage = vilageService.getAnyVilage();
        updateViewModel(model, vilage.getName());

        GameModel gameModel = new GameModel();
        model.addAttribute("game", gameModel);




        return "gameView";
    }

    private void updateViewModel(Model model, String vilageName) {
        model.addAttribute("nazwa", vilageName);
        model.addAttribute("buildings", buildingSouthService.getAllData());
        model.addAttribute("gameModel", new GameModel());


   /* @PostMapping("/gameView")
    public String nextTurn(@ModelAttribute("gameModel") GameModel gameModel, @ModelAttribute("buildings") List<BuildingsEntity> buildings, @ModelAttribute("nazwa") String name, Model model) {
//Logika odpowiadająca za obliczaie modyfikatorów
        gameModel.setAgrarsystem(gameModel.agrarSystem());
        //gameService.calculateIncome(gameModel);
        gameModel.setTurnNumber(gameModel.getTurnNumber() + 1);
        updateViewModel(model, name);
        return "gameView";*/
    }
    }




