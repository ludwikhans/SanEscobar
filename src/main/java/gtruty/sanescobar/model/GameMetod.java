package gtruty.sanescobar.model;


import gtruty.sanescobar.dao.AnimalDao;
import gtruty.sanescobar.dao.BuildingDao;
import gtruty.sanescobar.dao.PlantsDao;
import gtruty.sanescobar.dao.startlocation.*;
import gtruty.sanescobar.entities.VilageEntity;


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

    void gameIncome(GameModel gameModel);

    void availableToBuyFirstBuilding(GameModel gameModel, Model model);

    void availableToBuyFirstField (GameModel gameModel, Model model);

    void saveVilage(GameModel gameModel);

    void deleteDoubleGoods(GameModel gameModel,Model model);

    void addFields(GameModel gameModel, VilageEntity vilage);

    void addNewGoods(GameModel gameModel);

    void addNewBuilding (VilageEntity vilage,GameModel gameModel, Model model );

    void saveGoods(VilageEntity vilage, GameModel gameModel);

    void  sumBuying(GameModel gameModel);

    void  nextTurnMoney(GameModel gameModel);

    void typeOfVilage(GameModel gameModel, VilageEntity vilage);

    void startMoney(GameModel gameModel);

    void addSupplyedBuilding (GameModel gameModel);

    void supplyedField(Model model);

    void addSupplyedField (GameModel gameModel);

    void availableGoodsToSell(GameModel gameModel);
}
