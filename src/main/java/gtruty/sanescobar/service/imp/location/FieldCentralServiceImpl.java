package gtruty.sanescobar.service.imp.location;

import gtruty.sanescobar.dao.startlocation.FieldCentralDao;

import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;


import gtruty.sanescobar.service.location.FieldCentralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FieldCentralServiceImpl implements FieldCentralService {

    @Autowired
    FieldCentralDao fieldCentralDao;

    @Override
    public void save(FieldCentralEntity fieldCentralEntity) {
        fieldCentralDao.save(fieldCentralEntity);
    }

    @Override
    public void save(String name, BigDecimal costOfBuying, Integer area, String info, String seed) {
        fieldCentralDao.save(new FieldCentralEntity(name, costOfBuying,area,info,seed));
    }

    @Override
    public List<FieldCentralEntity> getAllData() {

        return (List<FieldCentralEntity>)    fieldCentralDao.findAll();
    }



}
