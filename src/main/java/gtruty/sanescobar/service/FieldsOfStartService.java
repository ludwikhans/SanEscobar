package gtruty.sanescobar.service;

import gtruty.sanescobar.entities.PlaceOfStart.StartFieldEntity;

import java.math.BigDecimal;
import java.util.List;

public interface FieldsOfStartService {
     void save (StartFieldEntity startFieldEntity);

     List<StartFieldEntity> getAllData();

     void save(String name, BigDecimal costOfBuying, Integer area, String info, String seed);
}
