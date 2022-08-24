package gtruty.sanescobar.service;

import gtruty.sanescobar.entities.FieldsEntity;
import gtruty.sanescobar.entities.PlantsEntity;

import java.math.BigDecimal;
import java.util.List;

public interface PlantService {
     void save (PlantsEntity plantsEntity);
     void save(String name, String products, BigDecimal moneyProfit, Double harvest, BigDecimal sowingCost, String requirements, String info, String specialFor, Long yearsOld, String category);

     List<PlantsEntity> getAllData();


}
