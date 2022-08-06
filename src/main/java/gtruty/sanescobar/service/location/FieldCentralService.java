package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;
import gtruty.sanescobar.entities.PlaceOfStart.StartFieldEntity;

import java.math.BigDecimal;
import java.util.List;

public interface FieldCentralService {
     void save (FieldCentralEntity fieldCentralEntity);

     List<FieldCentralEntity> getAllData();


}
