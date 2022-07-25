package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.VilageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import static org.hibernate.loader.Loader.SELECT;

@Repository
public interface VilageDao extends CrudRepository<VilageEntity,Integer> {

  //@Query(nativeQuery = true, value = "select name from vilage where id=(select max (id) from vilage)")
   // VilageEntity findTopById();



}
