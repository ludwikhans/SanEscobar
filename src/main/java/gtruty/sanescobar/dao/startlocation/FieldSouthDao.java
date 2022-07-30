package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.FieldNorthEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldSouthEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldSouthDao extends CrudRepository<FieldSouthEntity,Long> {

    @Query("SELECT sum(area) from FieldSouthEntity ")
    int sumCreditAmount();
}
