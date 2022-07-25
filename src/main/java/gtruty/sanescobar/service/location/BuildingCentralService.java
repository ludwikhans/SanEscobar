package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityCentral;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;

import java.util.List;

public interface BuildingCentralService {
    void save (BuildingsEntityCentral buildingsEntityCentral);
    List<BuildingsEntityCentral> getAllData();
}
