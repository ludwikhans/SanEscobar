package gtruty.sanescobar.model;


import gtruty.sanescobar.dao.AnimalDao;
import gtruty.sanescobar.dao.BuildingDao;
import gtruty.sanescobar.dao.PlantsDao;
import gtruty.sanescobar.dao.startlocation.*;
import gtruty.sanescobar.entities.VilageEntity;

import gtruty.sanescobar.service.FieldsOfStartService;
import gtruty.sanescobar.service.location.*;
import org.springframework.ui.Model;

import java.math.BigDecimal;


public interface GameMetod {

  /*  void startVilage(VilageEntity vilage, Model model, FieldsOfStartService fieldsOfStartService, BuildingWestService buildingWestService, BuildingEastService buildingEastService, BuildingNorthService buildingNorthService, BuildingSouthService buildingSouthService, BuildingCentralService buildingCentralService) ;
*/
    void startVilageLoaded(VilageEntity vilage, Model model) ;

    void totalArea(VilageEntity vilage, GameModel gameModel);

    void agrarSystem(GameModel gameModel);

    void totalMerchant(VilageEntity vilage,GameModel gameModel);

    BigDecimal toZero (BigDecimal bigDecimal);

    void gameIncome(GameModel gameModel, VilageEntity vilage);

    void availableToBuyBuilding(GameModel gameModel, Model model);

    void saveVilage(GameModel gameModel);
}
