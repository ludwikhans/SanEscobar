package gtruty.sanescobar.entities.PlaceOfStart;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "goods_central")
public class GoodsCentralEntities {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer usingMerchant;
    // 1 to rośliny 2 to budynki
    private int typ;

    public GoodsCentralEntities() {
    }

    public GoodsCentralEntities(String name, Integer usingMerchant, int typ) {
        this.name = name;
        this.usingMerchant = usingMerchant;
        this.typ = typ;
    }

    public GoodsCentralEntities(String name) {
        this.name = name;
    }

    public int getTyp() {
        return typ;
    }

    public void setTyp(int typ) {
        this.typ = typ;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUsingMerchant() {
        return usingMerchant;
    }

    public void setUsingMerchant(Integer usingMerchant) {
        this.usingMerchant = usingMerchant;
    }

    public GoodsCentralEntities(Integer id, String name, Integer usingMerchant) {
        this.id = id;
        this.name = name;
        this.usingMerchant = usingMerchant;


    }
}
