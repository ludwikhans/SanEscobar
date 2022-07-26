package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityCentral;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;
import org.springframework.data.repository.CrudRepository;

public interface BuildingCentralDao extends CrudRepository<BuildingsEntityCentral, Long> {
}
