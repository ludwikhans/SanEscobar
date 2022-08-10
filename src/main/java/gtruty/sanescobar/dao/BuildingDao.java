package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.BuildingsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuildingDao extends CrudRepository<BuildingsEntity,Integer> {
    BuildingsEntity findByProducts1(String name);
    BuildingsEntity findById(int id);
    BuildingsEntity findByName(String name);
    BuildingsEntity findFirstByName(String name);


}
