package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityNorth;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;

import java.util.List;

public interface BuildingNorthService {
    void save (BuildingsEntityNorth buildingsEntityNorth);
    List<BuildingsEntityNorth> getAllData();
}
