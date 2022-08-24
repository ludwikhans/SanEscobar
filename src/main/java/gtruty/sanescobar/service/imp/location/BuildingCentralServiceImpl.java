package gtruty.sanescobar.service.imp.location;


import gtruty.sanescobar.dao.startlocation.BuildingCentralDao;
import gtruty.sanescobar.dao.startlocation.BuildingWestDao;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityCentral;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityWest;
import gtruty.sanescobar.service.location.BuildingCentralService;
import gtruty.sanescobar.service.location.BuildingWestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class BuildingCentralServiceImpl implements BuildingCentralService {

    @Autowired
    BuildingCentralDao buildingCentralDao;

    @Override
    public void save(BuildingsEntityCentral buildingsEntityCentral) {
        buildingCentralDao.save(buildingsEntityCentral);

    }

    @Override
    public void save(String name, String products1, String products2, BigDecimal moneyProfit1, BigDecimal moneyProfit2, BigDecimal costOfBuilding, String requirements1, String requirements2, String suistenance, Double valueOfSuistenance, String info, Integer numberOfAnimal, Integer placeForGoods, String specialFor, Integer amount, Integer type) {
        buildingCentralDao.save(new BuildingsEntityCentral(name,products1,products2,moneyProfit1,moneyProfit2,costOfBuilding,requirements1,requirements2,suistenance,valueOfSuistenance,info,numberOfAnimal,placeForGoods,specialFor,amount, type));
    }

    @Override
    public void save(String name, String products1, String products2, BigDecimal moneyProfit1, BigDecimal moneyProfit2, BigDecimal costOfBuilding, String requirements1, String requirements2, String suistenance, Double valueOfSuistenance, String info, Integer numberOfAnimal, Integer placeForGoods, String specialFor, Integer amount, Integer type, String animalInBuilding) {
        buildingCentralDao.save(new BuildingsEntityCentral(name,products1,products2,moneyProfit1,moneyProfit2,costOfBuilding,requirements1,requirements2,suistenance,valueOfSuistenance,info,numberOfAnimal,placeForGoods,specialFor,amount, type,animalInBuilding));

    }

    @Override
    public List<BuildingsEntityCentral> getAllData() {
        return (List<BuildingsEntityCentral>)buildingCentralDao.findAll();
    }
}
