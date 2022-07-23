package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.VilageModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import static org.hibernate.loader.Loader.SELECT;

@Repository
public interface VilageDao extends CrudRepository<VilageEntity,Integer> {

/*    @Query("select name from vilage where id=(select max (id) from vilage)")*/
    VilageEntity findTopByName(String name) ;


}
