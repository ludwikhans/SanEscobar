package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.FieldSouthEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldWestEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldWestDao extends CrudRepository<FieldWestEntity,Long> {

    @Query("SELECT sum(area) from FieldWestEntity ")
    int sumCreditAmount();
}
