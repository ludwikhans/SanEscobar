package gtruty.sanescobar.dao;

import gtruty.sanescobar.entities.FieldsEntity;
import gtruty.sanescobar.entities.FieldsSupplyEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FieldDao extends CrudRepository<FieldsEntity,Integer> {

    @Query("SELECT sum(area) from FieldWestEntity ")
    int sumCreditAmount();
    
    FieldsEntity findFirstByOrderByIdDesc();
    FieldsEntity findFirstByName(String name);
}
