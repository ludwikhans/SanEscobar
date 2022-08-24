package gtruty.sanescobar.service;

import gtruty.sanescobar.entities.BuildingsEntity;
import gtruty.sanescobar.entities.VilageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface BuildingService {

    void save (BuildingsEntity buildingsEntity);
    void save (String name, String products1, String products2, BigDecimal moneyProfit1, BigDecimal moneyProfit2, BigDecimal costOfBuilding, String requirements1, String requirements2, String suistenance, Double valueOfSuistenance, String info, Integer numberOfAnimal, Integer placeForGoods, String specialFor, Integer availableAnimal, Integer type);
    List<BuildingsEntity> getAllData();
}
