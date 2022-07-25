package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityWest;
import org.springframework.data.repository.CrudRepository;

public interface BuildingWestDao extends CrudRepository<BuildingsEntityWest, Long> {
}
