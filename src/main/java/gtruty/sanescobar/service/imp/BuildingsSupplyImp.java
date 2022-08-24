package gtruty.sanescobar.service.imp;

import gtruty.sanescobar.dao.AvailableBuildingDao;
import gtruty.sanescobar.dao.BuildingSupplyDao;
import gtruty.sanescobar.entities.BuildingsAvailableEntity;
import gtruty.sanescobar.entities.BuildingsSupplyEntity;
import gtruty.sanescobar.service.BuildingAvailableService;
import gtruty.sanescobar.service.BuildingSupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BuildingsSupplyImp implements BuildingSupplyService {

    @Autowired
    BuildingSupplyDao buildingSupplyDao;


    @Override
    public void save(BuildingsSupplyEntity buildingsSupplyEntity) {
        buildingSupplyDao.save(buildingsSupplyEntity);
    }

    @Override
    public List<BuildingsSupplyEntity> getAllData() {

        return (List<BuildingsSupplyEntity>)     buildingSupplyDao.findAll();
    }

    @Override
    public void save(String name, BigDecimal costOfBuilding, String info, Integer type) {
buildingSupplyDao.save(new BuildingsSupplyEntity(name,costOfBuilding,info,type) );
    }

    @Override
    public void save(String name) {
        buildingSupplyDao.save(new BuildingsSupplyEntity(name));
    }
}
