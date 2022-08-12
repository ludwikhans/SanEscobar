package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.FieldEastEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldNorthEntity;

import java.math.BigDecimal;
import java.util.List;

public interface FieldNorthService {
     void save (FieldNorthEntity fieldNorthEntity);
     void save(String name, BigDecimal costOfBuying, Integer area, String info, String seed);

     List<FieldNorthEntity> getAllData();


}
