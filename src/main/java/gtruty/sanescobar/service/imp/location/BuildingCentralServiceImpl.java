package gtruty.sanescobar.service.imp.location;


import gtruty.sanescobar.dao.startlocation.BuildingCentralDao;
import gtruty.sanescobar.dao.startlocation.BuildingWestDao;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityCentral;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityWest;
import gtruty.sanescobar.service.location.BuildingCentralService;
import gtruty.sanescobar.service.location.BuildingWestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<BuildingsEntityCentral> getAllData() {
        var buildingCentral = buildingCentralDao.findAll();
        return (List<BuildingsEntityCentral>) buildingCentral;
    }
}
