package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityNorth;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;
import org.springframework.data.repository.CrudRepository;

public interface BuildingNorthDao extends CrudRepository<BuildingsEntityNorth, Long> {
}