package gtruty.sanescobar.model;


import gtruty.sanescobar.entities.VilageEntity;
import org.springframework.ui.Model;

import java.math.BigDecimal;


public interface GameMetod {

    /*  void startVilage(VilageEntity vilage, Model model, FieldsOfStartService fieldsOfStartService, BuildingWestService buildingWestService, BuildingEastService buildingEastService, BuildingNorthService buildingNorthService, BuildingSouthService buildingSouthService, BuildingCentralService buildingCentralService) ;
     */
    void startVilageLoaded(GameModel gameModel, Model model);

    void totalArea(GameModel gameModel);

    void agrarSystem(GameModel gameModel);

    void totalMerchant(GameModel gameModel);

    BigDecimal toZero(BigDecimal bigDecimal);

    void gameIncome(GameModel gameModel);

    void availableToBuyFirstBuilding(GameModel gameModel, Model model);

    void availableToBuyFirstField(GameModel gameModel, Model model);

    void saveVilage(GameModel gameModel);

    void deleteDoubleGoods(GameModel gameModel, Model model);

    void addFields(GameModel gameModel);

    void addNewGoods(GameModel gameModel);

    void addNewBuilding(GameModel gameModel, Model model);

    void saveGoods(VilageEntity vilage, GameModel gameModel);

    void sumBuying(GameModel gameModel);

    void nextTurnMoney(GameModel gameModel);

    void typeOfVilage(GameModel gameModel);

    void startMoney(GameModel gameModel);

    void addSupplyedBuilding(GameModel gameModel);

    void supplyedField(Model model);

    void addSupplyedField(GameModel gameModel);

    void availableGoodsToSell(GameModel gameModel);

    void createBuildingTable();

    void createLocationBuildingTable();

    void createAnimalTable();

    void createLocationFieldTable();

    void createFieldTable();

    void createPlantTable();

    void createLocationGoods();

    void createEventTable();

    void restart(GameModel gameModel);
}
