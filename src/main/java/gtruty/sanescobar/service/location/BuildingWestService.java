package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityWest;

import java.util.List;

public interface BuildingWestService {
    void save (BuildingsEntityWest buildingsEntityWest);
    List<BuildingsEntityWest> getAllData();
}
