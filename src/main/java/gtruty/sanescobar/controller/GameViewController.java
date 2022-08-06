package gtruty.sanescobar.controller;

import gtruty.sanescobar.dao.AnimalDao;
import gtruty.sanescobar.dao.AvailableBuildingDao;
import gtruty.sanescobar.dao.BuildingDao;
import gtruty.sanescobar.dao.PlantsDao;
import gtruty.sanescobar.dao.startlocation.*;
import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.GameModel;
import gtruty.sanescobar.model.field.NumberOfField;
import gtruty.sanescobar.service.*;
import gtruty.sanescobar.service.location.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class GameViewController {

    @Value("${Gorlice}")
    private String title;

    @Autowired
    GameService gameService;

    @Autowired
    BuildingService buildingService;

    @Autowired
    PlantService plantService;

    @Autowired
    PlantsDao plantsDao;

    @Autowired
    BuildingDao buildingDao;

    @Autowired
    AnimalDao animalDao;

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
    GoodsCentralService goodsCentralService;

    @Autowired
    GoodsEastService goodsEastService;

    @Autowired
    GoodsNorthService goodsNorthService;

    @Autowired
    GoodsSouthService goodsSouthService;

    @Autowired
    GoodsWestService goodsWestService;

    @Autowired
    FieldCentralDao fieldCentralDao;

    @Autowired
    FieldEastDao fieldEastDao;

    @Autowired
    FieldNorthDao fieldNorthDao;

    @Autowired
    FieldSouthDao fieldSouthDao;

    @Autowired
    FieldWestDao fieldWestDao;

    @Autowired
    BuildingCentralDao buildingCentralDao;

    @Autowired
    BuildingEastDao buildingEastDao;

    @Autowired
    BuildingNorthDao buildingNorthDao;

    @Autowired
    BuildingSouthDao buildingSouthDao;

    @Autowired
    BuildingWestDao buildingWestDao;

    @Autowired
    GoodsCentralDao goodsCentralDao;

    @Autowired
    GoodsEastDao goodsEastDao;

    @Autowired
    GoodsNorthDao goodsNorthDao;

    @Autowired
    GoodsSouthDao goodsSouthDao;

    @Autowired
    GoodsWestDao goodsWestDao;

    @Autowired
    FieldsOfStartService fieldsOfStartService;

    @Autowired
    VilageService vilageService;
    //GameService gameService;

    @Autowired
    BuildingAvailableService availableBuildingService;

    @Autowired
    AvailableBuildingDao availableBuildingDao;

    @GetMapping("/gameView")
    public String startPage(Model model) {

        GameModel gameModel = new GameModel();
        VilageEntity vilage = vilageService.getAnyVilage();
        gameService.saveVilage(gameModel);
        gameService.startVilageLoaded(vilage, model);
        gameService.totalArea(vilage, gameModel);
        gameService.agrarSystem(gameModel);
        gameService.totalMerchant(vilage, gameModel);
        gameService.gameIncome(gameModel, vilage);
        gameService.availableToBuyFirstBuilding(gameModel, model);
        gameService.availableToBuyFirstField(gameModel,model);




        if (gameService.getModel() == null)
            gameService.setModel(gameModel);
        updateViewModel(model, gameService.getModel());


        return "gameView";
    }

    private void updateViewModel(Model model/*, String vilageName, Long locationId*/, GameModel gameModel) {
        // model.addAttribute("nazwa", vilageName);
        // model.addAttribute("lokalization", locationId);
        model.addAttribute("game", gameModel);


   /* @PostMapping("/gameView")
    public String nextTurn(@ModelAttribute("gameModel") GameModel gameModel, @ModelAttribute("buildings") List<BuildingsEntity> buildings, @ModelAttribute("nazwa") String name, Model model) {
//Logika odpowiadająca za obliczaie modyfikatorów
        gameModel.setAgrarsystem(gameModel.agrarSystem());
        //gameService.calculateIncome(gameModel);
        gameModel.setTurnNumber(gameModel.getTurnNumber() + 1);
        updateViewModel(model, name);
        return "gameView";*/
    }

    @PostMapping("/gameView")
    public String nextTurn(@ModelAttribute("game") GameModel gameModel,
                           Model model) {
        gameModel.setTurnNumber(gameModel.getTurnNumber() + 1);
        gameService.saveIntoTabela(gameModel.getBuildingName());
        gameService.setModel(gameModel);
        updateViewModel(model, gameService.getModel());
        return "redirect:/event";
    }
}






