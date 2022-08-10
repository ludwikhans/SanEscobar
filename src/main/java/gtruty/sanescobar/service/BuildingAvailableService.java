package gtruty.sanescobar.service;

import gtruty.sanescobar.entities.BuildingsAvailableEntity;

import java.math.BigDecimal;
import java.util.List;

public interface BuildingAvailableService {
     void save (BuildingsAvailableEntity buildingsAvailableEntity);

     List<BuildingsAvailableEntity> getAllData();

     void save(String name, BigDecimal costOfBuilding,  String info, Integer type);

     void save(String name);
}
