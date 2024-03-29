package gtruty.sanescobar.service.imp.location;

import gtruty.sanescobar.dao.startlocation.GoodsNorthDao;
import gtruty.sanescobar.dao.startlocation.GoodsSouthDao;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsNorthEntities;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsSouthEntities;
import gtruty.sanescobar.service.location.GoodsNorthService;
import gtruty.sanescobar.service.location.GoodsSouthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsSouthServiceImpl implements GoodsSouthService {

    @Autowired
    GoodsSouthDao goodsSouthDao;


    @Override
    public void save(GoodsSouthEntities goodsSouthEntities) {
    goodsSouthDao.save(goodsSouthEntities);
    }

    @Override
    public void save(String name, Integer usingMerchant, Integer type) {
        goodsSouthDao.save(new GoodsSouthEntities(name,usingMerchant, type));
    }

    @Override
    public List<GoodsSouthEntities> getAllData() {

        return (List<GoodsSouthEntities>)   goodsSouthDao.findAll();
    }


}
