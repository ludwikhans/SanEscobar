package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;
import gtruty.sanescobar.entities.PlaceOfStart.StartFieldEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldCentralDao extends CrudRepository<FieldCentralEntity,Long> {

    @Query("SELECT sum(area) from FieldCentralEntity")
    int sumCreditAmount();
}
