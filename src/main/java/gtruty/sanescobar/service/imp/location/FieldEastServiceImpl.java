package gtruty.sanescobar.service.imp.location;

import gtruty.sanescobar.dao.startlocation.FieldEastDao;
import gtruty.sanescobar.dao.startlocation.FieldNorthDao;
import gtruty.sanescobar.entities.PlaceOfStart.FieldEastEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldNorthEntity;

import gtruty.sanescobar.service.location.FieldEastService;
import gtruty.sanescobar.service.location.FieldNorthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FieldEastServiceImpl implements FieldEastService {

    @Autowired
    FieldEastDao fieldEastDao;


    @Override
    public void save(FieldEastEntity fieldEastEntity) {
        fieldEastDao.save(fieldEastEntity);
    }

    @Override
    public void save(String name, BigDecimal costOfBuying, Integer area, String info, String seed) {
        fieldEastDao.save(new FieldEastEntity(name, costOfBuying,area,info,seed));
    }

    @Override
    public List<FieldEastEntity> getAllData() {
        var fieldEast = fieldEastDao.findAll();
        return (List<FieldEastEntity>) fieldEast;
    }
}
