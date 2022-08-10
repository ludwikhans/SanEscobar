package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.FieldsSupplyEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldWestEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FieldSupplyDao extends CrudRepository<FieldsSupplyEntity,Long> {

    @Query("SELECT sum(area) from FieldWestEntity ")
    int sumCreditAmount();

    List<FieldsSupplyEntity> findAllBySeed(String name);
    FieldsSupplyEntity findFirstByName(String name);
}
