package gtruty.sanescobar.controller;

import gtruty.sanescobar.dao.AnimalDao;
import gtruty.sanescobar.dao.BuildingDao;
import gtruty.sanescobar.dao.PlantsDao;
import gtruty.sanescobar.dao.startlocation.*;
import gtruty.sanescobar.entities.AnimalsEntity;
import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldEastEntity;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsEastEntities;
import gtruty.sanescobar.entities.PlaceOfStart.StartFieldEntity;
import gtruty.sanescobar.entities.PlantsEntity;
import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.GameModel;
import gtruty.sanescobar.service.BuildingService;
import gtruty.sanescobar.service.FieldsOfStartService;
import gtruty.sanescobar.service.VilageService;
import gtruty.sanescobar.service.location.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class GameViewController {

    @Value("${Gorlice}")
    private String title;

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


    @GetMapping("/gameView")
    public String startPage(Model model) {


        List<StartFieldEntity> startField = fieldsOfStartService.getAllData();
        model.addAttribute("kurczak", startField);
        // Map<String,Long> startFieldMap = startField.stream().collect(Collectors.groupingBy(FieldsOfMeadowEntity::getName, Collectors.counting()));


        VilageEntity vilage = vilageService.getAnyVilage();
        model.addAttribute("lokalizacja", vilage.getLocationId());
        GameModel gameModel = new GameModel();
        gameModel.startVilageLoaded(vilage, model, buildingWestService, buildingEastService, buildingNorthService, buildingSouthService, buildingCentralService, fieldWestService, fieldEastService, fieldNorthService, fieldSouthService, fieldCentralService, goodsCentralService, goodsEastService, goodsNorthService, goodsSouthService, goodsWestService);
        gameModel.totalArea(vilage, gameModel, fieldNorthDao, fieldEastDao, fieldCentralDao, fieldSouthDao, fieldWestDao);
        gameModel.agrarSystem(gameModel);
        gameModel.totalMerchant(vilage, gameModel, buildingCentralDao, buildingEastDao, buildingNorthDao, buildingSouthDao, buildingWestDao, goodsCentralDao, goodsEastDao, goodsNorthDao, goodsSouthDao, goodsWestDao);
        gameModel.gameIncome(fieldCentralDao, fieldEastDao, fieldNorthDao, fieldSouthDao, fieldWestDao, goodsCentralDao, goodsEastDao, goodsNorthDao, goodsSouthDao, goodsWestDao, goodsCentralService, goodsEastService, goodsNorthService, goodsSouthService, goodsWestService, plantsDao, buildingDao, animalDao, gameModel, vilage);





        model.addAttribute("game", gameModel);
        updateViewModel(model, vilage.getName(), vilage.getLocationId());


        //  model.addAttribute("startField",fieldStartService.getAllData());
        //model.addAttribute("totalArea",fieldStartService.total());
        //  model.addAttribute("fieldCategory",startFieldMap.keySet());
        //  model.addAttribute("fieldCategoryValues",startFieldMap.values());

        return "gameView";
    }

    private void updateViewModel(Model model, String vilageName, Long locationId) {
        model.addAttribute("nazwa", vilageName);
        model.addAttribute("lokalization", locationId);
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






