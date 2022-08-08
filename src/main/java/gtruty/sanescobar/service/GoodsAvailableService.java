package gtruty.sanescobar.service;

import gtruty.sanescobar.entities.GoodsAvailableEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsCentralEntities;

import java.util.List;

public interface GoodsAvailableService {
     void save (GoodsAvailableEntities goodsAvailableEntities);
     void save(String name,Integer usingMerchant, Integer type);
     List<GoodsAvailableEntities> getAllData();


}
