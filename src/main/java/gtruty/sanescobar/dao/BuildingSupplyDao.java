package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.BuildingsAvailableEntity;
import gtruty.sanescobar.entities.BuildingsSupplyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingSupplyDao extends CrudRepository<BuildingsSupplyEntity,Integer> {
    BuildingsSupplyEntity findById(int id);
    BuildingsSupplyEntity findFirstByName(String name);
}
