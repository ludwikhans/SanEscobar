package gtruty.sanescobar.service.imp.location;

import gtruty.sanescobar.dao.startlocation.FieldCentralDao;
import gtruty.sanescobar.dao.startlocation.FieldNorthDao;
import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldNorthEntity;
import gtruty.sanescobar.service.location.FieldCentralService;
import gtruty.sanescobar.service.location.FieldNorthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldNorthServiceImpl implements FieldNorthService {

    @Autowired
    FieldNorthDao fieldNorthDao;


    @Override
    public void save(FieldNorthEntity fieldNorthEntity) {
        fieldNorthDao.save(fieldNorthEntity);
    }

    @Override
    public List<FieldNorthEntity> getAllData() {
        var fieldNorth = fieldNorthDao.findAll();
        return (List<FieldNorthEntity>) fieldNorth;
    }
}
