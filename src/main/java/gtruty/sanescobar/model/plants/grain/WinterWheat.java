package gtruty.sanescobar.model.plants.grain;

import gtruty.sanescobar.model.plants.Grain;

public class WinterWheat extends Grain {


    public static void main(String[] args) {
        WinterWheat oats = new WinterWheat();
        Enum category = oats.category();
        System.out.println(category);
    }
    }


