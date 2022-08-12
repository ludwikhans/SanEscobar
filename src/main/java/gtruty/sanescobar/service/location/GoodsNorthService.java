package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.GoodsEastEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsNorthEntities;

import java.util.List;

public interface GoodsNorthService {
     void save (GoodsNorthEntities goodsNorthEntities);
     void save(String name,Integer usingMerchant, Integer type);
     List<GoodsNorthEntities> getAllData();


}
