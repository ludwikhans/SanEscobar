package gtruty.sanescobar.service.imp;

import gtruty.sanescobar.dao.FieldDao;
import gtruty.sanescobar.dao.startlocation.FieldCentralDao;
import gtruty.sanescobar.entities.FieldsEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;
import gtruty.sanescobar.service.FieldService;
import gtruty.sanescobar.service.location.FieldCentralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FieldServiceImpl implements FieldService {

    @Autowired
    FieldDao fieldDao;

    @Override
    public void save(FieldsEntity fieldsEntity) {
        fieldDao.save(fieldsEntity);
    }

    @Override
    public void save(String name, BigDecimal costOfBuying, Integer area, String info) {
        fieldDao.save(new FieldsEntity(name, costOfBuying,area,info));
    }

    @Override
    public List<FieldsEntity> getAllData() {

        return (List<FieldsEntity>)   fieldDao.findAll();
    }



}
