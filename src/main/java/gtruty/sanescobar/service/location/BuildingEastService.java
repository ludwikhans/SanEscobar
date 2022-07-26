package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityEast;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;

import java.util.List;

public interface BuildingEastService {
    void save (BuildingsEntityEast buildingsEntityEast);
    List<BuildingsEntityEast> getAllData();
}
