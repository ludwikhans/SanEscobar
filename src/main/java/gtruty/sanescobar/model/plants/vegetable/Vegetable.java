package gtruty.sanescobar.model.plants.vegetable;

import gtruty.sanescobar.model.plants.Plant;
import gtruty.sanescobar.model.plants.PlantsCategory;

public abstract class Vegetable extends Plant {

    @Override
    public Enum category() {
        return PlantsCategory.VEGETABLE;
    }
}
