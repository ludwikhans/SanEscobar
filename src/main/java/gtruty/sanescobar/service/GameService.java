package gtruty.sanescobar.service;

import gtruty.sanescobar.dao.*;
import gtruty.sanescobar.dao.startlocation.*;
import gtruty.sanescobar.entities.*;
import gtruty.sanescobar.entities.PlaceOfStart.*;
import gtruty.sanescobar.model.GameMetod;
import gtruty.sanescobar.model.GameModel;
import gtruty.sanescobar.model.field.FieldsModelOfMeadow;
import gtruty.sanescobar.model.field.FieldsModelOfPloughtFields;
import gtruty.sanescobar.model.field.NumberOfField;
import gtruty.sanescobar.service.location.*;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@Service
public class GameService implements GameMetod {

    final BuildingNorthService buildingNorthService;
    final FieldNorthService fieldNorthService;
    final GoodsNorthService goodsNorthService;

    final BuildingEastService buildingEastService;
    final FieldEastService fieldEastService;
    final GoodsEastService goodsEastService;

    final BuildingWestService buildingWestService;
    final FieldWestService fieldWestService;
    final GoodsWestService goodsWestService;

    final BuildingSouthService buildingSouthService;
    final FieldSouthService fieldSouthService;
    final GoodsSouthService goodsSouthService;

    final BuildingCentralService buildingCentralService;
    final FieldCentralService fieldCentralService;
    final GoodsCentralService goodsCentralService;

    final FieldNorthDao fieldNorthDao;
    final FieldEastDao fieldEastDao;
    final FieldCentralDao fieldCentralDao;
    final FieldSouthDao fieldSouthDao;
    final FieldWestDao fieldWestDao;

    final BuildingCentralDao buildingCentralDao;
    final BuildingEastDao buildingEastDao;
    final BuildingNorthDao buildingNorthDao;
    final BuildingSouthDao buildingSouthDao;
    final BuildingWestDao buildingWestDao;

    final GoodsCentralDao goodsCentralDao;
    final GoodsEastDao goodsEastDao;
    final GoodsNorthDao goodsNorthDao;
    final GoodsSouthDao goodsSouthDao;
    final GoodsWestDao goodsWestDao;

    final PlantsDao plantsDao;
    final BuildingDao buildingDao;
    final AnimalDao animalDao;

    final BuildingService buildingService;
    final BuildingAvailableService availableBuildingService;
    final AvailableBuildingDao availableBuildingDao;

    final VilageService vilageService;

    final GoodsAvailableService goodsAvailableService;
    final GoodsAvailableDao goodsAvailableDao;

    final BuildingSupplyDao buildingSupplyDao;
    final BuildingSupplyService buildingSupplyService;

    final FieldSupplyService fieldSupplyService;
    final FieldSupplyDao fieldSupplyDao;

    public GameService(BuildingNorthService buildingNorthService, FieldNorthService fieldNorthService, GoodsNorthService goodsNorthService, BuildingEastService buildingEastService, FieldEastService fieldEastService, GoodsEastService goodsEastService, BuildingWestService buildingWestService, FieldWestService fieldWestService, GoodsWestService goodsWestService, BuildingSouthService buildingSouthService, FieldSouthService fieldSouthService, GoodsSouthService goodsSouthService, BuildingCentralService buildingCentralService, FieldCentralService fieldCentralService, GoodsCentralService goodsCentralService, FieldNorthDao fieldNorthDao, FieldEastDao fieldEastDao, FieldCentralDao fieldCentralDao, FieldSouthDao fieldSouthDao, FieldWestDao fieldWestDao, BuildingCentralDao buildingCentralDao, BuildingEastDao buildingEastDao, BuildingNorthDao buildingNorthDao, BuildingSouthDao buildingSouthDao, BuildingWestDao buildingWestDao, GoodsCentralDao goodsCentralDao, GoodsEastDao goodsEastDao, GoodsNorthDao goodsNorthDao, GoodsSouthDao goodsSouthDao, GoodsWestDao goodsWestDao, PlantsDao plantsDao, BuildingDao buildingDao, AnimalDao animalDao, BuildingService buildingService, BuildingAvailableService availableBuildingService, AvailableBuildingDao availableBuildingDao, VilageService vilageService, GoodsAvailableService goodsAvailableService, GoodsAvailableDao goodsAvailableDao, BuildingSupplyDao buildingSupplyDao, BuildingSupplyService buildingSupplyService, FieldSupplyService fieldSupplyService, FieldSupplyDao fieldSupplyDao) {
        this.buildingNorthService = buildingNorthService;
        this.fieldNorthService = fieldNorthService;
        this.goodsNorthService = goodsNorthService;
        this.buildingEastService = buildingEastService;
        this.fieldEastService = fieldEastService;
        this.goodsEastService = goodsEastService;
        this.buildingWestService = buildingWestService;
        this.fieldWestService = fieldWestService;
        this.goodsWestService = goodsWestService;
        this.buildingSouthService = buildingSouthService;
        this.fieldSouthService = fieldSouthService;
        this.goodsSouthService = goodsSouthService;
        this.buildingCentralService = buildingCentralService;
        this.fieldCentralService = fieldCentralService;
        this.goodsCentralService = goodsCentralService;
        this.fieldNorthDao = fieldNorthDao;
        this.fieldEastDao = fieldEastDao;
        this.fieldCentralDao = fieldCentralDao;
        this.fieldSouthDao = fieldSouthDao;
        this.fieldWestDao = fieldWestDao;
        this.buildingCentralDao = buildingCentralDao;
        this.buildingEastDao = buildingEastDao;
        this.buildingNorthDao = buildingNorthDao;
        this.buildingSouthDao = buildingSouthDao;
        this.buildingWestDao = buildingWestDao;
        this.goodsCentralDao = goodsCentralDao;
        this.goodsEastDao = goodsEastDao;
        this.goodsNorthDao = goodsNorthDao;
        this.goodsSouthDao = goodsSouthDao;
        this.goodsWestDao = goodsWestDao;
        this.plantsDao = plantsDao;
        this.buildingDao = buildingDao;
        this.animalDao = animalDao;
        this.buildingService = buildingService;
        this.availableBuildingService = availableBuildingService;
        this.availableBuildingDao = availableBuildingDao;
        this.vilageService = vilageService;
        this.goodsAvailableService = goodsAvailableService;
        this.goodsAvailableDao = goodsAvailableDao;
        this.buildingSupplyDao = buildingSupplyDao;
        this.buildingSupplyService = buildingSupplyService;
        this.fieldSupplyService = fieldSupplyService;
        this.fieldSupplyDao = fieldSupplyDao;
    }

