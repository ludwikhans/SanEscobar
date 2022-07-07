package gtruty.sanescobar.model.plants.forest;

import gtruty.sanescobar.model.plants.Plant;
import gtruty.sanescobar.model.plants.PlantsCategory;

public abstract class Forest extends Plant {

    @Override
    public Enum category() {
        return PlantsCategory.FOREST;
    }
}
