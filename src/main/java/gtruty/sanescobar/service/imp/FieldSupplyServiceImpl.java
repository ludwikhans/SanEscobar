package gtruty.sanescobar.service.imp;

import gtruty.sanescobar.dao.FieldSupplyDao;
import gtruty.sanescobar.dao.startlocation.FieldWestDao;
import gtruty.sanescobar.entities.FieldsSupplyEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldWestEntity;
import gtruty.sanescobar.service.FieldSupplyService;
import gtruty.sanescobar.service.location.FieldWestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FieldSupplyServiceImpl implements FieldSupplyService {

    @Autowired
    FieldSupplyDao fieldSupplyDao;

    @Override
    public void save(FieldsSupplyEntity fieldsSupplyEntity) {
        fieldSupplyDao.save(fieldsSupplyEntity);
    }

    @Override
    public void save(String name, BigDecimal costOfBuying, Integer area, String info, String seed) {
        fieldSupplyDao.save(new FieldsSupplyEntity(name, costOfBuying,area,info,seed));
    }

    @Override
    public void save(String name, BigDecimal costOfBuying, Integer area, String info) {
        fieldSupplyDao.save(new FieldsSupplyEntity(name, costOfBuying,area,info));
    }

    @Override
    public List<FieldsSupplyEntity> getAllData() {
        var fieldSup = fieldSupplyDao.findAll();
        return (List<FieldsSupplyEntity>) fieldSup;
    }



}
