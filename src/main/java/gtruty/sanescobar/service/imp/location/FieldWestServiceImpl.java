package gtruty.sanescobar.service.imp.location;

import gtruty.sanescobar.dao.startlocation.FieldSouthDao;
import gtruty.sanescobar.dao.startlocation.FieldWestDao;
import gtruty.sanescobar.entities.PlaceOfStart.FieldSouthEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldWestEntity;
import gtruty.sanescobar.service.location.FieldSouthService;
import gtruty.sanescobar.service.location.FieldWestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FieldWestServiceImpl implements FieldWestService {

    @Autowired
    FieldWestDao fieldWestDao;

    @Override
    public void save(FieldWestEntity fieldWestEntity) {
        fieldWestDao.save(fieldWestEntity);
    }

    @Override
    public void save(String name, BigDecimal costOfBuying, Integer area, String info, String seed) {
        fieldWestDao.save(new FieldWestEntity(name, costOfBuying,area,info,seed));
    }

    @Override
    public List<FieldWestEntity> getAllData() {

        return (List<FieldWestEntity>)      fieldWestDao.findAll();
    }



}
