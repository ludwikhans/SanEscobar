package gtruty.sanescobar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vilage")
public class VilageEntity {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    public VilageEntity(String name) {
        this.id = id;
        this.name = name;
    }

    public VilageEntity() {
    }
}
