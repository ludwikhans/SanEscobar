package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.GoodsCentralEntities;
import gtruty.sanescobar.entities.VilageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsCentralDao extends CrudRepository<GoodsCentralEntities,Integer> {

}
