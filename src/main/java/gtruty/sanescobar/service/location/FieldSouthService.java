package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.FieldNorthEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldSouthEntity;

import java.math.BigDecimal;
import java.util.List;

public interface FieldSouthService {
     void save (FieldSouthEntity fieldSouthEntity);
     void save(String name, BigDecimal costOfBuying, Integer area, String info, String seed);

     List<FieldSouthEntity> getAllData();


}
