package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.FieldWestEntity;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsCentralEntities;

import java.math.BigDecimal;
import java.util.List;

public interface GoodsCentralService {
     void save (GoodsCentralEntities goodsCentralEntities);
     void save(String name,Integer usingMerchant, Integer type);
     List<GoodsCentralEntities> getAllData();


}
