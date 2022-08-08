package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.GoodsNorthEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsSouthEntities;

import java.util.List;

public interface GoodsSouthService {
     void save (GoodsSouthEntities goodsSouthEntities);
     void save(String name,Integer usingMerchant, Integer type);
     List<GoodsSouthEntities> getAllData();


}
