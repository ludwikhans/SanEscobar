package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityEast;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;
import org.springframework.data.repository.CrudRepository;

public interface BuildingEastDao extends CrudRepository<BuildingsEntityEast, Long> {
}