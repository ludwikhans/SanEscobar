package gtruty.sanescobar.service.imp.location;

import gtruty.sanescobar.dao.startlocation.FieldSouthDao;
import gtruty.sanescobar.dao.startlocation.FieldWestDao;
import gtruty.sanescobar.entities.PlaceOfStart.FieldSouthEntity;
import gtruty.sanescobar.entities.PlaceOfStart.FieldWestEntity;
import gtruty.sanescobar.service.location.FieldSouthService;
import gtruty.sanescobar.service.location.FieldWestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<FieldWestEntity> getAllData() {
        var fieldWest = fieldWestDao.findAll();
        return (List<FieldWestEntity>) fieldWest;
    }



}
