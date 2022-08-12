package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.FieldSouthEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldWestEntity;

import java.math.BigDecimal;
import java.util.List;

public interface FieldWestService {
     void save (FieldWestEntity fieldWestEntity);
     void save(String name, BigDecimal costOfBuying, Integer area, String info, String seed);

     List<FieldWestEntity> getAllData();


}
