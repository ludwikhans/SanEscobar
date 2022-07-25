package gtruty.sanescobar.service.imp.location;


import gtruty.sanescobar.dao.startlocation.BuildingWestDao;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityWest;
import gtruty.sanescobar.service.location.BuildingNorthService;
import gtruty.sanescobar.service.location.BuildingWestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingWestServiceImpl implements BuildingWestService {

    @Autowired
    BuildingWestDao buildingWestDao;

    @Override
    public void save(BuildingsEntityWest buildingsEntityWest) {
        buildingWestDao.save(buildingsEntityWest);

    }

    @Override
    public List<BuildingsEntityWest> getAllData() {
        var buildingWest = buildingWestDao.findAll();
        return (List<BuildingsEntityWest>) buildingWest;
    }
}
