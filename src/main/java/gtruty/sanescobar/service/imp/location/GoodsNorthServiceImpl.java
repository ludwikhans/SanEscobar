package gtruty.sanescobar.service.imp.location;

import gtruty.sanescobar.dao.startlocation.GoodsEastDao;
import gtruty.sanescobar.dao.startlocation.GoodsNorthDao;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsEastEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsNorthEntities;
import gtruty.sanescobar.service.location.GoodsEastService;
import gtruty.sanescobar.service.location.GoodsNorthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsNorthServiceImpl implements GoodsNorthService {

    @Autowired
    GoodsNorthDao goodsNorthDao;


    @Override
    public void save(GoodsNorthEntities goodsNorthEntities) {
    goodsNorthDao.save(goodsNorthEntities);
    }

    @Override
    public List<GoodsNorthEntities> getAllData() {
        var goodsNorth = goodsNorthDao.findAll();
        return (List<GoodsNorthEntities>) goodsNorth;
    }


}
