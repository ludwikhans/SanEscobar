package gtruty.sanescobar.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "fields")
public class FieldsEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "cost_of_buying")
    private BigDecimal costOfBuying;
    @Column(name = "area")
    private Long area;
    @Column(name = "info")
    private String info;

    @ManyToMany
    @JoinTable(name = "plants_on_fields",joinColumns = @JoinColumn (name = "fiels_id" ),
            inverseJoinColumns = @JoinColumn(name = "plants_id"))
    private Set<PlantsEntity> plants;

    public FieldsEntity() {
    }

    public FieldsEntity(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTyp() {
        return name;
    }

    public void setTyp(String typ) {
        this.name = name;
    }

    public BigDecimal getCostOfBuying() {
        return costOfBuying;
    }

    public void setCostOfBuying(BigDecimal costOfBuying) {
        this.costOfBuying = costOfBuying;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Set<PlantsEntity> getPlants() {
        return plants;
    }

    public void setPlants(Set<PlantsEntity> plants) {
        this.plants = plants;
    }

    public FieldsEntity(Long id, String typ, BigDecimal costOfBuying, Long area, String info, Set<PlantsEntity> plants) {
        this.id = id;
        this.name = name;
        this.costOfBuying = costOfBuying;
        this.area = area;
        this.info = info;
        this.plants = plants;
    }
}
