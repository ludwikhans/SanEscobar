package gtruty.sanescobar.service.location;

import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntityEast;
import gtruty.sanescobar.entities.PlaceOfStart.BuildingsEntitySouth;

import java.math.BigDecimal;
import java.util.List;

public interface BuildingEastService {
    void save (BuildingsEntityEast buildingsEntityEast);
    void save(String name, String products1, String products2, BigDecimal moneyProfit1, BigDecimal moneyProfit2, BigDecimal costOfBuilding, String requirements1, String requirements2, String suistenance, Double valueOfSuistenance, String info, Long numberOfAnimal, Long placeForGoods, String specialFor, Integer amount, Integer type);

    List<BuildingsEntityEast> getAllData();
}
