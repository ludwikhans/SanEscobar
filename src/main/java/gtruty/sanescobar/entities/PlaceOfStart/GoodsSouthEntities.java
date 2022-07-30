package gtruty.sanescobar.entities.PlaceOfStart;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "goods_south")
public class GoodsSouthEntities {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer usingMerchant;

    public GoodsSouthEntities() {
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
