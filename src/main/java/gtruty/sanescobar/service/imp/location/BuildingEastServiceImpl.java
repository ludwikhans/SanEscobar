package gtruty.sanescobar.service.imp.location;


import gtruty.sanescobar.dao.startlocation.BuildingEastDao;
import gtruty.sanescobar.dao.startlocation.BuildingWestDao;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityCentral;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityEast;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityWest;
import gtruty.sanescobar.service.location.BuildingEastService;
import gtruty.sanescobar.service.location.BuildingWestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BuildingEastServiceImpl implements BuildingEastService {

    @Autowired
    BuildingEastDao buildingEastDao;

    @Override
    public void save(BuildingsEntityEast buildingsEntityEast) {
        buildingEastDao.save(buildingsEntityEast);
    }

    @Override
    public void save(String name, String products1, String products2, BigDecimal moneyProfit1, BigDecimal moneyProfit2, BigDecimal costOfBuilding, String requirements1, String requirements2, String suistenance, Double valueOfSuistenance, String info, Long numberOfAnimal, Long placeForGoods, String specialFor, Integer amount, Integer type) {
        buildingEastDao.save(new BuildingsEntityEast(name,products1,products2,moneyProfit1,moneyProfit2,costOfBuilding,requirements1,requirements2,suistenance,valueOfSuistenance,info,numberOfAnimal,placeForGoods,specialFor,amount, type));
    }

    @Override
    public void save(String name, String products1, String products2, BigDecimal moneyProfit1, BigDecimal moneyProfit2, BigDecimal costOfBuilding, String requirements1, String requirements2, String suistenance, Double valueOfSuistenance, String info, Long numberOfAnimal, Long placeForGoods, String specialFor, Integer amount, Integer type, String animalInBuilding) {
        buildingEastDao.save(new BuildingsEntityEast(name,products1,products2,moneyProfit1,moneyProfit2,costOfBuilding,requirements1,requirements2,suistenance,valueOfSuistenance,info,numberOfAnimal,placeForGoods,specialFor,amount, type,animalInBuilding));

    }

    @Override
    public List<BuildingsEntityEast> getAllData() {
        var buildingEast = buildingEastDao.findAll();
        return (List<BuildingsEntityEast>) buildingEast;
    }
}
