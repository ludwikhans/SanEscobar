package gtruty.sanescobar.service.imp;

import gtruty.sanescobar.dao.BuildingDao;
import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<BuildingsEntity> getAllData() {
        var building = buildingDao.findAll();
        return (List<BuildingsEntity>) building;
    }
}
