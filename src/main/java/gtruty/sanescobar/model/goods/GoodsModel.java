package gtruty.sanescobar.model.goods;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


public class GoodsModel {


    private String name;
    private Integer usingMerchant = 1;
    private int typ;

    public GoodsModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
