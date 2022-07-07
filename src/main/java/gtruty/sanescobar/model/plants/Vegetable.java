package gtruty.sanescobar.model.plants;

public abstract class Vegetable extends Plant{

    @Override
    public Enum category() {
        return PlantsCategory.PLANTATION;
    }
}
