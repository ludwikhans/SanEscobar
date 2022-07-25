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
    private Long locationId;

    public VilageEntity() {
    }

    public VilageEntity(String name, Long locationId) {
        this.id = id;
        this.name = name;
        this.locationId = locationId;
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

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }
}
