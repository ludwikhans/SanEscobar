package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.BuildingsAvailableEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailableBuildingDao extends CrudRepository<BuildingsAvailableEntity,Integer> {
    BuildingsAvailableEntity findById(int id);
}
