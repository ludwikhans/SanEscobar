package gtruty.sanescobar.model.plants.vegetable;

import gtruty.sanescobar.model.plants.Plant;
import gtruty.sanescobar.model.plants.PlantsCategory;

import java.math.BigDecimal;

public abstract class Vegetable extends Plant {

    public Vegetable(String name, Integer area, Integer profit, BigDecimal income) {
        super(name, PlantsCategory.VEGETABLE, area, profit, income);
    }

    @Override
    public Enum category() {
        return PlantsCategory.VEGETABLE;
    }
}
