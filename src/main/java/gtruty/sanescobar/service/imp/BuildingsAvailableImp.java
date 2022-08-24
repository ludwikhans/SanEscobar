package gtruty.sanescobar.service.imp;

import gtruty.sanescobar.dao.AvailableBuildingDao;
import gtruty.sanescobar.entities.BuildingsAvailableEntity;
import gtruty.sanescobar.service.BuildingAvailableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BuildingsAvailableImp implements BuildingAvailableService {

    @Autowired
    AvailableBuildingDao availableBuildingDao;


    @Override
    public void save(BuildingsAvailableEntity buildingsAvailableEntity) {
        availableBuildingDao.save(buildingsAvailableEntity);
    }

    @Override
    public List<BuildingsAvailableEntity> getAllData() {

        return (List<BuildingsAvailableEntity>)   availableBuildingDao.findAll();
    }

    @Override
    public void save(String name, BigDecimal costOfBuilding, String info, Integer type) {
availableBuildingDao.save(new BuildingsAvailableEntity(name,costOfBuilding,info,type) );
    }

    @Override
    public void save(String name) {
        availableBuildingDao.save(new BuildingsAvailableEntity(name));
    }
}
