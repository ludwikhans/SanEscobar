package gtruty.sanescobar.model.plants.grain;

import gtruty.sanescobar.model.plants.Plant;
import gtruty.sanescobar.model.plants.PlantsCategory;

public abstract class Grain extends Plant {


    @Override
    public Enum category() {
        return PlantsCategory.GRAIN;
    }
}
