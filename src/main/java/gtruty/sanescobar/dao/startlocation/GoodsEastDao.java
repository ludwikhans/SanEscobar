package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.GoodsCentralEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsEastEntities;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsEastDao extends CrudRepository<GoodsEastEntities,Integer> {

    @Query("SELECT sum(usingMerchant) from GoodsEastEntities")
    int sumCreditAmount();

    GoodsEastEntities findById(int id);
    GoodsEastEntities findByName(String name);

}
