package gtruty.sanescobar.service.imp.location;

import gtruty.sanescobar.dao.startlocation.FieldCentralDao;
import gtruty.sanescobar.dao.startlocation.FieldSouthDao;
import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldNorthEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldSouthEntity;
import gtruty.sanescobar.service.location.FieldCentralService;
import gtruty.sanescobar.service.location.FieldSouthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FieldSouthServiceImpl implements FieldSouthService {

    @Autowired
    FieldSouthDao fieldSouthDao;

    @Override
    public void save(FieldSouthEntity fieldCentralEntity) {
        fieldSouthDao.save(fieldCentralEntity);
    }

    @Override
    public void save(String name, BigDecimal costOfBuying, Integer area, String info, String seed) {
        fieldSouthDao.save(new FieldSouthEntity(name, costOfBuying,area,info,seed));
    }

    @Override
    public List<FieldSouthEntity> getAllData() {

        return (List<FieldSouthEntity>)      fieldSouthDao.findAll();
    }



}
