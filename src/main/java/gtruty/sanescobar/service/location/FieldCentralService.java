package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;


import java.math.BigDecimal;
import java.util.List;

public interface FieldCentralService {
     void save (FieldCentralEntity fieldCentralEntity);
     void save(String name, BigDecimal costOfBuying, Integer area, String info, String seed);
     List<FieldCentralEntity> getAllData();


}
