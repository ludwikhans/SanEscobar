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

    public GameService(BuildingNorthService buildingNorthService, FieldNorthService fieldNorthService, GoodsNorthService goodsNorthService, BuildingEastService buildingEastService, FieldEastService fieldEastService, GoodsEastService goodsEastService, BuildingWestService buildingWestService, FieldWestService fieldWestService, GoodsWestService goodsWestService, BuildingSouthService buildingSouthService, FieldSouthService fieldSouthService, GoodsSouthService goodsSouthService, BuildingCentralService buildingCentralService, FieldCentralService fieldCentralService, GoodsCentralService goodsCentralService, FieldNorthDao fieldNorthDao, FieldEastDao fieldEastDao, FieldCentralDao fieldCentralDao, FieldSouthDao fieldSouthDao, FieldWestDao fieldWestDao, BuildingCentralDao buildingCentralDao, BuildingEastDao buildingEastDao, BuildingNorthDao buildingNorthDao, BuildingSouthDao buildingSouthDao, BuildingWestDao buildingWestDao, GoodsCentralDao goodsCentralDao, GoodsEastDao goodsEastDao, GoodsNorthDao goodsNorthDao, GoodsSouthDao goodsSouthDao, GoodsWestDao goodsWestDao, PlantsDao plantsDao, BuildingDao buildingDao, AnimalDao animalDao, BuildingService buildingService, BuildingAvailableService availableBuildingService, AvailableBuildingDao availableBuildingDao, VilageService vilageService, GoodsAvailableService goodsAvailableService, GoodsAvailableDao goodsAvailableDao) {
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


        if (vilage.getLocationId() == 1) {
            String nameOfProduct = null;
            List<GoodsNorthEntities> northEntities = goodsNorthService.getAllData();
            for (GoodsNorthEntities nameOfGoods :
                    northEntities) {
                nameOfProduct = nameOfGoods.getName();
                if (nameOfGoods.getTyp() == 1) {
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
                        if (animalsEntity != null) {
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
                }
                BigDecimal field = toZero(gameModel.getIncomFromFields());
                BigDecimal building = toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncome = toZero(gameModel.getTotalIncome());
                totalIncome = totalIncome.add(field.add(building.add(animal))).setScale(2, RoundingMode.HALF_UP);
                gameModel.setTotalIncome(totalIncome);
            }

        } else if (vilage.getLocationId() == 2) {

            String nameOfProduct = null;
            List<GoodsEastEntities> eastEntities = goodsEastService.getAllData();
            for (GoodsEastEntities nameOfGoods :
                    eastEntities) {
                nameOfProduct = nameOfGoods.getName();
                if (nameOfGoods.getTyp() == 1) {
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
                        if (animalsEntity != null) {
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
                }
                BigDecimal field = toZero(gameModel.getIncomFromFields());
                BigDecimal building = toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncome = toZero(gameModel.getTotalIncome());
                totalIncome = totalIncome.add(field.add(building.add(animal))).setScale(2, RoundingMode.HALF_UP);
                gameModel.setTotalIncome(totalIncome);
            }

        } else if (vilage.getLocationId() == 3) {

            String nameOfProduct = null;
            List<GoodsCentralEntities> centralEntities = goodsCentralService.getAllData();
            for (GoodsCentralEntities nameOfGoods :
                    centralEntities) {
                nameOfProduct = nameOfGoods.getName();
                if (nameOfGoods.getTyp() == 1) {
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
                        if (animalsEntity != null) {
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
                }
                BigDecimal field = toZero(gameModel.getIncomFromFields());
                BigDecimal building = toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncome = toZero(gameModel.getTotalIncome());
                totalIncome = totalIncome.add(field.add(building.add(animal))).setScale(2, RoundingMode.HALF_UP);
                gameModel.setTotalIncome(totalIncome);
            }

        } else if (vilage.getLocationId() == 4) {

            String nameOfProduct = null;
            List<GoodsSouthEntities> southEntities = goodsSouthService.getAllData();
            for (GoodsSouthEntities nameOfGoods :
                    southEntities) {
                nameOfProduct = nameOfGoods.getName();
                if (nameOfGoods.getTyp() == 1) {
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
                        if (animalsEntity != null) {
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
                }
                BigDecimal field = toZero(gameModel.getIncomFromFields());
                BigDecimal building = toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncome = toZero(gameModel.getTotalIncome());
                totalIncome = totalIncome.add(field.add(building.add(animal))).setScale(2, RoundingMode.HALF_UP);
                gameModel.setTotalIncome(totalIncome);
            }

        } else if (vilage.getLocationId() == 5) {

            String nameOfProduct = null;
            List<GoodsWestEntities> westEntities = goodsWestService.getAllData();
            for (GoodsWestEntities nameOfGoods :
                    westEntities) {
                nameOfProduct = nameOfGoods.getName();
                if (nameOfGoods.getTyp() == 1) {
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
                        if (animalsEntity != null) {
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
                }
                BigDecimal field = toZero(gameModel.getIncomFromFields());
                BigDecimal building = toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncome = toZero(gameModel.getTotalIncome());
                totalIncome = totalIncome.add(field.add(building.add(animal))).setScale(2, RoundingMode.HALF_UP);
                gameModel.setTotalIncome(totalIncome);
            }
        }


    }

    @Override
    public void availableToBuyFirstBuilding(GameModel gameModel, Model model) {
        List<BuildingsAvailableEntity> existBuilding = availableBuildingService.getAllData();
        if (existBuilding != null) {
            availableBuildingDao.deleteAll();
        }

        BigDecimal money = gameModel.getStartMoney();
        int moneyInInt = money.intValue();
        List<BuildingsEntity> allBuildings = buildingService.getAllData();
        availableBuildingService.save("Brak nowego budynku");
        for (int j = 1; j <= allBuildings.size(); j++) {
            BuildingsEntity budynki = buildingDao.findById(j);
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
        BigDecimal starMoney = gameModel.getStartMoney();
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
                fieldNorthService.save(ploughtFields.getName(), ploughtFields.getCostOfBuying(), ploughtFields.getArea(), ploughtFields.getInfo(), ploughtFields.getSeed());

            }


        } else if (vilage.getLocationId() == 2) {
            int howManyToFieldBuy = gameModel.getFieldsToBuy();
            if (howManyToFieldBuy != 0) {
                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow(howManyToFieldBuy);
                fieldEastService.save(meadow.getName(), meadow.getCostOfBuying(), meadow.getArea(), meadow.getInfo(), meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields(howManyToFieldBuy);
                fieldEastService.save(ploughtFields.getName(), ploughtFields.getCostOfBuying(), ploughtFields.getArea(), ploughtFields.getInfo(), ploughtFields.getSeed());
            }


        } else if (vilage.getLocationId() == 3) {
            int howManyToFieldBuy = gameModel.getFieldsToBuy();
            if (howManyToFieldBuy != 0) {
                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow(howManyToFieldBuy);
                fieldCentralService.save(meadow.getName(), meadow.getCostOfBuying(), meadow.getArea(), meadow.getInfo(), meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields(howManyToFieldBuy);
                fieldCentralService.save(ploughtFields.getName(), ploughtFields.getCostOfBuying(), ploughtFields.getArea(), ploughtFields.getInfo(), ploughtFields.getSeed());
            }


        } else if (vilage.getLocationId() == 4) {
            int howManyToFieldBuy = gameModel.getFieldsToBuy();
            if (howManyToFieldBuy != 0) {
                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow(howManyToFieldBuy);
                fieldSouthService.save(meadow.getName(), meadow.getCostOfBuying(), meadow.getArea(), meadow.getInfo(), meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields(howManyToFieldBuy);
                fieldSouthService.save(ploughtFields.getName(), ploughtFields.getCostOfBuying(), ploughtFields.getArea(), ploughtFields.getInfo(), ploughtFields.getSeed());

            }

        } else if (vilage.getLocationId() == 5) {
            int howManyToFieldBuy = gameModel.getFieldsToBuy();
            if (howManyToFieldBuy != 0) {
                FieldsModelOfMeadow meadow = new FieldsModelOfMeadow(howManyToFieldBuy);
                fieldWestService.save(meadow.getName(), meadow.getCostOfBuying(), meadow.getArea(), meadow.getInfo(), meadow.getSeed());
                FieldsModelOfPloughtFields ploughtFields = new FieldsModelOfPloughtFields(howManyToFieldBuy);
                fieldWestService.save(ploughtFields.getName(), ploughtFields.getCostOfBuying(), ploughtFields.getArea(), ploughtFields.getInfo(), ploughtFields.getSeed());
            }
        }
    }

    @Override
    public void addAvailableGoods(Model model) {
        List<GoodsAvailableEntities> availableGoods = goodsAvailableService.getAllData();
        model.addAttribute("goodsToSell", availableGoods);
    }

    @Override
    public void addNewGoods(GameModel gameModel, VilageEntity vilage) {

        if (vilage.getLocationId() == 1) {
            String nameOfNewGoods = gameModel.getGoodsName();
            if (nameOfNewGoods != "Brak nowego towaru") {
                GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfNewGoods);
                GoodsNorthEntities goodsNorthEntities = goodsNorthDao.findByName(nameOfNewGoods);
                if (goodsNorthEntities == null) {
                    goodsNorthService.save(goodsAvailableEntities.getName(), goodsAvailableEntities.getUsingMerchant(), goodsAvailableEntities.getTyp());
                }
            }


        } else if (vilage.getLocationId() == 2) {
            String nameOfNewGoods = gameModel.getGoodsName();
            if (nameOfNewGoods != "Brak nowego towaru") {
                GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfNewGoods);
                GoodsEastEntities goodsEastEntities = goodsEastDao.findByName(nameOfNewGoods);
                if (goodsEastEntities == null) {
                    goodsEastService.save(goodsAvailableEntities.getName(), goodsAvailableEntities.getUsingMerchant(), goodsAvailableEntities.getTyp());
                }
            }


        } else if (vilage.getLocationId() == 3) {
            String nameOfNewGoods = gameModel.getGoodsName();
            if (nameOfNewGoods != "Brak nowego towaru") {
                GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfNewGoods);
                GoodsCentralEntities goodsCentralEntities = goodsCentralDao.findByName(nameOfNewGoods);
                if (goodsCentralEntities == null) {
                    goodsCentralService.save(goodsAvailableEntities.getName(), goodsAvailableEntities.getUsingMerchant(), goodsAvailableEntities.getTyp());
                }
            }


        } else if (vilage.getLocationId() == 4) {
            String nameOfNewGoods = gameModel.getGoodsName();
            if (nameOfNewGoods != "Brak nowego towaru") {
                GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfNewGoods);
                GoodsSouthEntities goodsSouthEntities = goodsSouthDao.findByName(nameOfNewGoods);
                if (goodsSouthEntities == null) {
                    goodsSouthService.save(goodsAvailableEntities.getName(), goodsAvailableEntities.getUsingMerchant(), goodsAvailableEntities.getTyp());
                }
            }


        } else if (vilage.getLocationId() == 5) {
            String nameOfNewGoods = gameModel.getGoodsName();
            if (nameOfNewGoods != "Brak nowego towaru") {
                GoodsAvailableEntities goodsAvailableEntities = goodsAvailableDao.findByName(nameOfNewGoods);
                GoodsWestEntities goodsWestEntities = goodsWestDao.findByName(nameOfNewGoods);
                if (goodsWestEntities == null) {
                    goodsWestService.save(goodsAvailableEntities.getName(), goodsAvailableEntities.getUsingMerchant(), goodsAvailableEntities.getTyp());
                }
            }
        }
    }

    @Override
    public void addNewBuilding(VilageEntity vilage, GameModel gameModel) {

        if (vilage.getLocationId() == 1) {
            String name = gameModel.getBuildingName();
            if (name != "Brak nowego budynku") {
                BuildingsEntity buildings = buildingDao.findByName(name);
                buildingNorthService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType());
            }

        } else if (vilage.getLocationId() == 2) {
            String name = gameModel.getBuildingName();
            if (name != "Brak nowego budynku") {
                BuildingsEntity buildings = buildingDao.findByName(name);
                buildingEastService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType());
            }

        } else if (vilage.getLocationId() == 3) {
            String name = gameModel.getBuildingName();
            if (name != "Brak nowego budynku") {
                BuildingsEntity buildings = buildingDao.findByName(name);
                buildingCentralService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType());
            }

        } else if (vilage.getLocationId() == 4) {
            String name = gameModel.getBuildingName();
            if (name != "Brak nowego budynku") {
                BuildingsEntity buildings = buildingDao.findByName(name);
                buildingSouthService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType());
            }

        } else if (vilage.getLocationId() == 5) {
            String name = gameModel.getBuildingName();
            if (name != "Brak nowego budynku") {
                BuildingsEntity buildings = buildingDao.findByName(name);
                buildingWestService.save(buildings.getName(), buildings.getProducts1(), buildings.getProducts2(), buildings.getMoneyProfit1(), buildings.getMoneyProfit2(), buildings.getCostOfBuilding(), buildings.getRequirements1(), buildings.getRequirements2(), buildings.getSuistenance(), buildings.getValueOfSuistenance(), buildings.getInfo(), buildings.getNumberOfAnimal(), buildings.getPlaceForGoods(), buildings.getSpecialFor(), 1, buildings.getType());
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
        if (nameOfbuilding == "Brak nowego budynku") {
            costOfBuilding = BigDecimal.valueOf(0);
        } else {
            BuildingsEntity buildings = buildingDao.findByName(nameOfbuilding);
            costOfBuilding = buildings.getCostOfBuilding();
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
        BigDecimal startMoney = gameModel.getStartMoney();
        BigDecimal costOfShoping = gameModel.getSumOfCost();
        BigDecimal moneyForNextTurn = toZero(gameModel.getAvailableMoney());
        BigDecimal incomFromTurn = gameModel.getTotalIncome();
        BigDecimal balance = incomFromTurn.subtract(costOfShoping);
        BigDecimal startBalance = startMoney.add(balance);
        moneyForNextTurn = moneyForNextTurn.add(startBalance);
        gameModel.setStartMoney(BigDecimal.valueOf(0));
        gameModel.setAvailableMoney(moneyForNextTurn);
    }

    @Override
    public void typeOfVilage(GameModel gameModel, VilageEntity vilage) {
        if (vilage.getLocationId() == 1) {
            BuildingsEntityNorth palisada = buildingNorthDao.findByName("Palisada");
            BuildingsEntityNorth studnia = buildingNorthDao.findByName("Studnia");
            BuildingsEntityNorth droga = buildingNorthDao.findByName("Droga");
            String typeOfVilage = null;
            if ((palisada != null) & (studnia != null) & (droga != null)) {
                typeOfVilage = "Wioska";
                gameModel.setTypeOfVilage(typeOfVilage);
            } else {
                typeOfVilage = "Przysiółek";
                gameModel.setTypeOfVilage(typeOfVilage);
            }

        } else if (vilage.getLocationId() == 2) {
            BuildingsEntityEast palisada = buildingEastDao.findByName("Palisada");
            BuildingsEntityEast studnia = buildingEastDao.findByName("Studnia");
            BuildingsEntityEast droga = buildingEastDao.findByName("Droga");
            String typeOfVilage = null;
            if ((palisada != null) & (studnia != null) & (droga != null)) {
                typeOfVilage = "Wioska";
                gameModel.setTypeOfVilage(typeOfVilage);
            } else {
                typeOfVilage = "Przysiółek";
                gameModel.setTypeOfVilage(typeOfVilage);
            }

        } else if (vilage.getLocationId() == 3) {
            BuildingsEntityCentral palisada = buildingCentralDao.findByName("Palisada");
            BuildingsEntityCentral studnia = buildingCentralDao.findByName("Studnia");
            BuildingsEntityCentral droga = buildingCentralDao.findByName("Droga");
            String typeOfVilage = null;
            if ((palisada != null) & (studnia != null) & (droga != null)) {
                typeOfVilage = "Wioska";
                gameModel.setTypeOfVilage(typeOfVilage);
            } else {
                typeOfVilage = "Przysiółek";
                gameModel.setTypeOfVilage(typeOfVilage);
            }

        } else if (vilage.getLocationId() == 4) {
            BuildingsEntitySouth palisada = buildingSouthDao.findByName("Palisada");
            BuildingsEntitySouth studnia = buildingSouthDao.findByName("Studnia");
            BuildingsEntitySouth droga = buildingSouthDao.findByName("Droga");
            String typeOfVilage = null;
            if ((palisada != null) & (studnia != null) & (droga != null)) {
                typeOfVilage = "Wioska";
                gameModel.setTypeOfVilage(typeOfVilage);
            } else {
                typeOfVilage = "Przysiółek";
                gameModel.setTypeOfVilage(typeOfVilage);
            }

        } else if (vilage.getLocationId() == 5) {
            BuildingsEntityWest palisada = buildingWestDao.findByName("Palisada");
            BuildingsEntityWest studnia = buildingWestDao.findByName("Studnia");
            BuildingsEntityWest droga = buildingWestDao.findByName("Droga");
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


    public void saveIntoTabela(String buildingName) {
    }

    public GameModel getModel() {
        return model;
    }

    public void setModel(GameModel model) {
        this.model = model;
    }
}
