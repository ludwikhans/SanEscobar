package gtruty.sanescobar.service.imp;

import gtruty.sanescobar.dao.VilageDao;

import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.service.VilageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class VilageServiceImp implements VilageService {

    @Autowired
    VilageDao vilageDao;


    @Override
    public void save(String name) {
        vilageDao.save(new VilageEntity(name));
    }

    @Override
    public void save(VilageEntity vilageEntity) {
        vilageDao.save(vilageEntity);
    }

    @Override
    public VilageEntity getAnyVilage() {
        return vilageDao.findAll().iterator().next();
    }
}
