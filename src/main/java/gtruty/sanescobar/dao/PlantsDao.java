package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.PlantsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantsDao extends CrudRepository<PlantsEntity,Integer> {
    PlantsEntity findAllByName(String name);
}
