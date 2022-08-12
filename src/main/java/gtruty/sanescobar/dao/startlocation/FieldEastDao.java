package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.FieldEastEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FieldEastDao extends CrudRepository<FieldEastEntity, Long> {

    @Query("SELECT sum(area) from FieldEastEntity ")
    int sumCreditAmount();

    List<FieldEastEntity> findAllBySeed(String name);

    FieldEastEntity findFirstByName(String name);

    FieldEastEntity findFirstBySeed(String name);


}
