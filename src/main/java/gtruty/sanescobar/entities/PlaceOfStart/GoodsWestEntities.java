package gtruty.sanescobar.entities.PlaceOfStart;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "goods_west")
public class GoodsWestEntities {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer usingMerchant;
    private int typ;

    public GoodsWestEntities() {
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
