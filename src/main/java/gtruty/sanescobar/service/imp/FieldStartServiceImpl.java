package gtruty.sanescobar.service.imp;

import gtruty.sanescobar.dao.BuildingDao;
import gtruty.sanescobar.dao.FieldStartDao;
import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldsStartEntity;
import gtruty.sanescobar.service.BuildingService;
import gtruty.sanescobar.service.FieldStartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldStartServiceImpl implements FieldStartService {

    @Autowired
    FieldStartDao fieldStartDao;


    @Override
    public List<FieldsStartEntity> getAllData() {
        return (List<FieldsStartEntity>) fieldStartDao.findAll();
    }
}
