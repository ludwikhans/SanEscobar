package gtruty.sanescobar.service.imp.location;

import gtruty.sanescobar.dao.startlocation.FieldCentralDao;
import gtruty.sanescobar.dao.startlocation.StartFieldDao;
import gtruty.sanescobar.entities.PlaceOfStart.FieldCentralEntity;
import gtruty.sanescobar.entities.PlaceOfStart.StartFieldEntity;
import gtruty.sanescobar.service.FieldsOfStartService;
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
    public List<FieldCentralEntity> getAllData() {
        var fieldCentral = fieldCentralDao.findAll();
        return (List<FieldCentralEntity>) fieldCentral;
    }



}
