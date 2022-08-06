package gtruty.sanescobar.service.imp.location;

import gtruty.sanescobar.dao.startlocation.GoodsCentralDao;
import gtruty.sanescobar.dao.startlocation.GoodsSouthDao;
import gtruty.sanescobar.entities.PlaceOfStart.FieldWestEntity;
import gtruty.sanescobar.entities.PlaceOfStart.GoodsCentralEntities;
import gtruty.sanescobar.service.location.GoodsCentralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsCentralServiceImpl implements GoodsCentralService {

    @Autowired
    GoodsCentralDao goodsCentralDao;


    @Override
    public void save(GoodsCentralEntities goodsCentralEntities) {
    goodsCentralDao.save(goodsCentralEntities);
    }

    @Override
    public List<GoodsCentralEntities> getAllData() {
        var goodsCentral = goodsCentralDao.findAll();
        return (List<GoodsCentralEntities>) goodsCentral;
    }


}
