package gtruty.sanescobar.service.imp;

import gtruty.sanescobar.dao.BuildingDao;
import gtruty.sanescobar.dao.PlantsDao;
import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.entities.PlantsEntity;
import gtruty.sanescobar.service.BuildingService;
import gtruty.sanescobar.service.location.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantServiceImpl implements PlantService {

    @Autowired
    PlantsDao plantsDao;

    @Override
    public void save(PlantsEntity plantsEntity) {
plantsDao.save(plantsEntity);
    }

    @Override
    public List<PlantsEntity> getAllData() {
        var plant = plantsDao.findAll();
        return (List<PlantsEntity>) plant;
    }
}
