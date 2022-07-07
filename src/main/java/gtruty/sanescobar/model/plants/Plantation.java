package gtruty.sanescobar.model.plants;

public abstract class Plantation extends Plant{

    @Override
    public Enum category() {
        return PlantsCategory.PLANTATION;
    }
}
