package gtruty.sanescobar.service.imp;

import gtruty.sanescobar.dao.GoodsAvailableDao;
import gtruty.sanescobar.dao.startlocation.GoodsCentralDao;
import gtruty.sanescobar.entities.GoodsAvailableEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsCentralEntities;
import gtruty.sanescobar.service.GoodsAvailableService;
import gtruty.sanescobar.service.location.GoodsCentralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsAvailableServiceImpl implements GoodsAvailableService {

    @Autowired
    GoodsAvailableDao goodsAvailableDao;


    @Override
    public void save(GoodsAvailableEntities goodsAvailableEntities) {
    goodsAvailableDao.save(goodsAvailableEntities);
    }

    @Override
    public void save(String name, Integer usingMerchant, Integer type) {
        goodsAvailableDao.save(new GoodsAvailableEntities(name,usingMerchant, type));
    }

    @Override
    public List<GoodsAvailableEntities> getAllData() {
        var goodsAvailable = goodsAvailableDao.findAll();
        return (List<GoodsAvailableEntities>) goodsAvailable;
    }


}
