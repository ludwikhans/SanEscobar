package gtruty.sanescobar.service.imp;

import gtruty.sanescobar.dao.VilageDao;
import gtruty.sanescobar.entities.VilageEntity;
import gtruty.sanescobar.service.VilageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VilageServiceImp implements VilageService {

    @Autowired
    VilageDao vilageDao;


    @Override
    public void save(String name) {

    }

    @Override
    public void save(VilageEntity vilageEntity) {

    }

    @Override
    public VilageEntity getAnyVilage() {
        return null;
    }
}
