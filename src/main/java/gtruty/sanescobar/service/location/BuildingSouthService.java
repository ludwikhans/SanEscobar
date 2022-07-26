package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;

import java.util.List;

public interface BuildingSouthService {
    void save (BuildingsEntitySouth buildingsEntitySouth);
    List<BuildingsEntitySouth> getAllData();
}
