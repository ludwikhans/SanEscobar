package gtruty.sanescobar.service;

import gtruty.sanescobar.entities.AnimalsEntity;

import java.math.BigDecimal;
import java.util.List;

public interface AnimalsService {
    void save (AnimalsEntity animals);
    void save (String name, String products1, String products2, BigDecimal moneyProfit1, BigDecimal moneyProfit2, BigDecimal costOfBuying, String requirements, String suistenance1, Double valueOfSuistenance1, String suistenance2, Double valueOfSuistenance2, String info, String specialFor, Integer typ);
    List<AnimalsEntity> getAllData();
}
