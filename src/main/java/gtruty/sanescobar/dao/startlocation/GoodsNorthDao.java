package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.GoodsNorthEntities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsNorthDao extends CrudRepository<GoodsNorthEntities,Integer> {

}
