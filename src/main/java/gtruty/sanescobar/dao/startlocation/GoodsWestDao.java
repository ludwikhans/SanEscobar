package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.GoodsCentralEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsEastEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsWestEntities;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsWestDao extends CrudRepository<GoodsWestEntities,Integer> {

    @Query("SELECT sum(usingMerchant) from GoodsWestEntities")
    int sumCreditAmount();

    GoodsWestEntities findById(int id);
    GoodsWestEntities findByName(String name);
    GoodsWestEntities findFirstByName(String name);

}
