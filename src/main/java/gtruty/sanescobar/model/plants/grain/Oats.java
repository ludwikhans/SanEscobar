package gtruty.sanescobar.model.plants.grain;

import gtruty.sanescobar.model.plants.Grain;

public class Oats extends Grain {


    public static void main(String[] args) {
        Oats oats = new Oats();
        Enum category = oats.category();
        System.out.println(category);
    }
    }


