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

    public GoodsCentralEntities(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public GoodsCentralEntities() {
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
