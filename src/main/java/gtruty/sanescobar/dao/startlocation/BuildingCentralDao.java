package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityCentral;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BuildingCentralDao extends CrudRepository<BuildingsEntityCentral, Long> {

    @Query("SELECT sum(placeForGoods) from BuildingsEntityCentral ")
    int sumCreditAmount();
}
