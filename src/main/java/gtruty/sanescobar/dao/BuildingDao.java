package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.BuildingsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuildingDao extends CrudRepository<BuildingsEntity,Long> {
    BuildingsEntity findByProducts1(String name);

}
