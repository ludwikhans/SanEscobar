package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.GoodsEastEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsNorthEntities;

import java.util.List;

public interface GoodsNorthService {
     void save (GoodsNorthEntities goodsNorthEntities);

     List<GoodsNorthEntities> getAllData();


}
