package gtruty.sanescobar.service.imp.location;

import gtruty.sanescobar.dao.startlocation.BuildingNorthDao;
import gtruty.sanescobar.dao.startlocation.BuildingSouthDao;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityEast;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityNorth;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;
import gtruty.sanescobar.service.location.BuildingNorthService;
import gtruty.sanescobar.service.location.BuildingSouthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class BuildingNorthServiceImpl implements BuildingNorthService {

    @Autowired
    BuildingNorthDao buildingNorthDao;

    @Override
    public void save(BuildingsEntityNorth buildingsEntityNorth) {
        buildingNorthDao.save(buildingsEntityNorth);
    }

    @Override
    public void save(String name, String products1, String products2, BigDecimal moneyProfit1, BigDecimal moneyProfit2, BigDecimal costOfBuilding, String requirements1, String requirements2, String suistenance, Double valueOfSuistenance, String info, Integer numberOfAnimal, Integer placeForGoods, String specialFor, Integer amount, Integer type) {
        buildingNorthDao.save(new BuildingsEntityNorth(name,products1,products2,moneyProfit1,moneyProfit2,costOfBuilding,requirements1,requirements2,suistenance,valueOfSuistenance,info,numberOfAnimal,placeForGoods,specialFor,amount, type));
    }

    @Override
    public void save(String name, String products1, String products2, BigDecimal moneyProfit1, BigDecimal moneyProfit2, BigDecimal costOfBuilding, String requirements1, String requirements2, String suistenance, Double valueOfSuistenance, String info, Integer numberOfAnimal, Integer placeForGoods, String specialFor, Integer amount, Integer type, String animalInBuilding) {
        buildingNorthDao.save(new BuildingsEntityNorth(name,products1,products2,moneyProfit1,moneyProfit2,costOfBuilding,requirements1,requirements2,suistenance,valueOfSuistenance,info,numberOfAnimal,placeForGoods,specialFor,amount, type,animalInBuilding));

    }

    @Override
    public List<BuildingsEntityNorth> getAllData() {

        return (List<BuildingsEntityNorth>)      buildingNorthDao.findAll();
    }
}
