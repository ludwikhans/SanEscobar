package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.GoodsNorthEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsWestEntities;

import java.util.List;

public interface GoodsWestService {
     void save (GoodsWestEntities goodsWestEntities);
     void save(String name,Integer usingMerchant, Integer type);
     List<GoodsWestEntities> getAllData();


}