    public GameModel model;


    @Override
    public void startVilageLoaded(VilageEntity vilage, Model model) {
        if (vilage.getLocationId() == 1) {
            model.addAttribute("buildings", buildingNorthService.getAllData());
            model.addAttribute("fields", fieldNorthService.getAllData());
            model.addAttribute("goods", goodsNorthService.getAllData());

        } else if (vilage.getLocationId() == 2) {
            model.addAttribute("buildings", buildingEastService.getAllData());
            model.addAttribute("fields", fieldEastService.getAllData());
            model.addAttribute("goods", goodsEastService.getAllData());

        } else if (vilage.getLocationId() == 3) {
            model.addAttribute("buildings", buildingCentralService.getAllData());
            model.addAttribute("fields", fieldCentralService.getAllData());
            model.addAttribute("goods", goodsCentralService.getAllData());

        } else if (vilage.getLocationId() == 4) {
            model.addAttribute("buildings", buildingSouthService.getAllData());
            model.addAttribute("fields", fieldSouthService.getAllData());
            model.addAttribute("goods", goodsSouthService.getAllData());

        } else if (vilage.getLocationId() == 5) {
            model.addAttribute("buildings", buildingWestService.getAllData());
            model.addAttribute("fields", fieldWestService.getAllData());
            model.addAttribute("goods", goodsWestService.getAllData());
        }
    }


    @Override
    public void totalArea(VilageEntity vilage, GameModel gameModel) {

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
        if (area > 228) {
            system = "Trójpolówka";
        }
        system = "Dwópolówka";
        gameModel.setAgrarsystem(system);

    }

    @Override
    public void totalMerchant(VilageEntity vilage, GameModel gameModel) {


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
        if (bigDecimal == null) {
            return new BigDecimal(0);
        }
        return bigDecimal;
    }

