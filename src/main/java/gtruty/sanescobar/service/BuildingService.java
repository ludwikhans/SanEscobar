package gtruty.sanescobar.service;

import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.entities.VilageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BuildingService {

    void save (BuildingsEntity buildingsEntity);
    List<BuildingsEntity> getAllData();
}
