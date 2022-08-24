package gtruty.sanescobar.service;

import gtruty.sanescobar.entities.FieldsEntity;
import gtruty.sanescobar.entities.FieldsSupplyEntity;

import java.math.BigDecimal;
import java.util.List;

public interface FieldService {
     void save (FieldsEntity fieldsEntity);
     void save(String name, BigDecimal costOfBuying, Integer area, String info);

     List<FieldsEntity> getAllData();


}
