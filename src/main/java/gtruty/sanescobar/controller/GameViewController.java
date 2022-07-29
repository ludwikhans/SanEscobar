package gtruty.sanescobar.controller;

import gtruty.sanescobar.entities.PlaceOfStart.StartFieldEntity;
import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.GameModel;
import gtruty.sanescobar.model.field.FieldsModelOfMeadow;
import gtruty.sanescobar.model.field.FieldsModelOfPloughtFields;
import gtruty.sanescobar.service.BuildingService;
import gtruty.sanescobar.service.FieldsOfStartService;
import gtruty.sanescobar.service.location.*;
import gtruty.sanescobar.service.VilageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GameViewController {

@Value("${Gorlice}")
    private String title;

    @Autowired
    BuildingService buildingService;

    @Autowired
    BuildingSouthService buildingSouthService;

    @Autowired
    BuildingEastService buildingEastService;

    @Autowired
    BuildingCentralService buildingCentralService;

    @Autowired
    BuildingNorthService buildingNorthService;

    @Autowired
    BuildingWestService buildingWestService;

    @Autowired
    FieldsOfStartService fieldsOfStartService;

    @Autowired
    FieldCentralService fieldCentralService;

    @Autowired
    FieldEastService fieldEastService;

    @Autowired
    FieldNorthService fieldNorthService;

    @Autowired
    FieldSouthService fieldSouthService;

    @Autowired
    FieldWestService fieldWestService;

    @Autowired
    VilageService vilageService;
    //GameService gameService;



    @GetMapping("/gameView")
    public String startPage(Model model){


       // List<FieldsOfMeadowEntity> startField = fieldStartService.getAllData();
       // Map<String,Long> startFieldMap = startField.stream().collect(Collectors.groupingBy(FieldsOfMeadowEntity::getName, Collectors.counting()));

        VilageEntity vilage = vilageService.getAnyVilage();
        updateViewModel(model, vilage.getName(),vilage.getLocationId());
        model.addAttribute("lokalizacja",vilage.getLocationId());
        GameModel gameModel = new GameModel();
        model.addAttribute("game", gameModel);



        gameModel.startVilageLoaded(vilage,model,buildingWestService,buildingEastService,buildingNorthService,buildingSouthService ,buildingCentralService, fieldWestService, fieldEastService,fieldNorthService,fieldSouthService,fieldCentralService);




         //  model.addAttribute("startField",fieldStartService.getAllData());
        //model.addAttribute("totalArea",fieldStartService.total());
        //  model.addAttribute("fieldCategory",startFieldMap.keySet());
        //  model.addAttribute("fieldCategoryValues",startFieldMap.values());

        return "gameView";
    }

    private void updateViewModel(Model model, String vilageName, Long locationId) {
        model.addAttribute("nazwa", vilageName);
        model.addAttribute("lokalization" ,locationId);
        model.addAttribute("buildings", buildingSouthService.getAllData());
        model.addAttribute("fields",fieldsOfStartService.getAllData());
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






