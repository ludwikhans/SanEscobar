package gtruty.sanescobar.model;


import gtruty.sanescobar.dao.startlocation.*;
import gtruty.sanescobar.entities.VilageEntity;

import gtruty.sanescobar.service.FieldsOfStartService;
import gtruty.sanescobar.service.location.*;
import org.springframework.ui.Model;


public interface GameMetod {

    void startVilage(VilageEntity vilage, Model model, FieldsOfStartService fieldsOfStartService, BuildingWestService buildingWestService, BuildingEastService buildingEastService, BuildingNorthService buildingNorthService, BuildingSouthService buildingSouthService, BuildingCentralService buildingCentralService) ;

    void startVilageLoaded(VilageEntity vilage, Model model,BuildingWestService buildingWestService, BuildingEastService buildingEastService, BuildingNorthService buildingNorthService, BuildingSouthService buildingSouthService, BuildingCentralService buildingCentralService,FieldWestService fieldWestService, FieldEastService fieldEastService, FieldNorthService fieldNorthService, FieldSouthService fieldSouthService, FieldCentralService fieldCentralService, GoodsCentralService goodsCentralService, GoodsEastService goodsEastService, GoodsNorthService goodsNorthService, GoodsSouthService goodsSouthService, GoodsWestService goodsWestService) ;

    void totalArea(VilageEntity vilage, GameModel gameModel, FieldNorthDao fieldNorthDao, FieldEastDao fieldEastDao, FieldCentralDao fieldCentralDao, FieldSouthDao fieldSouthDao, FieldWestDao fieldWestDao);

    void agrarSystem(GameModel gameModel);

    void totalMerchant(VilageEntity vilage,GameModel gameModel,BuildingCentralDao buildingCentralDao,BuildingEastDao buildingEastDao, BuildingNorthDao buildingNorthDao, BuildingSouthDao buildingSouthDao, BuildingWestDao buildingWestDao, GoodsCentralDao goodsCentralDao, GoodsEastDao goodsEastDao, GoodsNorthDao goodsNorthDao, GoodsSouthDao goodsSouthDao, GoodsWestDao goodsWestDao );



}
