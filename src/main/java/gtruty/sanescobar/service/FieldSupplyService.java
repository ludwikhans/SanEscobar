package gtruty.sanescobar.service;

import gtruty.sanescobar.entities.FieldsSupplyEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldWestEntity;

import java.math.BigDecimal;
import java.util.List;

public interface FieldSupplyService {
     void save (FieldsSupplyEntity fieldsSupplyEntity);
     void save(String name, BigDecimal costOfBuying, Integer area, String info, String seed);
     void save(String name, BigDecimal costOfBuying, Integer area, String info);

     List<FieldsSupplyEntity> getAllData();


}
