package gtruty.sanescobar.model.plants.plantation;

import gtruty.sanescobar.model.plants.Plant;
import gtruty.sanescobar.model.plants.PlantsCategory;

public abstract class Plantation extends Plant {

    @Override
    public Enum category() {
        return PlantsCategory.PLANTATION;
    }
}
