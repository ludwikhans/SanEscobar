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
    final FieldDao fieldDao;

    final BuildingService buildingService;
    final BuildingAvailableService availableBuildingService;
    final AvailableBuildingDao availableBuildingDao;

    final VilageService vilageService;
    final AnimalsService animalsService;
    final FieldService fieldService;
    final PlantService plantService;

    final GoodsAvailableService goodsAvailableService;
    final GoodsAvailableDao goodsAvailableDao;

    final BuildingSupplyDao buildingSupplyDao;
    final BuildingSupplyService buildingSupplyService;

    final FieldSupplyService fieldSupplyService;
    final FieldSupplyDao fieldSupplyDao;

    final GameEventService gameEventService;
    final GameEventDao gameEventDao;

    public GameService(BuildingNorthService buildingNorthService, FieldNorthService fieldNorthService, GoodsNorthService goodsNorthService, BuildingEastService buildingEastService, FieldEastService fieldEastService, GoodsEastService goodsEastService, BuildingWestService buildingWestService, FieldWestService fieldWestService, GoodsWestService goodsWestService, BuildingSouthService buildingSouthService, FieldSouthService fieldSouthService, GoodsSouthService goodsSouthService, BuildingCentralService buildingCentralService, FieldCentralService fieldCentralService, GoodsCentralService goodsCentralService, FieldNorthDao fieldNorthDao, FieldEastDao fieldEastDao, FieldCentralDao fieldCentralDao, FieldSouthDao fieldSouthDao, FieldWestDao fieldWestDao, BuildingCentralDao buildingCentralDao, BuildingEastDao buildingEastDao, BuildingNorthDao buildingNorthDao, BuildingSouthDao buildingSouthDao, BuildingWestDao buildingWestDao, GoodsCentralDao goodsCentralDao, GoodsEastDao goodsEastDao, GoodsNorthDao goodsNorthDao, GoodsSouthDao goodsSouthDao, GoodsWestDao goodsWestDao, PlantsDao plantsDao, BuildingDao buildingDao, AnimalDao animalDao, FieldDao fieldDao, BuildingService buildingService, BuildingAvailableService availableBuildingService, AvailableBuildingDao availableBuildingDao, VilageService vilageService, AnimalsService animalsService, FieldService fieldService, PlantService plantService, GoodsAvailableService goodsAvailableService, GoodsAvailableDao goodsAvailableDao, BuildingSupplyDao buildingSupplyDao, BuildingSupplyService buildingSupplyService, FieldSupplyService fieldSupplyService, FieldSupplyDao fieldSupplyDao, GameEventService gameEventService, GameEventDao gameEventDao) {
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
        this.fieldDao = fieldDao;
        this.buildingService = buildingService;
        this.availableBuildingService = availableBuildingService;
        this.availableBuildingDao = availableBuildingDao;
        this.vilageService = vilageService;
        this.animalsService = animalsService;
        this.fieldService = fieldService;
        this.plantService = plantService;
        this.goodsAvailableService = goodsAvailableService;
        this.goodsAvailableDao = goodsAvailableDao;
        this.buildingSupplyDao = buildingSupplyDao;
        this.buildingSupplyService = buildingSupplyService;
        this.fieldSupplyService = fieldSupplyService;
        this.fieldSupplyDao = fieldSupplyDao;
        this.gameEventService = gameEventService;
        this.gameEventDao = gameEventDao;
    }

    public GameModel model;


    @Override
    public void startVilageLoaded(GameModel gameModel, Model model) {
        if (gameModel.getLocationId() == 1) {
            model.addAttribute("buildings", buildingNorthService.getAllData());
            model.addAttribute("fields", fieldNorthService.getAllData());
            model.addAttribute("goods", goodsNorthService.getAllData());

        } else if (gameModel.getLocationId() == 2) {
            model.addAttribute("buildings", buildingEastService.getAllData());
            model.addAttribute("fields", fieldEastService.getAllData());
            model.addAttribute("goods", goodsEastService.getAllData());

        } else if (gameModel.getLocationId() == 3) {
            model.addAttribute("buildings", buildingCentralService.getAllData());
            model.addAttribute("fields", fieldCentralService.getAllData());
            model.addAttribute("goods", goodsCentralService.getAllData());

        } else if (gameModel.getLocationId() == 4) {
            model.addAttribute("buildings", buildingSouthService.getAllData());
            model.addAttribute("fields", fieldSouthService.getAllData());
            model.addAttribute("goods", goodsSouthService.getAllData());

        } else if (gameModel.getLocationId() == 5) {
            model.addAttribute("buildings", buildingWestService.getAllData());
            model.addAttribute("fields", fieldWestService.getAllData());
            model.addAttribute("goods", goodsWestService.getAllData());
        }
    }


    @Override
    public void totalArea(GameModel gameModel) {

        if (gameModel.getLocationId() == 1) {
            int areaSum = fieldNorthDao.sumCreditAmount();
            gameModel.setArea(areaSum);


        } else if (gameModel.getLocationId() == 2) {
            int areaSum = fieldEastDao.sumCreditAmount();
            gameModel.setArea(areaSum);

        } else if (gameModel.getLocationId() == 3) {
            int areaSum = fieldCentralDao.sumCreditAmount();
            gameModel.setArea(areaSum);

        } else if (gameModel.getLocationId() == 4) {
            int areaSum = fieldSouthDao.sumCreditAmount();
            gameModel.setArea(areaSum);

        } else if (gameModel.getLocationId() == 5) {
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
    public void totalMerchant(GameModel gameModel) {


        if (gameModel.getLocationId() == 1) {
            int merchant = buildingNorthDao.sumCreditAmount();
            gameModel.setMerchant(merchant);
            int usingMerchant = goodsNorthDao.sumCreditAmount();
            gameModel.setUsingMerchant(usingMerchant);
            int unoccupiedMerchant = (merchant - usingMerchant);
            gameModel.setUnoccupiedMerchant(unoccupiedMerchant);


        } else if (gameModel.getLocationId() == 2) {
            int merchant = buildingEastDao.sumCreditAmount();
            gameModel.setMerchant(merchant);
            int usingMerchant = goodsEastDao.sumCreditAmount();
            gameModel.setUsingMerchant(usingMerchant);
            int unoccupiedMerchant = (merchant - usingMerchant);
            gameModel.setUnoccupiedMerchant(unoccupiedMerchant);

        } else if (gameModel.getLocationId() == 3) {
            int merchant = buildingCentralDao.sumCreditAmount();
            gameModel.setMerchant(merchant);
            int usingMerchant = goodsCentralDao.sumCreditAmount();
            gameModel.setUsingMerchant(usingMerchant);
            int unoccupiedMerchant = (merchant - usingMerchant);
            gameModel.setUnoccupiedMerchant(unoccupiedMerchant);

        } else if (gameModel.getLocationId() == 4) {
            int merchant = buildingSouthDao.sumCreditAmount();
            gameModel.setMerchant(merchant);
            int usingMerchant = goodsSouthDao.sumCreditAmount();
            gameModel.setUsingMerchant(usingMerchant);
            int unoccupiedMerchant = (merchant - usingMerchant);
            gameModel.setUnoccupiedMerchant(unoccupiedMerchant);

        } else if (gameModel.getLocationId() == 5) {
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
    public void gameIncome(GameModel gameModel) {
        BigDecimal restartIncomFromFields = BigDecimal.valueOf(0);
        gameModel.setIncomFromFields(restartIncomFromFields);
        BigDecimal restartIncomFromBuilding = BigDecimal.valueOf(0);
        gameModel.setIncomFromBuilding(restartIncomFromBuilding);
        BigDecimal restartIncomFromAnimal = BigDecimal.valueOf(0);
        gameModel.setIncomFromAnimal(restartIncomFromAnimal);


        if (gameModel.getLocationId() == 1) {


            List<GoodsNorthEntities> theGoods = goodsNorthService.getAllData();
            for (GoodsNorthEntities product :
                    theGoods) {
                String nameOfProduct = product.getName();
                if (product.getTyp() == 1) {
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

        } else if (gameModel.getLocationId() == 2) {

            List<GoodsEastEntities> theGoods = goodsEastService.getAllData();
            for (GoodsEastEntities product :
                    theGoods) {
                String nameOfProduct = product.getName();
                if (product.getTyp() == 1) {
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

        } else if (gameModel.getLocationId() == 3) {

            List<GoodsCentralEntities> theGoods = goodsCentralService.getAllData();
            for (GoodsCentralEntities product :
                    theGoods) {
                String nameOfProduct = product.getName();
                if (product.getTyp() == 1) {
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

        } else if (gameModel.getLocationId() == 4) {

            List<GoodsSouthEntities> theGoods = goodsSouthService.getAllData();
            for (GoodsSouthEntities product :
                    theGoods) {
                String nameOfProduct = product.getName();
                if (product.getTyp() == 1) {
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

        } else if (gameModel.getLocationId() == 5) {

            List<GoodsWestEntities> theGoods = goodsWestService.getAllData();
            for (GoodsWestEntities product :
                    theGoods) {
                String nameOfProduct = product.getName();
                if (product.getTyp() == 1) {
                    PlantsEntity plantsEntity = plantsDao.findByName(nameOfProduct);
                    BigDecimal profitPerHectar = plantsEntity.getMoneyProfit();
                    Double harvest = plantsEntity.getHarvest();
                    BigDecimal harvestPerHectar = BigDecimal.valueOf(harvest);
                    List<FieldWestEntity> fieldWestEntity = fieldWestDao.findAllBySeed(nameOfProduct);
                    int area = 0;
                    for (FieldWestEntity westEntity : fieldWestEntity) {
                        int partOfArea = westEntity.getArea();
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
    public void deleteDoubleGoods(GameModel gameModel, Model model) {
        if (gameModel.getLocationId() == 1) {
            List<String> namaGoods = new ArrayList<>();
            List<GoodsNorthEntities> northEntities = goodsNorthService.getAllData();
            for (GoodsNorthEntities cos :
                    northEntities) {
                String nameOfGoods = cos.getName();
                GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findFirstByName(nameOfGoods);
                if (goodsAvailableEntities != null) {
                    goodsAvailableDao.delete(goodsAvailableEntities);
                }
            }
            List<GoodsAvailableEntities> availableGoods = goodsAvailableService.getAllData();
            model.addAttribute("goodsToSell", availableGoods);

        } else if (gameModel.getLocationId() == 2) {
            List<String> namaGoods = new ArrayList<>();
            List<GoodsEastEntities> northEntities = goodsEastService.getAllData();
            for (GoodsEastEntities cos :
                    northEntities) {
                String nameOfGoods = cos.getName();
                GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findFirstByName(nameOfGoods);
                if (goodsAvailableEntities != null) {
                    goodsAvailableDao.delete(goodsAvailableEntities);
                }
            }
            List<GoodsAvailableEntities> availableGoods = goodsAvailableService.getAllData();
            model.addAttribute("goodsToSell", availableGoods);

        } else if (gameModel.getLocationId() == 3) {
            List<String> namaGoods = new ArrayList<>();
            List<GoodsCentralEntities> northEntities = goodsCentralService.getAllData();
            for (GoodsCentralEntities cos :
                    northEntities) {
                String nameOfGoods = cos.getName();
                GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findFirstByName(nameOfGoods);
                if (goodsAvailableEntities != null) {
                    goodsAvailableDao.delete(goodsAvailableEntities);
                }
            }
            List<GoodsAvailableEntities> availableGoods = goodsAvailableService.getAllData();
            model.addAttribute("goodsToSell", availableGoods);

        } else if (gameModel.getLocationId() == 4) {
            List<String> namaGoods = new ArrayList<>();
            List<GoodsSouthEntities> northEntities = goodsSouthService.getAllData();
            for (GoodsSouthEntities cos :
                    northEntities) {
                String nameOfGoods = cos.getName();
                GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findFirstByName(nameOfGoods);
                if (goodsAvailableEntities != null) {
                    goodsAvailableDao.delete(goodsAvailableEntities);
                }
            }
            List<GoodsAvailableEntities> availableGoods = goodsAvailableService.getAllData();
            model.addAttribute("goodsToSell", availableGoods);

        } else if (gameModel.getLocationId() == 5) {
            List<String> namaGoods = new ArrayList<>();
            List<GoodsWestEntities> northEntities = goodsWestService.getAllData();
            for (GoodsWestEntities cos :
                    northEntities) {
                String nameOfGoods = cos.getName();
                GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findFirstByName(nameOfGoods);
                if (goodsAvailableEntities != null) {
                    goodsAvailableDao.delete(goodsAvailableEntities);
                }
            }
            List<GoodsAvailableEntities> availableGoods = goodsAvailableService.getAllData();
            model.addAttribute("goodsToSell", availableGoods);
        }
    }

    @Override
    public void addFields(GameModel gameModel) {

        if (gameModel.getLocationId() == 1) {
            int howManyToFieldBuy = gameModel.getFieldsToBuy();
            if (howManyToFieldBuy != 0) {
                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow(howManyToFieldBuy);
                fieldNorthService.save(meadow.getName(), meadow.getCostOfBuying(), meadow.getArea(), meadow.getInfo(), meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields(howManyToFieldBuy);
                fieldSupplyService.save(ploughtFields.getName(), ploughtFields.getCostOfBuying(), ploughtFields.getArea(), ploughtFields.getInfo(), ploughtFields.getSeed());

            }


        } else if (gameModel.getLocationId() == 2) {
            int howManyToFieldBuy = gameModel.getFieldsToBuy();
            if (howManyToFieldBuy != 0) {
                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow(howManyToFieldBuy);
                fieldEastService.save(meadow.getName(), meadow.getCostOfBuying(), meadow.getArea(), meadow.getInfo(), meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields(howManyToFieldBuy);
                fieldSupplyService.save(ploughtFields.getName(), ploughtFields.getCostOfBuying(), ploughtFields.getArea(), ploughtFields.getInfo(), ploughtFields.getSeed());
            }


        } else if (gameModel.getLocationId() == 3) {
            int howManyToFieldBuy = gameModel.getFieldsToBuy();
            if (howManyToFieldBuy != 0) {
                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow(howManyToFieldBuy);
                fieldCentralService.save(meadow.getName(), meadow.getCostOfBuying(), meadow.getArea(), meadow.getInfo(), meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields(howManyToFieldBuy);
                fieldSupplyService.save(ploughtFields.getName(), ploughtFields.getCostOfBuying(), ploughtFields.getArea(), ploughtFields.getInfo(), ploughtFields.getSeed());
            }


        } else if (gameModel.getLocationId() == 4) {
            int howManyToFieldBuy = gameModel.getFieldsToBuy();
            if (howManyToFieldBuy != 0) {
                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow(howManyToFieldBuy);
                fieldSouthService.save(meadow.getName(), meadow.getCostOfBuying(), meadow.getArea(), meadow.getInfo(), meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields(howManyToFieldBuy);
                fieldSupplyService.save(ploughtFields.getName(), ploughtFields.getCostOfBuying(), ploughtFields.getArea(), ploughtFields.getInfo(), ploughtFields.getSeed());

            }

        } else if (gameModel.getLocationId() == 5) {
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
    public void addNewGoods(GameModel gameModel) {

        if (gameModel.getLocationId() == 1) {
            String nameOfNewGoods = gameModel.getGoodsName();
            if (nameOfNewGoods != null) {
                if (!nameOfNewGoods.equals("Brak nowego towaru")) {
                    GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfNewGoods);
                    GoodsNorthEntities goodsNorthEntities = goodsNorthDao.findByName(nameOfNewGoods);
                    if (goodsNorthEntities == null) {
                        goodsNorthService.save(goodsAvailableEntities.getName(), goodsAvailableEntities.getUsingMerchant(), goodsAvailableEntities.getTyp());
                    }
                }
            }


        } else if (gameModel.getLocationId() == 2) {
            String nameOfNewGoods = gameModel.getGoodsName();
            if (nameOfNewGoods != null) {
                if (!nameOfNewGoods.equals("Brak nowego towaru")) {
                    GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfNewGoods);
                    GoodsEastEntities goodsEastEntities = goodsEastDao.findByName(nameOfNewGoods);
                    if (goodsEastEntities == null) {
                        goodsEastService.save(goodsAvailableEntities.getName(), goodsAvailableEntities.getUsingMerchant(), goodsAvailableEntities.getTyp());
                    }
                }
            }


        } else if (gameModel.getLocationId() == 3) {
            String nameOfNewGoods = gameModel.getGoodsName();
            if (nameOfNewGoods != null) {
                if (!nameOfNewGoods.equals("Brak nowego towaru")) {
                    GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfNewGoods);
                    GoodsCentralEntities goodsCentralEntities = goodsCentralDao.findByName(nameOfNewGoods);
                    if (goodsCentralEntities == null) {
                        goodsCentralService.save(goodsAvailableEntities.getName(), goodsAvailableEntities.getUsingMerchant(), goodsAvailableEntities.getTyp());
                    }
                }
            }


        } else if (gameModel.getLocationId() == 4) {
            String nameOfNewGoods = gameModel.getGoodsName();
            if (nameOfNewGoods != null) {
                if (!nameOfNewGoods.equals("Brak nowego towaru")) {
                    GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfNewGoods);
                    GoodsSouthEntities goodsSouthEntities = goodsSouthDao.findByName(nameOfNewGoods);
                    if (goodsSouthEntities == null) {
                        goodsSouthService.save(goodsAvailableEntities.getName(), goodsAvailableEntities.getUsingMerchant(), goodsAvailableEntities.getTyp());
                    }
                }

            }


        } else if (gameModel.getLocationId() == 5) {
            String nameOfNewGoods = gameModel.getGoodsName();
            if (nameOfNewGoods != null) {
                if (!nameOfNewGoods.equals("Brak nowego towaru")) {
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
    public void addNewBuilding(GameModel gameModel, Model model) {

        if (gameModel.getLocationId() == 1) {
            String name = gameModel.getBuildingName();
            BuildingsEntity buildings = buildingDao.findFirstByName(name);
            ;
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


        } else if (gameModel.getLocationId() == 2) {
            String name = gameModel.getBuildingName();
            if (name != null) {
                if (!name.equals("Brak nowego budynku")) {
                    BuildingsEntity buildings = buildingDao.findFirstByName(name);
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

        } else if (gameModel.getLocationId() == 3) {
            String name = gameModel.getBuildingName();
            if (name != null) {
                if (!name.equals("Brak nowego budynku")) {
                    BuildingsEntity buildings = buildingDao.findFirstByName(name);
                    ;
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


        } else if (gameModel.getLocationId() == 4) {
            String name = gameModel.getBuildingName();
            if (name != null) {
                if (!name.equals("Brak nowego budynku")) {
                    BuildingsEntity buildings = buildingDao.findFirstByName(name);
                    ;
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


        } else if (gameModel.getLocationId() == 5) {
            String name = gameModel.getBuildingName();
            if (name != null) {
                if (!name.equals("Brak nowego budynku")) {
                    BuildingsEntity buildings = buildingDao.findFirstByName(name);
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
            BuildingsEntity buildings = buildingDao.findFirstByName(nameOfbuilding);
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
    public void typeOfVilage(GameModel gameModel) {
        if (gameModel.getLocationId() == 1) {
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

        } else if (gameModel.getLocationId() == 2) {
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

        } else if (gameModel.getLocationId() == 3) {
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

        } else if (gameModel.getLocationId() == 4) {
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

        } else if (gameModel.getLocationId() == 5) {
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

        List<BuildingsSupplyEntity> supplyEntityList = buildingSupplyService.getAllData();
        if (supplyEntityList != null) {


            if (gameModel.getLocationId() == 1) {
                String name = gameModel.getAnimalInBuilding();
                BuildingsSupplyEntity buildingsSupplyEntity = buildingSupplyDao.findFirstByOrderByIdDesc();
                if (name != null & buildingsSupplyEntity != null) {
                    String nameOfBuilding = buildingsSupplyEntity.getName();
                    BuildingsEntity buildings = buildingDao.findByName(nameOfBuilding);
                    buildingNorthService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType(), name);
                    gameModel.setAnimalInBuilding(null);
                }

            } else if (gameModel.getLocationId() == 2) {
                String name = gameModel.getAnimalInBuilding();
                BuildingsSupplyEntity buildingsSupplyEntity = buildingSupplyDao.findFirstByOrderByIdDesc();
                if (name != null & buildingsSupplyEntity != null) {
                    String nameOfBuilding = buildingsSupplyEntity.getName();
                    BuildingsEntity buildings = buildingDao.findByName(nameOfBuilding);
                    buildingEastService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType(), name);
                    gameModel.setAnimalInBuilding(null);
                }

            } else if (gameModel.getLocationId() == 3) {
                String name = gameModel.getAnimalInBuilding();
                BuildingsSupplyEntity buildingsSupplyEntity = buildingSupplyDao.findFirstByOrderByIdDesc();
                if (name != null & buildingsSupplyEntity != null) {
                    String nameOfBuilding = buildingsSupplyEntity.getName();
                    BuildingsEntity buildings = buildingDao.findByName(nameOfBuilding);
                    buildingCentralService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType(), name);
                    gameModel.setAnimalInBuilding(null);
                }

            } else if (gameModel.getLocationId() == 4) {
                String name = gameModel.getAnimalInBuilding();
                BuildingsSupplyEntity buildingsSupplyEntity = buildingSupplyDao.findFirstByOrderByIdDesc();
                if (name != null & buildingsSupplyEntity != null) {
                    String nameOfBuilding = buildingsSupplyEntity.getName();
                    BuildingsEntity buildings = buildingDao.findByName(nameOfBuilding);
                    buildingSouthService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType(), name);
                    gameModel.setAnimalInBuilding(null);
                }

            } else if (gameModel.getLocationId() == 5) {
                String name = gameModel.getAnimalInBuilding();
                BuildingsSupplyEntity buildingsSupplyEntity = buildingSupplyDao.findFirstByOrderByIdDesc();
                if (name != null & buildingsSupplyEntity != null) {
                    String nameOfBuilding = buildingsSupplyEntity.getName();
                    BuildingsEntity buildings = buildingDao.findByName(nameOfBuilding);
                    buildingWestService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType(), name);
                    gameModel.setAnimalInBuilding(null);
                }
            }

        }
    }

    @Override
    public void supplyedField(Model model) {

        FieldsSupplyEntity fieldsSupplyEntity = fieldSupplyDao.findFirstByOrderByIdDesc();
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
            if (fieldsSupplyEntity != null) {
                fieldNorthService.save(fieldsSupplyEntity.getName(), fieldsSupplyEntity.getCostOfBuying(), fieldsSupplyEntity.getArea(), fieldsSupplyEntity.getInfo(), nameOfPlant);
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
        if (field != null) {
            fieldSupplyDao.deleteAll();
        }

    }

    @Override
    public void availableGoodsToSell(GameModel gameModel) {

        List<GoodsAvailableEntities> goodsAvailableEntities = goodsAvailableService.getAllData();
        if (goodsAvailableEntities != null) {
            goodsAvailableDao.deleteAll();
        }
        goodsAvailableService.save("Brak nowego towaru", 0, 0);
        if (gameModel.getUnoccupiedMerchant() > 0) {
            if (gameModel.getLocationId() == 1) {
                List<BuildingsEntityNorth> northEntities = buildingNorthService.getAllData();
                for (BuildingsEntityNorth north :
                        northEntities) {
                    String animal = north.getAnimalInBuilding();
                    AnimalsEntity animalsEntity = animalDao.findByName(animal);
                    if (north.getProducts1() != null) {
                        goodsAvailableService.save(north.getProducts1(), 1, north.getType());
                    } else if (animalsEntity != null) {
                        goodsAvailableService.save(animalsEntity.getName(), 1, animalsEntity.getTyp());
                    }
                }

                List<FieldNorthEntity> northFieldEntities = fieldNorthService.getAllData();
                for (FieldNorthEntity northField :
                        northFieldEntities) {
                    String plant = northField.getSeed();
                    if (plant != null) {
                        goodsAvailableService.save(northField.getSeed(), 1, 1);
                    }
                }


            } else if (gameModel.getLocationId() == 2) {
                List<BuildingsEntityEast> eastEntities = buildingEastService.getAllData();
                for (BuildingsEntityEast east :
                        eastEntities) {
                    String animal = east.getAnimalInBuilding();
                    AnimalsEntity animalsEntity = animalDao.findByName(animal);
                    if (east.getProducts1() != null) {
                        goodsAvailableService.save(east.getProducts1(), 1, east.getType());
                    } else if (animalsEntity != null) {
                        goodsAvailableService.save(animalsEntity.getName(), 1, animalsEntity.getTyp());
                    }
                }
                List<FieldEastEntity> eastFieldEntities = fieldEastService.getAllData();
                for (FieldEastEntity eastField :
                        eastFieldEntities) {
                    String plant = eastField.getSeed();
                    if (plant != null) {
                        goodsAvailableService.save(eastField.getSeed(), 1, 1);
                    }
                }


            } else if (gameModel.getLocationId() == 3) {
                List<BuildingsEntityCentral> centralEntities = buildingCentralService.getAllData();
                for (BuildingsEntityCentral central :
                        centralEntities) {
                    String animal = central.getAnimalInBuilding();
                    AnimalsEntity animalsEntity = animalDao.findByName(animal);
                    if (central.getProducts1() != null) {
                        goodsAvailableService.save(central.getProducts1(), 1, central.getType());
                    } else if (animalsEntity != null) {
                        goodsAvailableService.save(animalsEntity.getName(), 1, animalsEntity.getTyp());
                    }
                }
                List<FieldCentralEntity> centralFieldEntities = fieldCentralService.getAllData();
                for (FieldCentralEntity centralField :
                        centralFieldEntities) {
                    String plant = centralField.getSeed();
                    if (plant != null) {
                        goodsAvailableService.save(centralField.getSeed(), 1, 1);
                    }
                }


            } else if (gameModel.getLocationId() == 4) {
                List<BuildingsEntitySouth> southEntities = buildingSouthService.getAllData();
                for (BuildingsEntitySouth south :
                        southEntities) {
                    String animal = south.getAnimalInBuilding();
                    AnimalsEntity animalsEntity = animalDao.findByName(animal);
                    if (south.getProducts1() != null) {
                        goodsAvailableService.save(south.getProducts1(), 1, south.getType());
                    } else if (animalsEntity != null) {
                        goodsAvailableService.save(animalsEntity.getName(), 1, animalsEntity.getTyp());
                    }
                }
                List<FieldSouthEntity> southFieldEntities = fieldSouthService.getAllData();
                for (FieldSouthEntity southField :
                        southFieldEntities) {
                    String plant = southField.getSeed();
                    if (plant != null) {
                        goodsAvailableService.save(southField.getSeed(), 1, 1);
                    }
                }


            } else if (gameModel.getLocationId() == 5) {
                List<BuildingsEntityWest> westEntities = buildingWestService.getAllData();
                for (BuildingsEntityWest west :
                        westEntities) {
                    String animal = west.getAnimalInBuilding();
                    AnimalsEntity animalsEntity = animalDao.findByName(animal);
                    if (west.getProducts1() != null) {
                        goodsAvailableService.save(west.getProducts1(), 1, west.getType());
                    } else if (animalsEntity != null) {
                        goodsAvailableService.save(animalsEntity.getName(), 1, animalsEntity.getTyp());
                    }
                }
                List<FieldWestEntity> westFieldEntities = fieldWestService.getAllData();
                for (FieldWestEntity westField :
                        westFieldEntities) {
                    String plant = westField.getSeed();
                    if (plant != null) {
                        goodsAvailableService.save(westField.getSeed(), 1, 1);
                    }
                }

            }


        }
    }

    @Override
    public void createBuildingTable() {

        List<BuildingsEntity> buildingsEntities = buildingService.getAllData();
        if (buildingsEntities != null) {
            buildingDao.deleteAll();
        }

        buildingService.save("Brak nowego budynku", null, null, null, null, BigDecimal.valueOf(0.0), null, null, null, null, "nie dodaje niczego", null, null, null, 0, 2);
        buildingService.save("Kurnik", null, null, null, null, BigDecimal.valueOf(40.0), null, null, null, null, "umożliwia hodowle kur lub kaczek", null, 100, null, 1, 2);
        buildingService.save("Gęsiarnia", null, null, null, null, BigDecimal.valueOf(40.0), null, null, null, null, "umożliwia hodowle kur lub gęsi lub kaczek", null, 50, null, 1, 2);
        buildingService.save("Królikarnia", null, null, null, null, BigDecimal.valueOf(20.0), null, null, null, null, "umożliwia hodowle królików", null, 100, null, 1, 2);
        buildingService.save("Zagroda", null, null, null, null, BigDecimal.valueOf(60.0), "pasterka", null, null, null, "umożliwia hodowle kuz, owiec lub osłów", null, 100, null, 1, 2);
        buildingService.save("Chlew", null, null, null, null, BigDecimal.valueOf(60.0), "dom sołtysa", "pasterka", null, null, "umożliwia hodowle świń", null, 100, null, 1, 2);
        buildingService.save("Stajnia", null, null, null, null, BigDecimal.valueOf(200.0), "kasztel", "dwór", null, null, "umożliwia hodowle krów", null, 100, null, 1, 2);
        buildingService.save("Stadnina", null, null, null, null, BigDecimal.valueOf(300.0), "zamek", "pałac", null, null, "umożliwia hodowle koni", null, 20, null, 1, 2);
        buildingService.save("Staw", "Ryby", null, null, null, BigDecimal.valueOf(400.0), null, null, null, null, "umożliwia hodowle ryb", null, null, null, 0, 2);
        buildingService.save("Gnojownik", null, null, null, null, BigDecimal.valueOf(50.0), "stajnia", "chlew", null, null, "podwojenie plonu wybranej rośliny", null, null, null, 0, 2);
        buildingService.save("Droga", null, null, null, null, BigDecimal.valueOf(25.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, null, null, 0, 2);
        buildingService.save("Drogowskazy", null, null, null, null, BigDecimal.valueOf(50.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, null, null, 0, 2);
        buildingService.save("Słupy graniczne", null, null, null, null, BigDecimal.valueOf(100.0), "drogowskazy", null, null, null, "dodaje jedno miejsce handlowe", null, null, null, 0, 2);
        buildingService.save("Kapliczka", null, null, null, null, BigDecimal.valueOf(150.0), null, null, null, null, "raz na poziom można pominąć wydarzenie", null, null, null, 0, 2);
        buildingService.save("Studnia", null, null, null, null, BigDecimal.valueOf(30.0), null, null, null, null, "zaopatrzenie w wodę podczas suszy", null, null, null, 0, 2);
        buildingService.save("Mała stadnina", null, null, null, null, BigDecimal.valueOf(150.0), null, null, null, null, "umożliwia hodowle dzikich koni", 20, 10, "Wschód", 1, 2);
    }

    @Override
    public void createLocationBuildingTable() {

        List<BuildingsEntityNorth> buildingsEntities = buildingNorthService.getAllData();
        if (buildingsEntities != null) {
            buildingNorthDao.deleteAll();
        }

        buildingNorthService.save("Skład", null, null, null, null, BigDecimal.valueOf(50.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, 1, null, 1, 2, null);
        buildingNorthService.save("Skład", null, null, null, null, BigDecimal.valueOf(50.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, 1, null, 1, 2, null);
        buildingNorthService.save("Skład", null, null, null, null, BigDecimal.valueOf(50.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, 1, null, 1, 2, null);

        List<BuildingsEntityEast> buildingsEastEntities = buildingEastService.getAllData();
        if (buildingsEastEntities != null) {
            buildingEastDao.deleteAll();
        }

        buildingEastService.save("Skład", null, null, null, null, BigDecimal.valueOf(50.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, 1, null, 1, 2, null);
        buildingEastService.save("Skład", null, null, null, null, BigDecimal.valueOf(50.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, 1, null, 1, 2, null);
        buildingEastService.save("Skład", null, null, null, null, BigDecimal.valueOf(50.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, 1, null, 1, 2, null);
        buildingEastService.save("Mała stadnina", null, null, null, null, BigDecimal.valueOf(150.0), null, null, null, null, "umożliwia hodowle dzikich koni", 10, null, "Wschód", 1, 2, "Mustang");

        List<BuildingsEntityCentral> buildingsCentralEntities = buildingCentralService.getAllData();
        if (buildingsCentralEntities != null) {
            buildingCentralDao.deleteAll();
        }

        buildingCentralService.save("Skład", null, null, null, null, BigDecimal.valueOf(50.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, 1, null, 1, 2, null);
        buildingCentralService.save("Skład", null, null, null, null, BigDecimal.valueOf(50.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, 1, null, 1, 2, null);
        buildingCentralService.save("Skład", null, null, null, null, BigDecimal.valueOf(50.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, 1, null, 1, 2, null);

        List<BuildingsEntitySouth> buildingsSouthEntities = buildingSouthService.getAllData();
        if (buildingsSouthEntities != null) {
            buildingSouthDao.deleteAll();
        }

        buildingSouthService.save("Skład", null, null, null, null, BigDecimal.valueOf(50.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, 1, null, 1, 2, null);
        buildingSouthService.save("Skład", null, null, null, null, BigDecimal.valueOf(50.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, 1, null, 1, 2, null);
        buildingSouthService.save("Skład", null, null, null, null, BigDecimal.valueOf(50.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, 1, null, 1, 2, null);

        List<BuildingsEntityWest> buildingsWestEntities = buildingWestService.getAllData();
        if (buildingsWestEntities != null) {
            buildingWestDao.deleteAll();
        }

        buildingWestService.save("Skład", null, null, null, null, BigDecimal.valueOf(50.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, 1, null, 1, 2, null);
        buildingWestService.save("Skład", null, null, null, null, BigDecimal.valueOf(50.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, 1, null, 1, 2, null);
        buildingWestService.save("Skład", null, null, null, null, BigDecimal.valueOf(50.0), null, null, null, null, "dodaje jedno miejsce handlowe", null, 1, null, 1, 2, null);


    }

    @Override
    public void createAnimalTable() {

        List<AnimalsEntity> animalsEntities = animalsService.getAllData();
        if (animalsEntities != null) {
            animalDao.deleteAll();
        }

        animalsService.save("Kury", "Jaja", null, BigDecimal.valueOf(1.0), BigDecimal.valueOf(25.0), BigDecimal.valueOf(1.0), "Kurnik", "Zboże", 27.5, null, null, "sprzedaż jaj wymaga składu", null, 2);
        animalsService.save("Kaczki", null, null, BigDecimal.valueOf(4.5), null, BigDecimal.valueOf(1.5), "staw, tama lub rzeka oraz kurnik", null, null, null, null, null, null, 2);
        animalsService.save("Króliki", null, null, BigDecimal.valueOf(1.5), null, BigDecimal.valueOf(1.5), "królikarnia", "Łąka", 9.0, null, null, null, null, 2);
        animalsService.save("Gęsi", "Pierze", null, BigDecimal.valueOf(2.5), BigDecimal.valueOf(2.4), BigDecimal.valueOf(2.5), "staw, tama lub rzeka oraz kurnik", "Zboże", 22.8, null, null, "ostzrzeżenie przed bandytami", null, 2);
        animalsService.save("Kozy", null, null, BigDecimal.valueOf(15.0), null, BigDecimal.valueOf(15.0), "Zagroda", "Łąka", 15.0, null, null, null, null, 2);
        animalsService.save("Owce", "Wełna", null, BigDecimal.valueOf(20.0), BigDecimal.valueOf(7.5), BigDecimal.valueOf(20.00), "Zagroda", "Łąka", 30.0, null, null, null, null, 2);
        animalsService.save("Świnie", null, null, BigDecimal.valueOf(75.0), null, BigDecimal.valueOf(75.0), "Chlew", "Zboże", 87.5, null, null, null, null, 2);
        animalsService.save("Krowy", null, null, BigDecimal.valueOf(90.0), null, BigDecimal.valueOf(90.0), "Stajnia", "Łąka", 30.0, null, null, "+10 do plonów jeśli jest gnojownik", null, 2);
        animalsService.save("Konie", null, null, BigDecimal.valueOf(150.0), null, BigDecimal.valueOf(150.0), "Stadnina", "Łąka", 8.0, "Owies", 20.0, "+25% do plonów", null, 2);
        animalsService.save("Ryby", null, null, BigDecimal.valueOf(10.0), null, BigDecimal.valueOf(10.0), "Staw, Tama lub Rzeka", null, null, null, null, null, null, 2);
        animalsService.save("Pszczoły", null, null, null, null, BigDecimal.valueOf(4.0), "Chatka pszczelarza", null, null, null, null, null, null, 2);
        animalsService.save("Jeleń", null, null, BigDecimal.valueOf(120.0), null, null, "Zagroda leśna", "Łąka", 30.0, null, null, null, "Północ", 2);
        animalsService.save("Osioł", null, null, BigDecimal.valueOf(120.0), null, BigDecimal.valueOf(120.0), "Zagroda", "Łąka", 36.5, null, null, "Dodaje 3 miejsca handlowe", "Zachód", 2);
        animalsService.save("Zwierzęta futerkowe", "Futra", null, BigDecimal.valueOf(200.0), null, BigDecimal.valueOf(60.0), "Zagroda", "Kury", 100.0, null, null, null, null, 2);
        animalsService.save("Jedwabniki", "Nić jedwabna", null, BigDecimal.valueOf(200.0), null, BigDecimal.valueOf(60.0), "Las", "Las", 10.0, null, null, null, null, 2);
        animalsService.save("Mustang", null, null, BigDecimal.valueOf(75.0), null, BigDecimal.valueOf(150.0), "Mała stadnina", "Łąka", 8.0, "Owies", 20.0, "+25% do plonów", "Wschód", 2);

    }

    @Override
    public void createLocationFieldTable() {

        List<FieldCentralEntity> fieldCentralEntities = fieldCentralService.getAllData();
        if (fieldCentralEntities != null) {
            fieldCentralDao.deleteAll();
        }

        fieldCentralService.save("Pole", BigDecimal.valueOf(1350.0), 27, "Można je obsiać roślinami", "Pszenica jara");
        fieldCentralService.save("Łąka", BigDecimal.valueOf(1350.0), 27, "Podstawa do hodowli zwierząt", null);

        List<FieldEastEntity> fieldEastEntities = fieldEastService.getAllData();
        if (fieldEastEntities != null) {
            fieldEastDao.deleteAll();
        }

        fieldEastService.save("Pole", BigDecimal.valueOf(1350.0), 27, "Można je obsiać roślinami", "Owies");
        fieldEastService.save("Łąka", BigDecimal.valueOf(1350.0), 27, "Podstawa do hodowli zwierząt", null);

        List<FieldNorthEntity> fieldNorthEntities = fieldNorthService.getAllData();
        if (fieldNorthEntities != null) {
            fieldNorthDao.deleteAll();
        }

        fieldNorthService.save("Pole", BigDecimal.valueOf(1350.0), 27, "Można je obsiać roślinami", "Pszenica ozima");
        fieldNorthService.save("Łąka", BigDecimal.valueOf(1350.0), 27, "Podstawa do hodowli zwierząt", null);

        List<FieldSouthEntity> fieldSouthEntities = fieldSouthService.getAllData();
        if (fieldSouthEntities != null) {
            fieldSouthDao.deleteAll();
        }

        fieldSouthService.save("Pole", BigDecimal.valueOf(1350.0), 27, "Można je obsiać roślinami", "Jęczmień");
        fieldSouthService.save("Łąka", BigDecimal.valueOf(1350.0), 27, "Podstawa do hodowli zwierząt", null);

        List<FieldWestEntity> fieldWestEntities = fieldWestService.getAllData();
        if (fieldWestEntities != null) {
            fieldWestDao.deleteAll();
        }

        fieldWestService.save("Pole", BigDecimal.valueOf(1350.0), 27, "Można je obsiać roślinami", "Żyto");
        fieldWestService.save("Łąka", BigDecimal.valueOf(1350.0), 27, "Podstawa do hodowli zwierząt", null);

    }

    @Override
    public void createFieldTable() {

        List<FieldsEntity> fieldsEntities = fieldService.getAllData();
        if (fieldsEntities != null) {
            fieldDao.deleteAll();
        }

        fieldService.save("Pole", BigDecimal.valueOf(50), 1, "Można je obsiać roślinami");
        fieldService.save("Łąka", BigDecimal.valueOf(50), 1, "Podstawa do hodowli zwierząt");
    }

    @Override
    public void createPlantTable() {

        List<PlantsEntity> plantsEntities = plantService.getAllData();
        if (plantsEntities != null) {
            plantsDao.deleteAll();
        }

        plantService.save("Owies", "Owies", BigDecimal.valueOf(0.125), 3.4, BigDecimal.valueOf(0.1), null, "Zboże służące jako pasza dla koni", null, null, "Zboże");
        plantService.save("Jęczmień", "Jęczmień", BigDecimal.valueOf(0.57), 4.0, BigDecimal.valueOf(0.1), null, "odporne na zarazy", null, null, "Zboże");
        plantService.save("Żyto", "Żyto", BigDecimal.valueOf(0.54), 6.25, BigDecimal.valueOf(0.1), null, "Służy do produkcji piwa i mąki", null, null, "Zboże");
        plantService.save("Pszenica jara", "Pszenica jara", BigDecimal.valueOf(0.64), 5.0, BigDecimal.valueOf(0.1), null, "Służy do produkcji mąki", null, null, "Zboże");
        plantService.save("Pszenica ozima", "Pszenica ozima", BigDecimal.valueOf(0.58), 4.5, BigDecimal.valueOf(0.1), null, "Odporna na zimno", null, null, "Zboże");


    }

    @Override
    public void createLocationGoods() {

        List<GoodsCentralEntities> goodsCentralEntities = goodsCentralService.getAllData();
        if (goodsCentralEntities != null) {
            goodsCentralDao.deleteAll();
        }

        goodsCentralService.save("Pszenica jara", 1, 1);

        List<GoodsEastEntities> goodsEastEntities = goodsEastService.getAllData();
        if (goodsEastEntities != null) {
            goodsEastDao.deleteAll();
        }

        goodsEastService.save("Owies", 1, 1);
        goodsEastService.save("Mustang", 1, 2);

        List<GoodsNorthEntities> goodsNorthEntities = goodsNorthService.getAllData();
        if (goodsNorthEntities != null) {
            goodsNorthDao.deleteAll();
        }

        goodsNorthService.save("Pszenica ozima", 1, 1);

        List<GoodsSouthEntities> goodsSouthEntities = goodsSouthService.getAllData();
        if (goodsSouthEntities != null) {
            goodsSouthDao.deleteAll();
        }

        goodsSouthService.save("Jęczmień", 1, 1);

        List<GoodsWestEntities> goodsWestEntities = goodsWestService.getAllData();
        if (goodsWestEntities != null) {
            goodsWestDao.deleteAll();
        }

        goodsWestService.save("Żyto", 1, 1);


    }

    @Override
    public void createEventTable() {

        List<GameEventEntity> event = gameEventService.getAllData();
        if (event != null) {
            gameEventDao.deleteAll();
        }

        gameEventService.save("Ciepłe lato", "Lato tego roku było bardzo piękne");
        gameEventService.save("Zbiegły koń", "Koń przebiegł przez waszą wieś");
        gameEventService.save("Koński apetyt", "Wasze konie zjadły tyle ile zawsze");
        gameEventService.save("Sądny dzień", "Wioskowy sędzia wydał sprawiedliwy wyrok");
        gameEventService.save("Ujadające psy", "Psy oszczekały wieśniaka");
        gameEventService.save("Dziecięce zabawy", "Dzieci lubią bawić się na łące");
        gameEventService.save("Zimowe opowieści", "Starszy wioski opowiada w zimie wspaniałe historie");
        gameEventService.save("Ocielenie", "Krowa miała jedno ciele");
        gameEventService.save("Fetor", "Wasz gnojownik bardzo śmierdzi");
        gameEventService.save("Gliniane naczynia", "Wasze naczynia są przepiękne");
        gameEventService.save("Stokrotki", "W wiosce na trawniku rosną stokrotki");
        gameEventService.save("Złoże granitu", "w okolicy odnajdujesz złożę granitu");
        gameEventService.save("Obserwacja", "Waszą wioskę obserwują bandyci");
        gameEventService.save("Prawo ciążenia", "Wioskowy głupek mówi że jabłka spadają pod wpływem grawitacji ");
        gameEventService.save("Golenie", "Rolnik pierdnął podczas golenia zacinając się przy tym");
        gameEventService.save("Miauczące koty", "Koty w marcu strasznie się darły");
        gameEventService.save("Dominacja w wiosce", "Kogut pogonił psa");
        gameEventService.save("Sianokosy", "Udało wam się zebrać wspaniałe siono");
        gameEventService.save("Kwoka", "Kwoka siadła na jajkach");


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
