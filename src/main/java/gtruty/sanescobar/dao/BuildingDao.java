package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.BuildingsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingDao extends CrudRepository<BuildingsEntity,Long> {
}
