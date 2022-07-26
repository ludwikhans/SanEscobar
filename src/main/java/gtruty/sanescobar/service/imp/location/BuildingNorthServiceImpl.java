package gtruty.sanescobar.service.imp.location;

import gtruty.sanescobar.dao.startlocation.BuildingNorthDao;
import gtruty.sanescobar.dao.startlocation.BuildingSouthDao;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityNorth;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;
import gtruty.sanescobar.service.location.BuildingNorthService;
import gtruty.sanescobar.service.location.BuildingSouthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<BuildingsEntityNorth> getAllData() {
        var buildingNorth = buildingNorthDao.findAll();
        return (List<BuildingsEntityNorth>) buildingNorth;
    }
}
