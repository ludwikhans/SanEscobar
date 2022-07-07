package gtruty.sanescobar.model.plants;

public abstract class Grain extends Plant{


    @Override
    public Enum category() {
        return PlantsCategory.GRAIN;
    }
}
