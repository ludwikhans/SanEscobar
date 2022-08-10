package gtruty.sanescobar.service;

import gtruty.sanescobar.entities.BuildingsAvailableEntity;
import gtruty.sanescobar.entities.BuildingsSupplyEntity;

import java.math.BigDecimal;
import java.util.List;

public interface BuildingSupplyService {
     void save (BuildingsSupplyEntity buildingsSupplyEntity);

     List<BuildingsSupplyEntity> getAllData();

     void save(String name, BigDecimal costOfBuilding,  String info, Integer type);

     void save(String name);
}
