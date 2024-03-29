package gtruty.sanescobar.service.imp.location;

import gtruty.sanescobar.dao.startlocation.GoodsCentralDao;
import gtruty.sanescobar.dao.startlocation.GoodsEastDao;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsCentralEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsEastEntities;
import gtruty.sanescobar.service.location.GoodsCentralService;
import gtruty.sanescobar.service.location.GoodsEastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsEastServiceImpl implements GoodsEastService {

    @Autowired
    GoodsEastDao goodsEastDao;


    @Override
    public void save(GoodsEastEntities goodsCentralEntities) {
    goodsEastDao.save(goodsCentralEntities);
    }

    @Override
    public void save(String name, Integer usingMerchant, Integer type) {
        goodsEastDao.save(new GoodsEastEntities(name,usingMerchant, type));
    }

    @Override
    public List<GoodsEastEntities> getAllData() {

        return (List<GoodsEastEntities>)  goodsEastDao.findAll();
    }


}
