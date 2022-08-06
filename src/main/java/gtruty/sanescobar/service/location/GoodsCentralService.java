package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.FieldWestEntity;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsCentralEntities;

import java.util.List;

public interface GoodsCentralService {
     void save (GoodsCentralEntities goodsCentralEntities);

     List<GoodsCentralEntities> getAllData();


}
