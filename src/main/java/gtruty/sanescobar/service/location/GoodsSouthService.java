package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.GoodsNorthEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsSouthEntities;

import java.util.List;

public interface GoodsSouthService {
     void save (GoodsSouthEntities goodsSouthEntities);

     List<GoodsSouthEntities> getAllData();


}
