package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.VilageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import static org.hibernate.loader.Loader.SELECT;

@Repository
public interface VilageDao extends CrudRepository<VilageEntity,Integer> {

 VilageEntity findFirstByOrderByIdDesc();
 VilageEntity findFirstByName(String name);



}
