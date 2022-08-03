package gtruty.sanescobar.dao.startlocation;

import gtruty.sanescobar.entities.PlaceOfStart.FieldEastEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldNorthEntity;
import gtruty.sanescobar.entities.VilageEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FieldNorthDao extends CrudRepository<FieldNorthEntity,Long> {
    @Query("SELECT sum(area) from FieldNorthEntity ")
    int sumCreditAmount();

    @Query("SELECT sum(area) from FieldNorthEntity where seed like 'name'")
    int areaByName(String name);


   List < FieldNorthEntity> findAllBySeed(String name);
}
