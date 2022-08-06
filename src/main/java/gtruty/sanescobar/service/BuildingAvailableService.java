package gtruty.sanescobar.service;

import gtruty.sanescobar.entities.BuildingsAvailableEntity;
import gtruty.sanescobar.entities.PlaceOfStart.StartFieldEntity;

import java.math.BigDecimal;
import java.util.List;

public interface BuildingAvailableService {
     void save (BuildingsAvailableEntity buildingsAvailableEntity);

     List<BuildingsAvailableEntity> getAllData();

     void save(String name, BigDecimal costOfBuilding,  String info, Integer type);

     void save(String name);
}
