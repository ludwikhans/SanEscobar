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
    VilageService vilageService;

    @Autowired
    BuildingAvailableService availableBuildingService;

    @Autowired
    AvailableBuildingDao availableBuildingDao;

    @Autowired
    GoodsAvailableService goodsAvailableService;

    @Autowired
    GoodsAvailableDao goodsAvailableDao;

    @Autowired
    BuildingSupplyService buildingSupplyService;

    @ModelAttribute("game")
    public GameModel initiateGameModel() {
        return new GameModel();
    }

    @GetMapping("/gameView")
    public String startPage(Model model, @ModelAttribute("game") GameModel gameModel) {
        VilageEntity vilage = vilageService.getAnyVilage();

        gameService.saveVilage(gameModel);
        gameService.startVilageLoaded(vilage, model);
        gameService.totalArea(vilage, gameModel);
        gameService.gameIncome(gameModel);
        gameService.agrarSystem(gameModel);
        gameService.totalMerchant(vilage, gameModel);
        gameService.typeOfVilage(gameModel, vilage);
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






