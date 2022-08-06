package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.FieldSouthEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldWestEntity;

import java.util.List;

public interface FieldWestService {
     void save (FieldWestEntity fieldWestEntity);

     List<FieldWestEntity> getAllData();


}
