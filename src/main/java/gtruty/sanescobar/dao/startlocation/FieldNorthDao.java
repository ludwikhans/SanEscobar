package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.FieldEastEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldNorthEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldNorthDao extends CrudRepository<FieldNorthEntity,Long> {
    @Query("SELECT sum(area) from FieldNorthEntity ")
    int sumCreditAmount();
}
