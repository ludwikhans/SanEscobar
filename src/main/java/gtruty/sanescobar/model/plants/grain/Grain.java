package gtruty.sanescobar.model.plants.grain;

import gtruty.sanescobar.model.plants.Plant;
import gtruty.sanescobar.model.plants.PlantsCategory;

import java.math.BigDecimal;

public abstract class Grain extends Plant {

    public Grain(String name, Integer area, Integer profit, BigDecimal income){
      super(name,PlantsCategory.GRAIN , area, profit, income);

    }

    @Override
    public Enum category() {
        return PlantsCategory.GRAIN;
    }
}
