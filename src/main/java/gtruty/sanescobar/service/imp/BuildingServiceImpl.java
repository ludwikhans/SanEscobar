package gtruty.sanescobar.service.imp;

import gtruty.sanescobar.dao.BuildingDao;
import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    BuildingDao buildingDao;

    @Override
    public void save(BuildingsEntity buildingsEntity) {
buildingDao.save(buildingsEntity);
    }

    @Override
    public void save(String name, String products1, String products2, BigDecimal moneyProfit1, BigDecimal moneyProfit2, BigDecimal costOfBuilding, String requirements1, String requirements2, String suistenance, Double valueOfSuistenance, String info, Integer numberOfAnimal, Integer placeForGoods, String specialFor, Integer availableAnimal, Integer type) {
        buildingDao.save(new BuildingsEntity(name,products1,products2,moneyProfit1,moneyProfit2,costOfBuilding,requirements1,requirements2,suistenance,valueOfSuistenance,info,numberOfAnimal,placeForGoods,specialFor,availableAnimal,type));
    }

    @Override
    public List<BuildingsEntity> getAllData() {

        return (List<BuildingsEntity>)    buildingDao.findAll();
    }
}
