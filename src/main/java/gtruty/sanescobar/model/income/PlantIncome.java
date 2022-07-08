package gtruty.sanescobar.model.income;

import gtruty.sanescobar.model.plants.Plant;

import java.math.BigDecimal;
import java.util.List;

public class PlantIncome extends Income implements IncomeModel {

    public List<Plant> ownedPlants;

    @Override
    public BigDecimal incomInterfce() {
        return null;
    }

    public BigDecimal calculateIncome(){
        BigDecimal income = new BigDecimal(0);
        ownedPlants.stream().forEach(ownedPlant -> income.add(ownedPlant.getIncome()));
        return income;
    }
}
