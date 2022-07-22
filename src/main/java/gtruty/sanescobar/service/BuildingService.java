package gtruty.sanescobar.service;

import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.entities.VilageEntity;

import java.util.List;

public interface BuildingService {
    void save (BuildingsEntity buildingsEntity);
    List<BuildingsEntity>getAllData();
}
