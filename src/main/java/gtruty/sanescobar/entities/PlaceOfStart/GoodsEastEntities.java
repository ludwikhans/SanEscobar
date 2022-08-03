package gtruty.sanescobar.entities.PlaceOfStart;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "goods_east")
public class GoodsEastEntities {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer usingMerchant;
    private int typ;


    public Integer getUsingMerchant() {
        return usingMerchant;
    }

    public void setUsingMerchant(Integer usingMerchant) {
        this.usingMerchant = usingMerchant;
    }

    public GoodsEastEntities() {
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
}
