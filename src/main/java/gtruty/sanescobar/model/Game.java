package gtruty.sanescobar.model;

import gtruty.sanescobar.dao.AnimalDao;
import gtruty.sanescobar.dao.BuildingDao;
import gtruty.sanescobar.dao.PlantsDao;
import gtruty.sanescobar.dao.startlocation.*;
import gtruty.sanescobar.entities.AnimalsEntity;
import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.entities.PlaceOfStart.*;
import gtruty.sanescobar.entities.PlantsEntity;
import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.field.FieldsModelOfMeadow;
import gtruty.sanescobar.model.field.FieldsModelOfPloughtFields;
import gtruty.sanescobar.service.FieldsOfStartService;
import gtruty.sanescobar.service.location.*;
import org.springframework.ui.Model;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

    @Override
    public BigDecimal toZero(BigDecimal bigDecimal) {
        if (bigDecimal == null){
            return new BigDecimal(0);
        }
        return bigDecimal;
    }

    @Override
    public void gameIncome(FieldCentralDao fieldCentralDao, FieldEastDao fieldEastDao, FieldNorthDao fieldNorthDao, FieldSouthDao fieldSouthDao, FieldWestDao fieldWestDao,
                           GoodsCentralDao goodsCentralDao, GoodsEastDao goodsEastDao, GoodsNorthDao goodsNorthDao, GoodsSouthDao goodsSouthDao, GoodsWestDao goodsWestDao,
                           GoodsCentralService goodsCentralService, GoodsEastService goodsEastService, GoodsNorthService goodsNorthService, GoodsSouthService goodsSouthService, GoodsWestService goodsWestService,
                           PlantsDao plantsDao, BuildingDao buildingDao, AnimalDao animalDao, GameModel gameModel, VilageEntity vilage) {



        if (vilage.getLocationId() == 1) {
            List<GoodsNorthEntities> theGoods = goodsNorthService.getAllData();
            for (int j = 1; j <= theGoods.size(); j++) {
                GoodsNorthEntities goodsNorthEntities = goodsNorthDao.findById(j);
                String nameOfProduct = goodsNorthEntities.getName();
                if (goodsNorthEntities.getTyp() == 1) {
                    PlantsEntity plantsEntity = plantsDao.findByName(nameOfProduct);
                    BigDecimal profitPerHectar = plantsEntity.getMoneyProfit();
                    Double harvest = plantsEntity.getHarvest();
                    BigDecimal harvestPerHectar = BigDecimal.valueOf(harvest);
                    List<FieldNorthEntity> fieldNorthEntity = fieldNorthDao.findAllBySeed(nameOfProduct);
                    int area = 0;
                    for (int i = 0; i < fieldNorthEntity.size(); i++) {
                        int partOfArea = fieldNorthEntity.get(i).getArea();
                        area += partOfArea;
                    }
                    BigDecimal plantArea = BigDecimal.valueOf(area);
                    BigDecimal totalHarvest = plantArea.multiply(harvestPerHectar);
                    BigDecimal incomFromFields = profitPerHectar.multiply(totalHarvest);
                    BigDecimal totalIncomFromFields = gameModel.getIncomFromFields();
                    if (totalIncomFromFields == null) {
                        gameModel.setIncomFromFields(incomFromFields);
                    } else {
                        totalIncomFromFields = totalIncomFromFields.add(incomFromFields);
                        gameModel.setIncomFromFields(totalIncomFromFields);
                    }

                } else {
                    BuildingsEntity buildings = buildingDao.findByProducts1(nameOfProduct);
                    if (buildings != null) {
                        BigDecimal incomFromBuilding = buildings.getMoneyProfit1();
                        BigDecimal totalIncomFromBuilding = gameModel.getIncomFromBuilding();

                        if (totalIncomFromBuilding == null) {
                            gameModel.setIncomFromBuilding(incomFromBuilding);
                        } else {
                            totalIncomFromBuilding = totalIncomFromBuilding.add(incomFromBuilding);
                            gameModel.setIncomFromBuilding(totalIncomFromBuilding);
                        }

                    } else {
                        AnimalsEntity animalsEntity = animalDao.findByName(nameOfProduct);
                        BigDecimal incomFromAnimal = animalsEntity.getMoneyProfit1();
                        BigDecimal totalIncomFromAnimal = gameModel.getIncomFromAnimal();

                        if (totalIncomFromAnimal == null) {
                            gameModel.setIncomFromFields(incomFromAnimal);
                        } else {
                            totalIncomFromAnimal = totalIncomFromAnimal.add(incomFromAnimal);
                            gameModel.setIncomFromAnimal(totalIncomFromAnimal);
                        }
                    }
                }
                BigDecimal field = gameModel.toZero(gameModel.getIncomFromFields());
                BigDecimal building = gameModel.toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = gameModel.toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncome = gameModel.toZero(gameModel.getTotalIncome());
                totalIncome = totalIncome.add(field.add(building.add(animal))).setScale(2, RoundingMode.HALF_UP);
                gameModel.setTotalIncome(totalIncome);
            }

        } else if (vilage.getLocationId() == 2) {

            List<GoodsEastEntities> theGoods = goodsEastService.getAllData();
            for (int j = 1; j <= theGoods.size(); j++) {
                GoodsEastEntities goodsEastEntities = goodsEastDao.findById(j);
                String nameOfProduct = goodsEastEntities.getName();
                if (goodsEastEntities.getTyp() == 1) {
                    PlantsEntity plantsEntity = plantsDao.findByName(nameOfProduct);
                    BigDecimal profitPerHectar = plantsEntity.getMoneyProfit();
                    Double harvest = plantsEntity.getHarvest();
                    BigDecimal harvestPerHectar = BigDecimal.valueOf(harvest);
                    List<FieldEastEntity> fieldEastEntity = fieldEastDao.findAllBySeed(nameOfProduct);
                    int area = 0;
                    for (int i = 0; i < fieldEastEntity.size(); i++) {
                        int partOfArea = fieldEastEntity.get(i).getArea();
                        area += partOfArea;
                    }
                    BigDecimal plantArea = BigDecimal.valueOf(area);
                    BigDecimal totalHarvest = plantArea.multiply(harvestPerHectar);
                    BigDecimal incomFromFields = profitPerHectar.multiply(totalHarvest);
                    BigDecimal totalIncomFromFields = gameModel.getIncomFromFields();
                    if (totalIncomFromFields == null) {
                        gameModel.setIncomFromFields(incomFromFields);
                    } else {
                        totalIncomFromFields = totalIncomFromFields.add(incomFromFields);
                        gameModel.setIncomFromFields(totalIncomFromFields);
                    }

                } else {
                    BuildingsEntity buildings = buildingDao.findByProducts1(nameOfProduct);
                    if (buildings != null) {
                        BigDecimal incomFromBuilding = buildings.getMoneyProfit1();
                        BigDecimal totalIncomFromBuilding = gameModel.getIncomFromBuilding();

                        if (totalIncomFromBuilding == null) {
                            gameModel.setIncomFromBuilding(incomFromBuilding);
                        } else {
                            totalIncomFromBuilding = totalIncomFromBuilding.add(incomFromBuilding);
                            gameModel.setIncomFromBuilding(totalIncomFromBuilding);
                        }

                    } else {
                        AnimalsEntity animalsEntity = animalDao.findByName(nameOfProduct);
                        BigDecimal incomFromAnimal = animalsEntity.getMoneyProfit1();
                        BigDecimal totalIncomFromAnimal = gameModel.getIncomFromAnimal();

                        if (totalIncomFromAnimal == null) {
                            gameModel.setIncomFromFields(incomFromAnimal);
                        } else {
                            totalIncomFromAnimal = totalIncomFromAnimal.add(incomFromAnimal);
                            gameModel.setIncomFromAnimal(totalIncomFromAnimal);
                        }
                    }
                }
                BigDecimal field = gameModel.toZero(gameModel.getIncomFromFields());
                BigDecimal building = gameModel.toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = gameModel.toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncome = gameModel.toZero(gameModel.getTotalIncome());
                totalIncome = totalIncome.add(field.add(building.add(animal))).setScale(2, RoundingMode.HALF_UP);
                gameModel.setTotalIncome(totalIncome);
            }

        } else if (vilage.getLocationId() == 3) {

            List<GoodsCentralEntities> theGoods = goodsCentralService.getAllData();
            for (int j = 1; j <= theGoods.size(); j++) {
                GoodsCentralEntities goodsCentralEntities = goodsCentralDao.findById(j);
                String nameOfProduct = goodsCentralEntities.getName();
                if (goodsCentralEntities.getTyp() == 1) {
                    PlantsEntity plantsEntity = plantsDao.findByName(nameOfProduct);
                    BigDecimal profitPerHectar = plantsEntity.getMoneyProfit();
                    Double harvest = plantsEntity.getHarvest();
                    BigDecimal harvestPerHectar = BigDecimal.valueOf(harvest);
                    List<FieldCentralEntity> fieldCentralEntity = fieldCentralDao.findAllBySeed(nameOfProduct);
                    int area = 0;
                    for (int i = 0; i < fieldCentralEntity.size(); i++) {
                        int partOfArea = fieldCentralEntity.get(i).getArea();
                        area += partOfArea;
                    }
                    BigDecimal plantArea = BigDecimal.valueOf(area);
                    BigDecimal totalHarvest = plantArea.multiply(harvestPerHectar);
                    BigDecimal incomFromFields = profitPerHectar.multiply(totalHarvest);
                    BigDecimal totalIncomFromFields = gameModel.getIncomFromFields();
                    if (totalIncomFromFields == null) {
                        gameModel.setIncomFromFields(incomFromFields);
                    } else {
                        totalIncomFromFields = totalIncomFromFields.add(incomFromFields);
                        gameModel.setIncomFromFields(totalIncomFromFields);
                    }

                } else {
                    BuildingsEntity buildings = buildingDao.findByProducts1(nameOfProduct);
                    if (buildings != null) {
                        BigDecimal incomFromBuilding = buildings.getMoneyProfit1();
                        BigDecimal totalIncomFromBuilding = gameModel.getIncomFromBuilding();

                        if (totalIncomFromBuilding == null) {
                            gameModel.setIncomFromBuilding(incomFromBuilding);
                        } else {
                            totalIncomFromBuilding = totalIncomFromBuilding.add(incomFromBuilding);
                            gameModel.setIncomFromBuilding(totalIncomFromBuilding);
                        }

                    } else {
                        AnimalsEntity animalsEntity = animalDao.findByName(nameOfProduct);
                        BigDecimal incomFromAnimal = animalsEntity.getMoneyProfit1();
                        BigDecimal totalIncomFromAnimal = gameModel.getIncomFromAnimal();

                        if (totalIncomFromAnimal == null) {
                            gameModel.setIncomFromFields(incomFromAnimal);
                        } else {
                            totalIncomFromAnimal = totalIncomFromAnimal.add(incomFromAnimal);
                            gameModel.setIncomFromAnimal(totalIncomFromAnimal);
                        }
                    }
                }
                BigDecimal field = gameModel.toZero(gameModel.getIncomFromFields());
                BigDecimal building = gameModel.toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = gameModel.toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncome = gameModel.toZero(gameModel.getTotalIncome());
                totalIncome = totalIncome.add(field.add(building.add(animal))).setScale(2, RoundingMode.HALF_UP);
                gameModel.setTotalIncome(totalIncome);
            }

        } else if (vilage.getLocationId() == 4) {

            List<GoodsSouthEntities> theGoods = goodsSouthService.getAllData();
            for (int j = 1; j <= theGoods.size(); j++) {
                GoodsSouthEntities goodsSouthEntities = goodsSouthDao.findById(j);
                String nameOfProduct = goodsSouthEntities.getName();
                if (goodsSouthEntities.getTyp() == 1) {
                    PlantsEntity plantsEntity = plantsDao.findByName(nameOfProduct);
                    BigDecimal profitPerHectar = plantsEntity.getMoneyProfit();
                    Double harvest = plantsEntity.getHarvest();
                    BigDecimal harvestPerHectar = BigDecimal.valueOf(harvest);
                    List<FieldSouthEntity> fieldSouthEntity = fieldSouthDao.findAllBySeed(nameOfProduct);
                    int area = 0;
                    for (int i = 0; i < fieldSouthEntity.size(); i++) {
                        int partOfArea = fieldSouthEntity.get(i).getArea();
                        area += partOfArea;
                    }
                    BigDecimal plantArea = BigDecimal.valueOf(area);
                    BigDecimal totalHarvest = plantArea.multiply(harvestPerHectar);
                    BigDecimal incomFromFields = profitPerHectar.multiply(totalHarvest);
                    BigDecimal totalIncomFromFields = gameModel.getIncomFromFields();
                    if (totalIncomFromFields == null) {
                        gameModel.setIncomFromFields(incomFromFields);
                    } else {
                        totalIncomFromFields = totalIncomFromFields.add(incomFromFields);
                        gameModel.setIncomFromFields(totalIncomFromFields);
                    }

                } else {
                    BuildingsEntity buildings = buildingDao.findByProducts1(nameOfProduct);
                    if (buildings != null) {
                        BigDecimal incomFromBuilding = buildings.getMoneyProfit1();
                        BigDecimal totalIncomFromBuilding = gameModel.getIncomFromBuilding();

                        if (totalIncomFromBuilding == null) {
                            gameModel.setIncomFromBuilding(incomFromBuilding);
                        } else {
                            totalIncomFromBuilding = totalIncomFromBuilding.add(incomFromBuilding);
                            gameModel.setIncomFromBuilding(totalIncomFromBuilding);
                        }

                    } else {
                        AnimalsEntity animalsEntity = animalDao.findByName(nameOfProduct);
                        BigDecimal incomFromAnimal = animalsEntity.getMoneyProfit1();
                        BigDecimal totalIncomFromAnimal = gameModel.getIncomFromAnimal();

                        if (totalIncomFromAnimal == null) {
                            gameModel.setIncomFromFields(incomFromAnimal);
                        } else {
                            totalIncomFromAnimal = totalIncomFromAnimal.add(incomFromAnimal);
                            gameModel.setIncomFromAnimal(totalIncomFromAnimal);
                        }
                    }
                }
                BigDecimal field = gameModel.toZero(gameModel.getIncomFromFields());
                BigDecimal building = gameModel.toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = gameModel.toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncome = gameModel.toZero(gameModel.getTotalIncome());
                totalIncome = totalIncome.add(field.add(building.add(animal))).setScale(2, RoundingMode.HALF_UP);
                gameModel.setTotalIncome(totalIncome);
            }

        } else if (vilage.getLocationId() == 5) {

            List<GoodsWestEntities> theGoods = goodsWestService.getAllData();
            for (int j = 1; j <= theGoods.size(); j++) {
                GoodsWestEntities goodsWestEntities = goodsWestDao.findById(j);
                String nameOfProduct = goodsWestEntities.getName();
                if (goodsWestEntities.getTyp() == 1) {
                    PlantsEntity plantsEntity = plantsDao.findByName(nameOfProduct);
                    BigDecimal profitPerHectar = plantsEntity.getMoneyProfit();
                    Double harvest = plantsEntity.getHarvest();
                    BigDecimal harvestPerHectar = BigDecimal.valueOf(harvest);
                    List<FieldWestEntity> fieldWestEntity = fieldWestDao.findAllBySeed(nameOfProduct);
                    int area = 0;
                    for (int i = 0; i < fieldWestEntity.size(); i++) {
                        int partOfArea = fieldWestEntity.get(i).getArea();
                        area += partOfArea;
                    }
                    BigDecimal plantArea = BigDecimal.valueOf(area);
                    BigDecimal totalHarvest = plantArea.multiply(harvestPerHectar);
                    BigDecimal incomFromFields = profitPerHectar.multiply(totalHarvest);
                    BigDecimal totalIncomFromFields = gameModel.getIncomFromFields();
                    if (totalIncomFromFields == null) {
                        gameModel.setIncomFromFields(incomFromFields);
                    } else {
                        totalIncomFromFields = totalIncomFromFields.add(incomFromFields);
                        gameModel.setIncomFromFields(totalIncomFromFields);
                    }

                } else {
                    BuildingsEntity buildings = buildingDao.findByProducts1(nameOfProduct);
                    if (buildings != null) {
                        BigDecimal incomFromBuilding = buildings.getMoneyProfit1();
                        BigDecimal totalIncomFromBuilding = gameModel.getIncomFromBuilding();

                        if (totalIncomFromBuilding == null) {
                            gameModel.setIncomFromBuilding(incomFromBuilding);
                        } else {
                            totalIncomFromBuilding = totalIncomFromBuilding.add(incomFromBuilding);
                            gameModel.setIncomFromBuilding(totalIncomFromBuilding);
                        }

                    } else {
                        AnimalsEntity animalsEntity = animalDao.findByName(nameOfProduct);
                        BigDecimal incomFromAnimal = animalsEntity.getMoneyProfit1();
                        BigDecimal totalIncomFromAnimal = gameModel.getIncomFromAnimal();

                        if (totalIncomFromAnimal == null) {
                            gameModel.setIncomFromFields(incomFromAnimal);
                        } else {
                            totalIncomFromAnimal = totalIncomFromAnimal.add(incomFromAnimal);
                            gameModel.setIncomFromAnimal(totalIncomFromAnimal);
                        }
                    }
                }
                BigDecimal field = gameModel.toZero(gameModel.getIncomFromFields());
                BigDecimal building = gameModel.toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = gameModel.toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncome = gameModel.toZero(gameModel.getTotalIncome());
                totalIncome = totalIncome.add(field.add(building.add(animal))).setScale(2, RoundingMode.HALF_UP);
                gameModel.setTotalIncome(totalIncome);
            }
        }







    }


}
