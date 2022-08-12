package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldEastEntity;

import java.math.BigDecimal;
import java.util.List;

public interface FieldEastService {
     void save (FieldEastEntity fieldEastEntity);
     void save(String name, BigDecimal costOfBuying, Integer area, String info, String seed);

     List<FieldEastEntity> getAllData();


}
