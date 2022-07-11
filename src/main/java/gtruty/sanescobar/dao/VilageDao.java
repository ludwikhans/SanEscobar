package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.model.VilageModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilageDao extends CrudRepository<VilageEntity,Integer> {
}
