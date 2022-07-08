package gtruty.sanescobar.model.plants.forest;

import gtruty.sanescobar.model.plants.Plant;
import gtruty.sanescobar.model.plants.PlantsCategory;

import java.math.BigDecimal;

public abstract class Forest extends Plant {

    public Forest(String name, Integer area, Integer profit, BigDecimal income){
        super(name,PlantsCategory.FOREST , area, profit, income);

    }

    @Override
    public Enum category() {
        return PlantsCategory.FOREST;
    }
}
