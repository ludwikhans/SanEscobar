package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityCentral;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityNorth;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BuildingSouthDao extends CrudRepository<BuildingsEntitySouth, Long> {

    @Query("SELECT sum(placeForGoods) from BuildingsEntitySouth")
    int sumCreditAmount();

    BuildingsEntitySouth findById(int id);
    BuildingsEntitySouth findFirstByName(String name);
    BuildingsEntitySouth findByName(String name);
}
