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

    void startVilage(VilageEntity vilage, Model model, FieldsOfStartService fieldsOfStartService, BuildingWestService buildingWestService, BuildingEastService buildingEastService, BuildingNorthService buildingNorthService, BuildingSouthService buildingSouthService, BuildingCentralService buildingCentralService) ;

    void startVilageLoaded(VilageEntity vilage, Model model,BuildingWestService buildingWestService, BuildingEastService buildingEastService, BuildingNorthService buildingNorthService, BuildingSouthService buildingSouthService, BuildingCentralService buildingCentralService,FieldWestService fieldWestService, FieldEastService fieldEastService, FieldNorthService fieldNorthService, FieldSouthService fieldSouthService, FieldCentralService fieldCentralService, GoodsCentralService goodsCentralService, GoodsEastService goodsEastService, GoodsNorthService goodsNorthService, GoodsSouthService goodsSouthService, GoodsWestService goodsWestService) ;

    void totalArea(VilageEntity vilage, GameModel gameModel, FieldNorthDao fieldNorthDao, FieldEastDao fieldEastDao, FieldCentralDao fieldCentralDao, FieldSouthDao fieldSouthDao, FieldWestDao fieldWestDao);

    void agrarSystem(GameModel gameModel);

    void totalMerchant(VilageEntity vilage,GameModel gameModel,BuildingCentralDao buildingCentralDao,BuildingEastDao buildingEastDao, BuildingNorthDao buildingNorthDao, BuildingSouthDao buildingSouthDao, BuildingWestDao buildingWestDao, GoodsCentralDao goodsCentralDao, GoodsEastDao goodsEastDao, GoodsNorthDao goodsNorthDao, GoodsSouthDao goodsSouthDao, GoodsWestDao goodsWestDao );

    BigDecimal toZero (BigDecimal bigDecimal);

    void gameIncome (FieldCentralDao fieldCentralDao, FieldEastDao fieldEastDao, FieldNorthDao fieldNorthDao, FieldSouthDao fieldSouthDao, FieldWestDao fieldWestDao,
                     GoodsCentralDao goodsCentralDao, GoodsEastDao goodsEastDao, GoodsNorthDao goodsNorthDao, GoodsSouthDao goodsSouthDao, GoodsWestDao goodsWestDao,
                     GoodsCentralService goodsCentralService, GoodsEastService goodsEastService, GoodsNorthService goodsNorthService, GoodsSouthService goodsSouthService, GoodsWestService goodsWestService,
                     PlantsDao plantsDao, BuildingDao buildingDao, AnimalDao animalDao, GameModel gameModel, VilageEntity vilage);



}
