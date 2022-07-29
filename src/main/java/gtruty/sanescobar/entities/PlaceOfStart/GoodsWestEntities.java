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

    public GoodsWestEntities() {
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
