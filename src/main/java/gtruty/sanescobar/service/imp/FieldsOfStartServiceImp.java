package gtruty.sanescobar.service.imp;

import gtruty.sanescobar.dao.startlocation.StartFieldDao;
import gtruty.sanescobar.entities.PlaceOfStart.StartFieldEntity;
import gtruty.sanescobar.service.FieldsOfStartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FieldsOfStartServiceImp implements FieldsOfStartService {

    @Autowired
    StartFieldDao startFieldDao;

    @Override
    public void save(StartFieldEntity meadow) {
        startFieldDao.save(meadow);

    }

    @Override
    public List<StartFieldEntity> getAllData() {
        var meadow = startFieldDao.findAll();
        return (List<StartFieldEntity>) meadow;
    }

    @Override
    public void save(String name, BigDecimal costOfBuying, Integer area, String info, String seed) {
        startFieldDao.save(new StartFieldEntity(name, costOfBuying,area,info,seed));
    }
}
