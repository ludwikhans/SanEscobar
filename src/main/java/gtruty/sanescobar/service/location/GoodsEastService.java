package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.GoodsCentralEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsEastEntities;

import java.util.List;

public interface GoodsEastService {
     void save (GoodsEastEntities goodsEastEntities);

     List<GoodsEastEntities> getAllData();


}
