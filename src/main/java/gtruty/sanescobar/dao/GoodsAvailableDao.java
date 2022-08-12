package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.GoodsAvailableEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsSouthEntities;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsAvailableDao extends CrudRepository<GoodsAvailableEntities,Integer> {

    @Query("SELECT sum(usingMerchant) from GoodsSouthEntities")
    int sumCreditAmount();

    GoodsAvailableEntities findByName(String name);
    GoodsSouthEntities findById(int id);
    GoodsAvailableEntities findFirstByName(String name);

}
