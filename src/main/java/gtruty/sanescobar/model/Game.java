package gtruty.sanescobar.model;

import gtruty.sanescobar.dao.startlocation.*;
import gtruty.sanescobar.entities.PlaceOfStart.StartFieldEntity;
import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.field.FieldsModelOfMeadow;
import gtruty.sanescobar.model.field.FieldsModelOfPloughtFields;
import gtruty.sanescobar.service.FieldsOfStartService;
import gtruty.sanescobar.service.VilageService;
import gtruty.sanescobar.service.location.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import java.util.List;

public class Game implements GameMetod{

    @Override
    public void startVilage(VilageEntity vilage, Model model, FieldsOfStartService fieldsOfStartService, BuildingWestService buildingWestService, BuildingEastService buildingEastService, BuildingNorthService buildingNorthService, BuildingSouthService buildingSouthService, BuildingCentralService buildingCentralService) {

        if (vilage.getLocationId() == 1) {
            model.addAttribute("buildings", buildingNorthService.getAllData());


            for (int i = 0; i < 27; i++) {

                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow();
                fieldsOfStartService.save(meadow.getName(),meadow.getCostOfBuying(),meadow.getArea(),meadow.getInfo(),meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields("Pszenica Ozima");
                fieldsOfStartService.save(ploughtFields.getName(),ploughtFields.getCostOfBuying(),ploughtFields.getArea(),ploughtFields.getInfo(),ploughtFields.getSeed());
            }
            List<StartFieldEntity> startFieldEntity = fieldsOfStartService.getAllData();
            model.addAttribute("fields",startFieldEntity);

        } else if (vilage.getLocationId() == 2) {
            model.addAttribute("buildings", buildingEastService.getAllData());

            for (int i = 0; i < 27; i++) {

                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow();
                fieldsOfStartService.save(meadow.getName(),meadow.getCostOfBuying(),meadow.getArea(),meadow.getInfo(),meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields("Owies");
                fieldsOfStartService.save(ploughtFields.getName(),ploughtFields.getCostOfBuying(),ploughtFields.getArea(),ploughtFields.getInfo(),ploughtFields.getSeed());
            }
            model.addAttribute("fields",fieldsOfStartService.getAllData());

        } else if (vilage.getLocationId() == 3) {
            model.addAttribute("buildings", buildingCentralService.getAllData());

            for (int i = 0; i < 27; i++) {

                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow();
                fieldsOfStartService.save(meadow.getName(),meadow.getCostOfBuying(),meadow.getArea(),meadow.getInfo(),meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields("Pszenica Jara");
                fieldsOfStartService.save(ploughtFields.getName(),ploughtFields.getCostOfBuying(),ploughtFields.getArea(),ploughtFields.getInfo(),ploughtFields.getSeed());
            }
            model.addAttribute("fields",fieldsOfStartService.getAllData());

        } else if (vilage.getLocationId() == 4) {
            model.addAttribute("buildings", buildingSouthService.getAllData());

            for (int i = 0; i < 27; i++) {

                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow();
                fieldsOfStartService.save(meadow.getName(),meadow.getCostOfBuying(),meadow.getArea(),meadow.getInfo(),meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields("Jęczmień");
                fieldsOfStartService.save(ploughtFields.getName(),ploughtFields.getCostOfBuying(),ploughtFields.getArea(),ploughtFields.getInfo(),ploughtFields.getSeed());
            }
            model.addAttribute("fields",fieldsOfStartService.getAllData());

        } else if (vilage.getLocationId() == 5) {
            model.addAttribute("buildings", buildingWestService.getAllData());


            for (int i = 0; i < 27; i++) {

                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow();
                fieldsOfStartService.save(meadow.getName(),meadow.getCostOfBuying(),meadow.getArea(),meadow.getInfo(),meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields("Żyto");
                fieldsOfStartService.save(ploughtFields.getName(),ploughtFields.getCostOfBuying(),ploughtFields.getArea(),ploughtFields.getInfo(),ploughtFields.getSeed());
            }
            model.addAttribute("fields",fieldsOfStartService.getAllData());
        }
    }

    @Override
    public void startVilageLoaded(VilageEntity vilage, Model model, BuildingWestService buildingWestService, BuildingEastService buildingEastService, BuildingNorthService buildingNorthService, BuildingSouthService buildingSouthService, BuildingCentralService buildingCentralService, FieldWestService fieldWestService, FieldEastService fieldEastService, FieldNorthService fieldNorthService, FieldSouthService fieldSouthService, FieldCentralService fieldCentralService, GoodsCentralService goodsCentralService, GoodsEastService goodsEastService, GoodsNorthService goodsNorthService, GoodsSouthService goodsSouthService, GoodsWestService goodsWestService) {
        if (vilage.getLocationId() == 1) {
            model.addAttribute("buildings", buildingNorthService.getAllData());
            model.addAttribute("fields", fieldNorthService.getAllData());
            model.addAttribute("goods",goodsNorthService.getAllData());

        } else if (vilage.getLocationId() == 2) {
            model.addAttribute("buildings", buildingEastService.getAllData());
            model.addAttribute("fields", fieldEastService.getAllData());
            model.addAttribute("goods",goodsEastService.getAllData());

        } else if (vilage.getLocationId() == 3) {
            model.addAttribute("buildings", buildingCentralService.getAllData());
            model.addAttribute("fields", fieldCentralService.getAllData());
            model.addAttribute("goods",goodsCentralService.getAllData());

        } else if (vilage.getLocationId() == 4) {
            model.addAttribute("buildings", buildingSouthService.getAllData());
            model.addAttribute("fields", fieldSouthService.getAllData());
            model.addAttribute("goods",goodsSouthService.getAllData());

        } else if (vilage.getLocationId() == 5) {
            model.addAttribute("buildings", buildingWestService.getAllData());
            model.addAttribute("fields", fieldWestService.getAllData());
            model.addAttribute("goods",goodsWestService.getAllData());
        }
    }



    @Override
    public void totalArea(VilageEntity vilage, GameModel gameModel, FieldNorthDao fieldNorthDao, FieldEastDao fieldEastDao, FieldCentralDao fieldCentralDao,FieldSouthDao fieldSouthDao, FieldWestDao fieldWestDao) {

        if (vilage.getLocationId() == 1) {
            int areaSum = fieldNorthDao.sumCreditAmount();
            gameModel.setArea(areaSum);


        } else if (vilage.getLocationId() == 2) {
            int areaSum = fieldEastDao.sumCreditAmount();
            gameModel.setArea(areaSum);

        } else if (vilage.getLocationId() == 3) {
            int areaSum = fieldCentralDao.sumCreditAmount();
            gameModel.setArea(areaSum);

        } else if (vilage.getLocationId() == 4) {
            int areaSum = fieldSouthDao.sumCreditAmount();
            gameModel.setArea(areaSum);

        } else if (vilage.getLocationId() == 5) {
            int areaSum = fieldWestDao.sumCreditAmount();
            gameModel.setArea(areaSum);
        }
    }

    @Override
    public void agrarSystem(GameModel gameModel) {

        int area = gameModel.getArea();
        String system;
        if (area > 228){
            system = "Trójpolówka";
        }
        system = "Dwópolówka";
        gameModel.setAgrarsystem(system);

    }

    @Override
    public void totalMerchant(VilageEntity vilage,GameModel gameModel,BuildingCentralDao buildingCentralDao,BuildingEastDao buildingEastDao, BuildingNorthDao buildingNorthDao, BuildingSouthDao buildingSouthDao, BuildingWestDao buildingWestDao, GoodsCentralDao goodsCentralDao, GoodsEastDao goodsEastDao, GoodsNorthDao goodsNorthDao, GoodsSouthDao goodsSouthDao, GoodsWestDao goodsWestDao ) {


        if (vilage.getLocationId() == 1) {
            int merchant = buildingNorthDao.sumCreditAmount();
            gameModel.setMerchant(merchant);
            int usingMerchant = goodsNorthDao.sumCreditAmount();
            gameModel.setUsingMerchant(usingMerchant);
            int unoccupiedMerchant = (merchant - usingMerchant);
            gameModel.setUnoccupiedMerchant(unoccupiedMerchant);


        } else if (vilage.getLocationId() == 2) {
            int merchant = buildingEastDao.sumCreditAmount();
            gameModel.setMerchant(merchant);
            int usingMerchant = goodsEastDao.sumCreditAmount();
            gameModel.setUsingMerchant(usingMerchant);
            int unoccupiedMerchant = (merchant - usingMerchant);
            gameModel.setUnoccupiedMerchant(unoccupiedMerchant);

        } else if (vilage.getLocationId() == 3) {
            int merchant = buildingCentralDao.sumCreditAmount();
            gameModel.setMerchant(merchant);
            int usingMerchant = goodsCentralDao.sumCreditAmount();
            gameModel.setUsingMerchant(usingMerchant);
            int unoccupiedMerchant = (merchant - usingMerchant);
            gameModel.setUnoccupiedMerchant(unoccupiedMerchant);

        } else if (vilage.getLocationId() == 4) {
            int merchant = buildingSouthDao.sumCreditAmount();
            gameModel.setMerchant(merchant);
            int usingMerchant = goodsSouthDao.sumCreditAmount();
            gameModel.setUsingMerchant(usingMerchant);
            int unoccupiedMerchant = (merchant - usingMerchant);
            gameModel.setUnoccupiedMerchant(unoccupiedMerchant);

        } else if (vilage.getLocationId() == 5) {
            int merchant = buildingWestDao.sumCreditAmount();
            gameModel.setMerchant(merchant);
            int usingMerchant = goodsWestDao.sumCreditAmount();
            gameModel.setUsingMerchant(usingMerchant);
            int unoccupiedMerchant = (merchant - usingMerchant);
            gameModel.setUnoccupiedMerchant(unoccupiedMerchant);
        }




    }

}
