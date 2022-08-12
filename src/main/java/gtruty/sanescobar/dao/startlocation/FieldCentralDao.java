package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FieldCentralDao extends CrudRepository<FieldCentralEntity, Long> {

    @Query("SELECT sum(area) from FieldCentralEntity")
    int sumCreditAmount();

    List<FieldCentralEntity> findAllBySeed(String name);

    FieldCentralEntity findFirstByName(String name);

    FieldCentralEntity findFirstBySeed(String name);

}
