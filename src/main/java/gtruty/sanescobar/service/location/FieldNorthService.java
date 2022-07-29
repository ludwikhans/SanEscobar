package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.FieldEastEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldNorthEntity;

import java.util.List;

public interface FieldNorthService {
     void save (FieldNorthEntity fieldNorthEntity);

     List<FieldNorthEntity> getAllData();


}
