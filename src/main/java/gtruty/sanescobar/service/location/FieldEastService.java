package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldEastEntity;

import java.util.List;

public interface FieldEastService {
     void save (FieldEastEntity fieldEastEntity);

     List<FieldEastEntity> getAllData();


}
