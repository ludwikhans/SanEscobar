package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.GoodsSouthEntities;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsSouthDao extends CrudRepository<GoodsSouthEntities,Integer> {

    @Query("SELECT sum(usingMerchant) from GoodsSouthEntities")
    int sumCreditAmount();

}
