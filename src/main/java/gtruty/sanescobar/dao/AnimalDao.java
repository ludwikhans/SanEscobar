package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.AnimalsEntity;
import gtruty.sanescobar.entities.BuildingsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalDao extends CrudRepository<AnimalsEntity,Long> {
    AnimalsEntity findByName(String name);
    AnimalsEntity findFirstByName(String name);
}
