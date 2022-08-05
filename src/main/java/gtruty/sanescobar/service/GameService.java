package gtruty.sanescobar.service;

import gtruty.sanescobar.dao.AnimalDao;
import gtruty.sanescobar.dao.AvailableBuildingDao;
import gtruty.sanescobar.dao.BuildingDao;
import gtruty.sanescobar.dao.PlantsDao;
import gtruty.sanescobar.dao.startlocation.*;
import gtruty.sanescobar.entities.*;
import gtruty.sanescobar.entities.PlaceOfStart.*;
import gtruty.sanescobar.model.GameMetod;
import gtruty.sanescobar.model.GameModel;
import gtruty.sanescobar.service.location.*;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

    public GameService(BuildingNorthService buildingNorthService, FieldNorthService fieldNorthService, GoodsNorthService goodsNorthService, BuildingEastService buildingEastService, FieldEastService fieldEastService, GoodsEastService goodsEastService, BuildingWestService buildingWestService, FieldWestService fieldWestService, GoodsWestService goodsWestService, BuildingSouthService buildingSouthService, FieldSouthService fieldSouthService, GoodsSouthService goodsSouthService, BuildingCentralService buildingCentralService, FieldCentralService fieldCentralService, GoodsCentralService goodsCentralService, FieldNorthDao fieldNorthDao, FieldEastDao fieldEastDao, FieldCentralDao fieldCentralDao, FieldSouthDao fieldSouthDao, FieldWestDao fieldWestDao, BuildingCentralDao buildingCentralDao, BuildingEastDao buildingEastDao, BuildingNorthDao buildingNorthDao, BuildingSouthDao buildingSouthDao, BuildingWestDao buildingWestDao, GoodsCentralDao goodsCentralDao, GoodsEastDao goodsEastDao, GoodsNorthDao goodsNorthDao, GoodsSouthDao goodsSouthDao, GoodsWestDao goodsWestDao, PlantsDao plantsDao, BuildingDao buildingDao, AnimalDao animalDao, BuildingService buildingService, BuildingAvailableService availableBuildingService, AvailableBuildingDao availableBuildingDao, VilageService vilageService) {
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
    }

    GameModel model;


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
                BigDecimal totalIncome = toZero(gameModel.getTotalIncome());
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
                BigDecimal field = toZero(gameModel.getIncomFromFields());
                BigDecimal building = toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncome = toZero(gameModel.getTotalIncome());
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
                BigDecimal field = toZero(gameModel.getIncomFromFields());
                BigDecimal building = toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncome = toZero(gameModel.getTotalIncome());
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
                BigDecimal field = toZero(gameModel.getIncomFromFields());
                BigDecimal building = toZero(gameModel.getIncomFromBuilding());
                BigDecimal animal = toZero(gameModel.getIncomFromAnimal());
                BigDecimal totalIncome = toZero(gameModel.getTotalIncome());
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
    public void availableToBuyBuilding(GameModel gameModel, Model model) {
      List<BuildingsAvailableEntity>  existBuilding = availableBuildingService.getAllData();
      if (existBuilding != null){
          availableBuildingDao.deleteAll();
      }

        BigDecimal money = gameModel.getStartMoney();
        int moneyInInt = money.intValue();
        List<BuildingsEntity> allBuildings = buildingService.getAllData();
        availableBuildingService.save("Brak nowego budynku");
        for (int j = 1; j <=allBuildings.size(); j++) {
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
    public void saveVilage(GameModel gameModel) {
        VilageEntity vilage = vilageService.getAnyVilage();
        gameModel.setVilageName(vilage.getName());
        gameModel.setLocationId(vilage.getLocationId());
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