    @Override
    public void gameIncome(GameModel gameModel, VilageEntity vilage) {
        BigDecimal restartIncomFromFields = BigDecimal.valueOf(0);
        gameModel.setIncomFromFields(restartIncomFromFields);
        BigDecimal restartIncomFromBuilding = BigDecimal.valueOf(0);
        gameModel.setIncomFromBuilding(restartIncomFromBuilding);
        BigDecimal restartIncomFromAnimal = BigDecimal.valueOf(0);
        gameModel.setIncomFromAnimal(restartIncomFromAnimal);


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
                BigDecimal field = toZero(gameModel.getIncomFromFields());
                BigDecimal building = toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncomeFromPreviousTur = toZero(gameModel.getTotalIncome());
                BigDecimal newTotalIncom = field.add(building.add(animal)).setScale(2, RoundingMode.HALF_UP);
                int toIntTotalIncomeFromPreviousTur = totalIncomeFromPreviousTur.intValue();
                int toIntNewTotalIncom = newTotalIncom.intValue();
                if (toIntNewTotalIncom > toIntTotalIncomeFromPreviousTur) {
                    gameModel.setTotalIncome(newTotalIncom);
                }
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
                BigDecimal field = toZero(gameModel.getIncomFromFields());
                BigDecimal building = toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncomeFromPreviousTur = toZero(gameModel.getTotalIncome());
                BigDecimal newTotalIncom = field.add(building.add(animal)).setScale(2, RoundingMode.HALF_UP);
                int toIntTotalIncomeFromPreviousTur = totalIncomeFromPreviousTur.intValue();
                int toIntNewTotalIncom = newTotalIncom.intValue();
                if (toIntNewTotalIncom > toIntTotalIncomeFromPreviousTur) {
                    gameModel.setTotalIncome(newTotalIncom);
                }
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
                BigDecimal field = toZero(gameModel.getIncomFromFields());
                BigDecimal building = toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncomeFromPreviousTur = toZero(gameModel.getTotalIncome());
                BigDecimal newTotalIncom = field.add(building.add(animal)).setScale(2, RoundingMode.HALF_UP);
                int toIntTotalIncomeFromPreviousTur = totalIncomeFromPreviousTur.intValue();
                int toIntNewTotalIncom = newTotalIncom.intValue();
                if (toIntNewTotalIncom > toIntTotalIncomeFromPreviousTur) {
                    gameModel.setTotalIncome(newTotalIncom);
                }
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
                BigDecimal field = toZero(gameModel.getIncomFromFields());
                BigDecimal building = toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncomeFromPreviousTur = toZero(gameModel.getTotalIncome());
                BigDecimal newTotalIncom = field.add(building.add(animal)).setScale(2, RoundingMode.HALF_UP);
                int toIntTotalIncomeFromPreviousTur = totalIncomeFromPreviousTur.intValue();
                int toIntNewTotalIncom = newTotalIncom.intValue();
                if (toIntNewTotalIncom > toIntTotalIncomeFromPreviousTur) {
                    gameModel.setTotalIncome(newTotalIncom);
                }
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
                BigDecimal field = toZero(gameModel.getIncomFromFields());
                BigDecimal building = toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncomeFromPreviousTur = toZero(gameModel.getTotalIncome());
                BigDecimal newTotalIncom = field.add(building.add(animal)).setScale(2, RoundingMode.HALF_UP);
                int toIntTotalIncomeFromPreviousTur = totalIncomeFromPreviousTur.intValue();
                int toIntNewTotalIncom = newTotalIncom.intValue();
                if (toIntNewTotalIncom > toIntTotalIncomeFromPreviousTur) {
                    gameModel.setTotalIncome(newTotalIncom);
                }

            }
        }


    }


    @Override
    public void availableToBuyFirstBuilding(GameModel gameModel, Model model) {
        List<BuildingsAvailableEntity> existBuilding = availableBuildingService.getAllData();
        if (existBuilding != null) {
            availableBuildingDao.deleteAll();
        }
        BigDecimal money = toZero(gameModel.getAvailableMoney());
        int moneyInInt = money.intValue();
        List<BuildingsEntity> allBuildings = buildingService.getAllData();
        for (BuildingsEntity budynki :
                allBuildings) {
            BigDecimal cost = budynki.getCostOfBuilding();
            int costOf = cost.intValue();
            if (costOf < moneyInInt) {
                availableBuildingService.save(budynki.getName(), budynki.getCostOfBuilding(), budynki.getInfo(), budynki.getType());
            }
        }
        model.addAttribute("available", availableBuildingService.getAllData());
    }

    @Override
    public void availableToBuyFirstField(GameModel gameModel, Model model) {
        BigDecimal starMoney = toZero(gameModel.getAvailableMoney());
        int moneyOfStart = starMoney.intValue();
        int priceOfField = 100;
        int rest = moneyOfStart % priceOfField;
        int availableToBuyFields = (moneyOfStart - rest) / priceOfField;
        List<NumberOfField> amontOfField = new ArrayList<>();
        for (int i = 0; i <= availableToBuyFields; i++) {
            amontOfField.add(new NumberOfField(i));
        }
        model.addAttribute("availableToBuy", amontOfField);
    }

    @Override
    public void saveVilage(GameModel gameModel) {
        VilageEntity vilage = vilageService.getAnyVilage();
        gameModel.setVilageName(vilage.getName());
        gameModel.setLocationId(vilage.getLocationId());
    }


    @Override
    public void deleteDoubleGoods(VilageEntity vilage) {
        if (vilage.getLocationId() == 1) {
            List<String> namaGoods = new ArrayList<>();
            List<GoodsNorthEntities> northEntities = goodsNorthService.getAllData();
            for (GoodsNorthEntities cos :
                    northEntities) {
                String nameOfGoods = cos.getName();
                GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfGoods);
                if (goodsAvailableEntities != null) {
                    goodsAvailableDao.delete(goodsAvailableEntities);
                }
            }

        } else if (vilage.getLocationId() == 2) {
            List<String> namaGoods = new ArrayList<>();
            List<GoodsEastEntities> northEntities = goodsEastService.getAllData();
            for (GoodsEastEntities cos :
                    northEntities) {
                String nameOfGoods = cos.getName();
                GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfGoods);
                if (goodsAvailableEntities != null) {
                    goodsAvailableDao.delete(goodsAvailableEntities);
                }
            }

        } else if (vilage.getLocationId() == 3) {
            List<String> namaGoods = new ArrayList<>();
            List<GoodsCentralEntities> northEntities = goodsCentralService.getAllData();
            for (GoodsCentralEntities cos :
                    northEntities) {
                String nameOfGoods = cos.getName();
                GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfGoods);
                if (goodsAvailableEntities != null) {
                    goodsAvailableDao.delete(goodsAvailableEntities);
                }
            }

        } else if (vilage.getLocationId() == 4) {
            List<String> namaGoods = new ArrayList<>();
            List<GoodsSouthEntities> northEntities = goodsSouthService.getAllData();
            for (GoodsSouthEntities cos :
                    northEntities) {
                String nameOfGoods = cos.getName();
                GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfGoods);
                if (goodsAvailableEntities != null) {
                    goodsAvailableDao.delete(goodsAvailableEntities);
                }
            }

        } else if (vilage.getLocationId() == 5) {
            List<String> namaGoods = new ArrayList<>();
            List<GoodsWestEntities> northEntities = goodsWestService.getAllData();
            for (GoodsWestEntities cos :
                    northEntities) {
                String nameOfGoods = cos.getName();
                GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfGoods);
                if (goodsAvailableEntities != null) {
                    goodsAvailableDao.delete(goodsAvailableEntities);
                }
            }
        }
    }

    @Override
    public void addFields(GameModel gameModel, VilageEntity vilage) {

        if (vilage.getLocationId() == 1) {
            int howManyToFieldBuy = gameModel.getFieldsToBuy();
            if (howManyToFieldBuy != 0) {
                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow(howManyToFieldBuy);
                fieldNorthService.save(meadow.getName(), meadow.getCostOfBuying(), meadow.getArea(), meadow.getInfo(), meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields(howManyToFieldBuy);
                fieldSupplyService.save(ploughtFields.getName(), ploughtFields.getCostOfBuying(), ploughtFields.getArea(), ploughtFields.getInfo(), ploughtFields.getSeed());

            }


        } else if (vilage.getLocationId() == 2) {
            int howManyToFieldBuy = gameModel.getFieldsToBuy();
            if (howManyToFieldBuy != 0) {
                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow(howManyToFieldBuy);
                fieldEastService.save(meadow.getName(), meadow.getCostOfBuying(), meadow.getArea(), meadow.getInfo(), meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields(howManyToFieldBuy);
                fieldSupplyService.save(ploughtFields.getName(), ploughtFields.getCostOfBuying(), ploughtFields.getArea(), ploughtFields.getInfo(), ploughtFields.getSeed());
            }


        } else if (vilage.getLocationId() == 3) {
            int howManyToFieldBuy = gameModel.getFieldsToBuy();
            if (howManyToFieldBuy != 0) {
                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow(howManyToFieldBuy);
                fieldCentralService.save(meadow.getName(), meadow.getCostOfBuying(), meadow.getArea(), meadow.getInfo(), meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields(howManyToFieldBuy);
                fieldSupplyService.save(ploughtFields.getName(), ploughtFields.getCostOfBuying(), ploughtFields.getArea(), ploughtFields.getInfo(), ploughtFields.getSeed());
            }


        } else if (vilage.getLocationId() == 4) {
            int howManyToFieldBuy = gameModel.getFieldsToBuy();
            if (howManyToFieldBuy != 0) {
                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow(howManyToFieldBuy);
                fieldSouthService.save(meadow.getName(), meadow.getCostOfBuying(), meadow.getArea(), meadow.getInfo(), meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields(howManyToFieldBuy);
                fieldSupplyService.save(ploughtFields.getName(), ploughtFields.getCostOfBuying(), ploughtFields.getArea(), ploughtFields.getInfo(), ploughtFields.getSeed());

            }

        } else if (vilage.getLocationId() == 5) {
            int howManyToFieldBuy = gameModel.getFieldsToBuy();
            if (howManyToFieldBuy != 0) {
                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow(howManyToFieldBuy);
                fieldWestService.save(meadow.getName(), meadow.getCostOfBuying(), meadow.getArea(), meadow.getInfo(), meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields(howManyToFieldBuy);
                fieldSupplyService.save(ploughtFields.getName(), ploughtFields.getCostOfBuying(), ploughtFields.getArea(), ploughtFields.getInfo(), ploughtFields.getSeed());
            }
        }
    }



    @Override
    public void addNewGoods(GameModel gameModel, VilageEntity vilage) {

        if (vilage.getLocationId() == 1) {
            String nameOfNewGoods = gameModel.getGoodsName();
            if (nameOfNewGoods != null) {
                if (nameOfNewGoods != "Brak nowego towaru") {
                    GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfNewGoods);
                    GoodsNorthEntities goodsNorthEntities = goodsNorthDao.findByName(nameOfNewGoods);
                    if (goodsNorthEntities == null) {
                        goodsNorthService.save(goodsAvailableEntities.getName(), goodsAvailableEntities.getUsingMerchant(), goodsAvailableEntities.getTyp());
                    }
                }
            }


        } else if (vilage.getLocationId() == 2) {
            String nameOfNewGoods = gameModel.getGoodsName();
            if (nameOfNewGoods != null) {
                if (nameOfNewGoods != "Brak nowego towaru") {
                    GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfNewGoods);
                    GoodsEastEntities goodsEastEntities = goodsEastDao.findByName(nameOfNewGoods);
                    if (goodsEastEntities == null) {
                        goodsEastService.save(goodsAvailableEntities.getName(), goodsAvailableEntities.getUsingMerchant(), goodsAvailableEntities.getTyp());
                    }
                }
            }


        } else if (vilage.getLocationId() == 3) {
            String nameOfNewGoods = gameModel.getGoodsName();
            if (nameOfNewGoods != null) {
                if ((nameOfNewGoods != "Brak nowego towaru") || (nameOfNewGoods != null)) {
                    GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfNewGoods);
                    GoodsCentralEntities goodsCentralEntities = goodsCentralDao.findByName(nameOfNewGoods);
                    if (goodsCentralEntities == null) {
                        goodsCentralService.save(goodsAvailableEntities.getName(), goodsAvailableEntities.getUsingMerchant(), goodsAvailableEntities.getTyp());
                    }
                }
            }


        } else if (vilage.getLocationId() == 4) {
            String nameOfNewGoods = gameModel.getGoodsName();
            if (nameOfNewGoods != null) {
                if (nameOfNewGoods != "Brak nowego towaru") {
                    GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfNewGoods);
                    GoodsSouthEntities goodsSouthEntities = goodsSouthDao.findByName(nameOfNewGoods);
                    if (goodsSouthEntities == null) {
                        goodsSouthService.save(goodsAvailableEntities.getName(), goodsAvailableEntities.getUsingMerchant(), goodsAvailableEntities.getTyp());
                    }
                }

            }


        } else if (vilage.getLocationId() == 5) {
            String nameOfNewGoods = gameModel.getGoodsName();
            if (nameOfNewGoods != null) {
                if (nameOfNewGoods != "Brak nowego towaru") {
                    GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfNewGoods);
                    GoodsWestEntities goodsWestEntities = goodsWestDao.findByName(nameOfNewGoods);
                    if (goodsWestEntities == null) {
                        goodsWestService.save(goodsAvailableEntities.getName(), goodsAvailableEntities.getUsingMerchant(), goodsAvailableEntities.getTyp());
                    }
                }
            }

        }
    }

    @Override
    public void addNewBuilding(VilageEntity vilage, GameModel gameModel, Model model) {

        if (vilage.getLocationId() == 1) {
            String name = gameModel.getBuildingName();
            BuildingsEntity buildings = buildingDao.findByName(name);
            if (!buildings.getName().equals("Brak nowego budynku")) {
                if (buildings.getAvailableAnimal() == 0) {
                    buildingNorthService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType());
                } else {
                    if (buildingSupplyService.getAllData() != null) {
                        buildingSupplyDao.deleteAll();
                    }
                    buildingSupplyService.save(buildings.getName(), buildings.getCostOfBuilding(), buildings.getInfo(), buildings.getType());
                    model.addAttribute("animalInBuildings", buildingSupplyService.getAllData());

                    String animalsName = buildings.getName();
                    List<String> nameOfAnimals = new ArrayList<>();
                    switch (animalsName) {
                        case "Chlew":
                            nameOfAnimals.add("Świnie");
                            break;
                        case "Gęsiarnia":
                            nameOfAnimals.add("Gęsi");
                            break;
                        case "Kurnik":
                            nameOfAnimals.add("Kury");
                            nameOfAnimals.add("Kaczki");
                            break;
                        case "Królikarnia":
                            nameOfAnimals.add("Króliki");
                            break;
                        case "Zagroda":
                            nameOfAnimals.add("Kozy");
                            nameOfAnimals.add("Owce");
                            break;
                        case "Stajnia":
                            nameOfAnimals.add("Krowy");
                            break;
                        case "Stadnina":
                            nameOfAnimals.add("Konie");
                            break;
                        case "Mała stadnina":
                            nameOfAnimals.add("Mustang");
                            break;
                    }
                    model.addAttribute("nameOfAnimal", nameOfAnimals);

                }
            }


        } else if (vilage.getLocationId() == 2) {
            String name = gameModel.getBuildingName();
            if (name != null) {
                if (!name.equals("Brak nowego budynku")) {
                    BuildingsEntity buildings = buildingDao.findByName(name);
                    if (buildings.getAvailableAnimal() == 0) {
                        buildingEastService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType());
                    } else {
                        if (buildingSupplyService.getAllData() != null) {
                            buildingSupplyDao.deleteAll();
                        }
                        buildingSupplyService.save(buildings.getName(), buildings.getCostOfBuilding(), buildings.getInfo(), buildings.getType());
                        model.addAttribute("animalInBuildings", buildingSupplyService.getAllData());

                        String animalsName = buildings.getName();
                        List<String> nameOfAnimals = new ArrayList<>();
                        switch (animalsName) {
                            case "Chlew":
                                nameOfAnimals.add("Świnie");
                                break;
                            case "Gęsiarnia":
                                nameOfAnimals.add("Gęsi");
                                break;
                            case "Kurnik":
                                nameOfAnimals.add("Kury");
                                nameOfAnimals.add("Kaczki");
                                break;
                            case "Królikarnia":
                                nameOfAnimals.add("Króliki");
                                break;
                            case "Zagroda":
                                nameOfAnimals.add("Kozy");
                                nameOfAnimals.add("Owce");
                                break;
                            case "Stajnia":
                                nameOfAnimals.add("Krowy");
                                break;
                            case "Stadnina":
                                nameOfAnimals.add("Konie");
                                break;
                            case "Mała stadnina":
                                nameOfAnimals.add("Mustang");
                                break;
                        }
                        model.addAttribute("nameOfAnimal", nameOfAnimals);
                    }
                }
            }

        } else if (vilage.getLocationId() == 3) {
            String name = gameModel.getBuildingName();
            if (name != null) {
                if (!name.equals("Brak nowego budynku")) {
                    BuildingsEntity buildings = buildingDao.findByName(name);
                    if (buildings.getAvailableAnimal() == 0) {
                        buildingCentralService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType());
                    } else {
                        if (buildingSupplyService.getAllData() != null) {
                            buildingSupplyDao.deleteAll();
                        }
                        buildingSupplyService.save(buildings.getName(), buildings.getCostOfBuilding(), buildings.getInfo(), buildings.getType());
                        model.addAttribute("animalInBuildings", buildingSupplyService.getAllData());

                        String animalsName = buildings.getName();
                        List<String> nameOfAnimals = new ArrayList<>();
                        switch (animalsName) {
                            case "Chlew":
                                nameOfAnimals.add("Świnie");
                                break;
                            case "Gęsiarnia":
                                nameOfAnimals.add("Gęsi");
                                break;
                            case "Kurnik":
                                nameOfAnimals.add("Kury");
                                nameOfAnimals.add("Kaczki");
                                break;
                            case "Królikarnia":
                                nameOfAnimals.add("Króliki");
                                break;
                            case "Zagroda":
                                nameOfAnimals.add("Kozy");
                                nameOfAnimals.add("Owce");
                                break;
                            case "Stajnia":
                                nameOfAnimals.add("Krowy");
                                break;
                            case "Stadnina":
                                nameOfAnimals.add("Konie");
                                break;
                            case "Mała stadnina":
                                nameOfAnimals.add("Mustang");
                                break;
                        }
                        model.addAttribute("nameOfAnimal", nameOfAnimals);
                    }
                }
            }


        } else if (vilage.getLocationId() == 4) {
            String name = gameModel.getBuildingName();
            if (name != null) {
                if (!name.equals("Brak nowego budynku")) {
                    BuildingsEntity buildings = buildingDao.findByName(name);
                    if (buildings.getAvailableAnimal() == 0) {
                        buildingSouthService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType());
                    } else {
                        if (buildingSupplyService.getAllData() != null) {
                            buildingSupplyDao.deleteAll();
                        }
                        buildingSupplyService.save(buildings.getName(), buildings.getCostOfBuilding(), buildings.getInfo(), buildings.getType());
                        model.addAttribute("animalInBuildings", buildingSupplyService.getAllData());

                        String animalsName = buildings.getName();
                        List<String> nameOfAnimals = new ArrayList<>();
                        switch (animalsName) {
                            case "Chlew":
                                nameOfAnimals.add("Świnie");
                                break;
                            case "Gęsiarnia":
                                nameOfAnimals.add("Gęsi");
                                break;
                            case "Kurnik":
                                nameOfAnimals.add("Kury");
                                nameOfAnimals.add("Kaczki");
                                break;
                            case "Królikarnia":
                                nameOfAnimals.add("Króliki");
                                break;
                            case "Zagroda":
                                nameOfAnimals.add("Kozy");
                                nameOfAnimals.add("Owce");
                                break;
                            case "Stajnia":
                                nameOfAnimals.add("Krowy");
                                break;
                            case "Stadnina":
                                nameOfAnimals.add("Konie");
                                break;
                            case "Mała stadnina":
                                nameOfAnimals.add("Mustang");
                                break;
                        }
                        model.addAttribute("nameOfAnimal", nameOfAnimals);
                    }
                }
            }


        } else if (vilage.getLocationId() == 5) {
            String name = gameModel.getBuildingName();
            if (name != null) {
                if (!name.equals("Brak nowego budynku")) {
                    BuildingsEntity buildings = buildingDao.findByName(name);
                    if (buildings.getAvailableAnimal() == 0) {
                        buildingWestService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType());
                    } else {
                        if (buildingSupplyService.getAllData() != null) {
                            buildingSupplyDao.deleteAll();
                        }
                        buildingSupplyService.save(buildings.getName(), buildings.getCostOfBuilding(), buildings.getInfo(), buildings.getType());
                        model.addAttribute("animalInBuildings", buildingSupplyService.getAllData());

                        String animalsName = buildings.getName();
                        List<String> nameOfAnimals = new ArrayList<>();
                        switch (animalsName) {
                            case "Chlew":
                                nameOfAnimals.add("Świnie");
                                break;
                            case "Gęsiarnia":
                                nameOfAnimals.add("Gęsi");
                                break;
                            case "Kurnik":
                                nameOfAnimals.add("Kury");
                                nameOfAnimals.add("Kaczki");
                                break;
                            case "Królikarnia":
                                nameOfAnimals.add("Króliki");
                                break;
                            case "Zagroda":
                                nameOfAnimals.add("Kozy");
                                nameOfAnimals.add("Owce");
                                break;
                            case "Stajnia":
                                nameOfAnimals.add("Krowy");
                                break;
                            case "Stadnina":
                                nameOfAnimals.add("Konie");
                                break;
                            case "Mała stadnina":
                                nameOfAnimals.add("Mustang");
                                break;
                        }
                        model.addAttribute("nameOfAnimal", nameOfAnimals);
                    }
                }
            }

        }

    }

    @Override
    public void saveGoods(VilageEntity vilage, GameModel gameModel) {
        GoodsAvailableEntities unvailableGoods = goodsAvailableDao.findByName("Brak nowego towaru");
        if (unvailableGoods == null) {
            goodsAvailableService.save("Brak nowego towaru", null, 0);
        }
        String name = gameModel.getBuildingName();
        if (name != "Brak nowego budynku") {
            BuildingsEntity buildings = buildingDao.findByName(name);
            if (buildings.getProducts1() != null) {
                String goodsToSell = buildings.getProducts1();
                GoodsAvailableEntities goodsName = goodsAvailableDao.findByName(goodsToSell);
                if (goodsName == null) {
                    goodsAvailableService.save(buildings.getProducts1(), 1, buildings.getType());
                }
            }
        }

    }


    @Override
    public void sumBuying(GameModel gameModel) {
        String nameOfbuilding = gameModel.getBuildingName();
        BigDecimal costOfBuilding = null;
        if ((nameOfbuilding == "Brak nowego budynku")) {
            costOfBuilding = BigDecimal.valueOf(0);
        } else {
            BuildingsEntity buildings = buildingDao.findByName(nameOfbuilding);
            costOfBuilding = toZero(buildings.getCostOfBuilding());
        }
        gameModel.setCostOfBuilding(costOfBuilding);

        BigDecimal costOfFields = null;
        int numberOfFields = gameModel.getFieldsToBuy();
        if (numberOfFields == 0) {
            costOfFields = BigDecimal.valueOf(0);
        } else {
            BigDecimal moneyForAFields = BigDecimal.valueOf(numberOfFields);
            costOfFields = moneyForAFields.multiply(BigDecimal.valueOf(100));
        }
        gameModel.setCostOfFields(costOfFields);
        BigDecimal sumOfCost = costOfBuilding.add(costOfFields);
        gameModel.setSumOfCost(sumOfCost);
    }

    @Override
    public void nextTurnMoney(GameModel gameModel) {
        BigDecimal startMoney = gameModel.getStartMoney(); // 100
        BigDecimal costOfShoping = toZero(gameModel.getSumOfCost()); //0
        BigDecimal moneyForNextTurn = toZero(gameModel.getAvailableMoney()); //0
        if (gameModel.getTurnNumber() == 1) {
            moneyForNextTurn = BigDecimal.valueOf(0);
        }
        BigDecimal incomFromTurn = gameModel.getTotalIncome(); //84
        BigDecimal balance = incomFromTurn.subtract(costOfShoping);//84
        BigDecimal startBalance = startMoney.add(balance); // 184
        moneyForNextTurn = moneyForNextTurn.add(startBalance); //00
        gameModel.setStartMoney(BigDecimal.valueOf(0));
        gameModel.setAvailableMoney(moneyForNextTurn);
    }

    @Override
    public void typeOfVilage(GameModel gameModel, VilageEntity vilage) {
        if (vilage.getLocationId() == 1) {
            BuildingsEntityNorth palisada = buildingNorthDao.findFirstByName("Palisada");
            BuildingsEntityNorth studnia = buildingNorthDao.findFirstByName("Studnia");
            BuildingsEntityNorth droga = buildingNorthDao.findFirstByName("Droga");
            String typeOfVilage = null;
            if ((palisada != null) & (studnia != null) & (droga != null)) {
                typeOfVilage = "Wioska";
                gameModel.setTypeOfVilage(typeOfVilage);
            } else {
                typeOfVilage = "Przysiółek";
                gameModel.setTypeOfVilage(typeOfVilage);
            }

        } else if (vilage.getLocationId() == 2) {
            BuildingsEntityEast palisada = buildingEastDao.findFirstByName("Palisada");
            BuildingsEntityEast studnia = buildingEastDao.findFirstByName("Studnia");
            BuildingsEntityEast droga = buildingEastDao.findFirstByName("Droga");
            String typeOfVilage = null;
            if ((palisada != null) & (studnia != null) & (droga != null)) {
                typeOfVilage = "Wioska";
                gameModel.setTypeOfVilage(typeOfVilage);
            } else {
                typeOfVilage = "Przysiółek";
                gameModel.setTypeOfVilage(typeOfVilage);
            }

        } else if (vilage.getLocationId() == 3) {
            BuildingsEntityCentral palisada = buildingCentralDao.findFirstByName("Palisada");
            BuildingsEntityCentral studnia = buildingCentralDao.findFirstByName("Studnia");
            BuildingsEntityCentral droga = buildingCentralDao.findFirstByName("Droga");
            String typeOfVilage = null;
            if ((palisada != null) & (studnia != null) & (droga != null)) {
                typeOfVilage = "Wioska";
                gameModel.setTypeOfVilage(typeOfVilage);
            } else {
                typeOfVilage = "Przysiółek";
                gameModel.setTypeOfVilage(typeOfVilage);
            }

        } else if (vilage.getLocationId() == 4) {
            BuildingsEntitySouth palisada = buildingSouthDao.findFirstByName("Palisada");
            BuildingsEntitySouth studnia = buildingSouthDao.findFirstByName("Studnia");
            BuildingsEntitySouth droga = buildingSouthDao.findFirstByName("Droga");
            String typeOfVilage = null;
            if ((palisada != null) & (studnia != null) & (droga != null)) {
                typeOfVilage = "Wioska";
                gameModel.setTypeOfVilage(typeOfVilage);
            } else {
                typeOfVilage = "Przysiółek";
                gameModel.setTypeOfVilage(typeOfVilage);
            }

        } else if (vilage.getLocationId() == 5) {
            BuildingsEntityWest palisada = buildingWestDao.findFirstByName("Palisada");
            BuildingsEntityWest studnia = buildingWestDao.findFirstByName("Studnia");
            BuildingsEntityWest droga = buildingWestDao.findFirstByName("Droga");
            String typeOfVilage = null;
            if ((palisada != null) & (studnia != null) & (droga != null)) {
                typeOfVilage = "Wioska";
                gameModel.setTypeOfVilage(typeOfVilage);
            } else {
                typeOfVilage = "Przysiółek";
                gameModel.setTypeOfVilage(typeOfVilage);
            }
        }


    }

    @Override
    public void startMoney(GameModel gameModel) {
        gameModel.setAvailableMoney(gameModel.getStartMoney());
    }

    @Override
    public void addSupplyedBuilding(GameModel gameModel) {

        if (gameModel.getLocationId() == 1) {
            String name = gameModel.getAnimalInBuilding();
            BuildingsSupplyEntity buildingsSupplyEntity = buildingSupplyService.getAllData().get(0);
            if (name != null) {
                String nameOfBuilding = buildingsSupplyEntity.getName();
                BuildingsEntity buildings = buildingDao.findByName(nameOfBuilding);
                buildingNorthService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType(), name);
                gameModel.setAnimalInBuilding(null);
            }

        } else if (gameModel.getLocationId() == 2) {
            String name = gameModel.getAnimalInBuilding();
            BuildingsSupplyEntity buildingsSupplyEntity = buildingSupplyService.getAllData().get(0);
            if (name != null) {
                String nameOfBuilding = buildingsSupplyEntity.getName();
                BuildingsEntity buildings = buildingDao.findByName(nameOfBuilding);
                buildingEastService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType(), name);
                gameModel.setAnimalInBuilding(null);
            }

        } else if (gameModel.getLocationId() == 3) {
            String name = gameModel.getAnimalInBuilding();
            BuildingsSupplyEntity buildingsSupplyEntity = buildingSupplyService.getAllData().get(0);
            if (name != null) {
                String nameOfBuilding = buildingsSupplyEntity.getName();
                BuildingsEntity buildings = buildingDao.findByName(nameOfBuilding);
                buildingCentralService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType(), name);
                gameModel.setAnimalInBuilding(null);
            }

        } else if (gameModel.getLocationId() == 4) {
            String name = gameModel.getAnimalInBuilding();
            BuildingsSupplyEntity buildingsSupplyEntity = buildingSupplyService.getAllData().get(0);
            if (name != null) {
                String nameOfBuilding = buildingsSupplyEntity.getName();
                BuildingsEntity buildings = buildingDao.findByName(nameOfBuilding);
                buildingSouthService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType(), name);
                gameModel.setAnimalInBuilding(null);
            }

        } else if (gameModel.getLocationId() == 5) {
            String name = gameModel.getAnimalInBuilding();
            BuildingsSupplyEntity buildingsSupplyEntity = buildingSupplyService.getAllData().get(0);
            if (name != null) {
                String nameOfBuilding = buildingsSupplyEntity.getName();
                BuildingsEntity buildings = buildingDao.findByName(nameOfBuilding);
                buildingWestService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType(), name);
                gameModel.setAnimalInBuilding(null);
            }
        }


    }

    @Override
    public void supplyedField(Model model) {

        FieldsSupplyEntity fieldsSupplyEntity =  fieldSupplyDao.findFirstByOrderByIdDesc();
        if (fieldsSupplyEntity != null) {


            model.addAttribute("fieldsSupplyEntity", fieldsSupplyEntity);
            List<String> nameOfPlants = new ArrayList<>();
            nameOfPlants.add("Owies");
            nameOfPlants.add("Jęczmień");
            nameOfPlants.add("Żyto");
            nameOfPlants.add("Pszenica jara");
            nameOfPlants.add("Pszenica ozima");
            model.addAttribute("supplyedField", nameOfPlants);
        }
    }

    public void addSupplyedField(GameModel gameModel) {

        if (gameModel.getLocationId() == 1) {
            String nameOfPlant = gameModel.getPlantInFields();
            FieldsSupplyEntity fieldsSupplyEntity = fieldSupplyDao.findFirstByOrderByIdDesc();
            if (fieldsSupplyEntity != null){
                fieldNorthService.save(fieldsSupplyEntity.getName(), fieldsSupplyEntity.getCostOfBuying(), fieldsSupplyEntity.getArea(), fieldsSupplyEntity.getInfo(),nameOfPlant);
            }


        } else if (gameModel.getLocationId() == 2) {
            String nameOfPlant = gameModel.getPlantInFields();
            FieldsSupplyEntity fieldsSupplyEntity = fieldSupplyDao.findFirstByOrderByIdDesc();
            if (fieldsSupplyEntity != null) {
                fieldEastService.save(fieldsSupplyEntity.getName(), fieldsSupplyEntity.getCostOfBuying(), fieldsSupplyEntity.getArea(), fieldsSupplyEntity.getInfo(), nameOfPlant);
            }

        } else if (gameModel.getLocationId() == 3) {
            String nameOfPlant = gameModel.getPlantInFields();
            FieldsSupplyEntity fieldsSupplyEntity = fieldSupplyDao.findFirstByOrderByIdDesc();
            if (fieldsSupplyEntity != null) {
                fieldCentralService.save(fieldsSupplyEntity.getName(), fieldsSupplyEntity.getCostOfBuying(), fieldsSupplyEntity.getArea(), fieldsSupplyEntity.getInfo(), nameOfPlant);
            }

        } else if (gameModel.getLocationId() == 4) {
            String nameOfPlant = gameModel.getPlantInFields();
            FieldsSupplyEntity fieldsSupplyEntity = fieldSupplyDao.findFirstByOrderByIdDesc();
            if (fieldsSupplyEntity != null) {
                fieldSouthService.save(fieldsSupplyEntity.getName(), fieldsSupplyEntity.getCostOfBuying(), fieldsSupplyEntity.getArea(), fieldsSupplyEntity.getInfo(), nameOfPlant);
            }

        } else if (gameModel.getLocationId() == 5) {
            String nameOfPlant = gameModel.getPlantInFields();
            FieldsSupplyEntity fieldsSupplyEntity = fieldSupplyDao.findFirstByOrderByIdDesc();
            if (fieldsSupplyEntity != null) {
                fieldWestService.save(fieldsSupplyEntity.getName(), fieldsSupplyEntity.getCostOfBuying(), fieldsSupplyEntity.getArea(), fieldsSupplyEntity.getInfo(), nameOfPlant);
            }
        }
        List<FieldsSupplyEntity> field = fieldSupplyService.getAllData();
        if (field != null){
            fieldSupplyDao.deleteAll();
        }

    }

    @Override
    public void availableGoodsToSell(GameModel gameModel, Model model) {

        goodsAvailableService.save("Brak nowego towaru", 0, 0);

        if (gameModel.getLocationId() == 1) {
            List<BuildingsEntityNorth> northEntities = buildingNorthService.getAllData();
            for (BuildingsEntityNorth north :
                    northEntities) {
                String animal = north.getAnimalInBuilding();
                AnimalsEntity animalsEntity = animalDao.findByName(animal);
                if (north.getProducts1() != null) {
                    goodsAvailableService.save(north.getProducts1(), 1, north.getType());
                } else if (animalsEntity != null) {
                    goodsAvailableService.save(animalsEntity.getProducts1(), 1, animalsEntity.getTyp());
                }
            }
            List<FieldNorthEntity> northFieldEntities = fieldNorthService.getAllData();
            for (FieldNorthEntity northField :
                    northFieldEntities) {
                String plant = northField.getSeed();
                if (plant != null){
                    goodsAvailableService.save(northField.getSeed(), 1, 1);
                }
            }

            List<GoodsAvailableEntities> availableGoods = goodsAvailableService.getAllData();
            model.addAttribute("goodsToSell", availableGoods);

        } else if (gameModel.getLocationId() == 2) {
            List<BuildingsEntityEast> eastEntities = buildingEastService.getAllData();
            for (BuildingsEntityEast east :
                    eastEntities) {
                String animal = east.getAnimalInBuilding();
                AnimalsEntity animalsEntity = animalDao.findByName(animal);
                if (east.getProducts1() != null) {
                    goodsAvailableService.save(east.getProducts1(), 1, east.getType());
                } else if (animalsEntity != null) {
                    goodsAvailableService.save(animalsEntity.getProducts1(), 1, animalsEntity.getTyp());
                }
            }
            List<FieldEastEntity> eastFieldEntities = fieldEastService.getAllData();
            for (FieldEastEntity eastField :
                    eastFieldEntities) {
                String plant = eastField.getSeed();
                if (plant != null){
                    goodsAvailableService.save(eastField.getSeed(), 1, 1);
                }
            }

            List<GoodsAvailableEntities> availableGoods = goodsAvailableService.getAllData();
            model.addAttribute("goodsToSell", availableGoods);

        } else if (gameModel.getLocationId() == 3) {
            List<BuildingsEntityCentral> centralEntities = buildingCentralService.getAllData();
            for (BuildingsEntityCentral central :
                    centralEntities) {
                String animal = central.getAnimalInBuilding();
                AnimalsEntity animalsEntity = animalDao.findByName(animal);
                if (central.getProducts1() != null) {
                    goodsAvailableService.save(central.getProducts1(), 1, central.getType());
                } else if (animalsEntity != null) {
                    goodsAvailableService.save(animalsEntity.getProducts1(), 1, animalsEntity.getTyp());
                }
            }
            List<FieldCentralEntity> centralFieldEntities = fieldCentralService.getAllData();
            for (FieldCentralEntity centralField :
                    centralFieldEntities) {
                String plant = centralField.getSeed();
                if (plant != null){
                    goodsAvailableService.save(centralField.getSeed(), 1, 1);
                }
            }

            List<GoodsAvailableEntities> availableGoods = goodsAvailableService.getAllData();
            model.addAttribute("goodsToSell", availableGoods);

        } else if (gameModel.getLocationId() == 4) {
            List<BuildingsEntitySouth> southEntities = buildingSouthService.getAllData();
            for (BuildingsEntitySouth south :
                    southEntities) {
                String animal = south.getAnimalInBuilding();
                AnimalsEntity animalsEntity = animalDao.findByName(animal);
                if (south.getProducts1() != null) {
                    goodsAvailableService.save(south.getProducts1(), 1, south.getType());
                } else if (animalsEntity != null) {
                    goodsAvailableService.save(animalsEntity.getProducts1(), 1, animalsEntity.getTyp());
                }
            }
            List<FieldSouthEntity> southFieldEntities = fieldSouthService.getAllData();
            for (FieldSouthEntity southField :
                    southFieldEntities) {
                String plant = southField.getSeed();
                if (plant != null){
                    goodsAvailableService.save(southField.getSeed(), 1, 1);
                }
            }

            List<GoodsAvailableEntities> availableGoods = goodsAvailableService.getAllData();
            model.addAttribute("goodsToSell", availableGoods);

        } else if (gameModel.getLocationId() == 5) {
            List<BuildingsEntityWest> westEntities = buildingWestService.getAllData();
            for (BuildingsEntityWest west :
                    westEntities) {
                String animal = west.getAnimalInBuilding();
                AnimalsEntity animalsEntity = animalDao.findByName(animal);
                if (west.getProducts1() != null) {
                    goodsAvailableService.save(west.getProducts1(), 1, west.getType());
                } else if (animalsEntity != null) {
                    goodsAvailableService.save(animalsEntity.getProducts1(), 1, animalsEntity.getTyp());
                }
            }
            List<FieldWestEntity> westFieldEntities = fieldWestService.getAllData();
            for (FieldWestEntity westField :
                    westFieldEntities) {
                String plant = westField.getSeed();
                if (plant != null){
                    goodsAvailableService.save(westField.getSeed(), 1, 1);
                }
            }

            List<GoodsAvailableEntities> availableGoods = goodsAvailableService.getAllData();
            model.addAttribute("goodsToSell", availableGoods);
        }


    }




    public void saveIntoTabela(String buildingName, GameModel gameModel) {
        gameModel.setBuildingName(buildingName);
    }

    public GameModel getModel() {
        return model;
    }

    public void setModel(GameModel model) {
        this.model = model;
    }


}
