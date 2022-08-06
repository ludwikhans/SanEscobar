package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.FieldNorthEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldSouthEntity;

import java.util.List;

public interface FieldSouthService {
     void save (FieldSouthEntity fieldSouthEntity);

     List<FieldSouthEntity> getAllData();


}
