package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.FieldWestEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FieldWestDao extends CrudRepository<FieldWestEntity, Long> {

    @Query("SELECT sum(area) from FieldWestEntity ")
    int sumCreditAmount();

    List<FieldWestEntity> findAllBySeed(String name);

    FieldWestEntity findFirstByName(String name);

    FieldWestEntity findFirstBySeed(String name);
}
