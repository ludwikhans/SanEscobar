package gtruty.sanescobar.service.imp.location;


import gtruty.sanescobar.dao.startlocation.BuildingEastDao;
import gtruty.sanescobar.dao.startlocation.BuildingWestDao;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityEast;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityWest;
import gtruty.sanescobar.service.location.BuildingEastService;
import gtruty.sanescobar.service.location.BuildingWestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<BuildingsEntityEast> getAllData() {
        var buildingEast = buildingEastDao.findAll();
        return (List<BuildingsEntityEast>) buildingEast;
    }
}
