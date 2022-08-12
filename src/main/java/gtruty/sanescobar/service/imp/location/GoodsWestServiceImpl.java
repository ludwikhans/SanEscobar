package gtruty.sanescobar.service.imp.location;

import gtruty.sanescobar.dao.startlocation.GoodsSouthDao;
import gtruty.sanescobar.dao.startlocation.GoodsWestDao;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsSouthEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsWestEntities;
import gtruty.sanescobar.service.location.GoodsSouthService;
import gtruty.sanescobar.service.location.GoodsWestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsWestServiceImpl implements GoodsWestService {

    @Autowired
    GoodsWestDao goodsWestDao;


    @Override
    public void save(GoodsWestEntities goodsWestEntities) {
    goodsWestDao.save(goodsWestEntities);
    }

    @Override
    public void save(String name, Integer usingMerchant, Integer type) {
        goodsWestDao.save(new GoodsWestEntities(name,usingMerchant, type));
    }

    @Override
    public List<GoodsWestEntities> getAllData() {
        var goodsWest = goodsWestDao.findAll();
        return (List<GoodsWestEntities>) goodsWest;
    }


}
