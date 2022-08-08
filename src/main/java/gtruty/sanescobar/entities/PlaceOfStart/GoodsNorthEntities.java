package gtruty.sanescobar.entities.PlaceOfStart;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "goods_north")
public class GoodsNorthEntities {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer usingMerchant;
    private int typ;

    public GoodsNorthEntities(String name, Integer usingMerchant, int typ) {
        this.name = name;
        this.usingMerchant = usingMerchant;
        this.typ = typ;
    }

    public GoodsNorthEntities() {
    }
    public int getTyp() {
        return typ;
    }

    public void setTyp(int typ) {
        this.typ = typ;
    }

    public Integer getUsingMerchant() {
        return usingMerchant;
    }

    public void setUsingMerchant(Integer usingMerchant) {
        this.usingMerchant = usingMerchant;
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
}
