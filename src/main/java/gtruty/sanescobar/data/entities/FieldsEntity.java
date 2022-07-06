package gtruty.sanescobar.data.entities;

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
    @Column(name = "area_of_plought_fields")
    private Long areaOfPloughtFields = area;
    @Column(name = "area_of_meadow")
    private Long areaOfmeadow;
    @ManyToMany
    @JoinTable(name = "plants_on_fields",joinColumns = @JoinColumn (name = "fiels_id" ),
            inverseJoinColumns = @JoinColumn(name = "plants_id"))
    private Set<PlantsEntity> plants;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldsEntity that = (FieldsEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(costOfBuying, that.costOfBuying) && Objects.equals(area, that.area) && Objects.equals(info, that.info) && Objects.equals(areaOfPloughtFields, that.areaOfPloughtFields) && Objects.equals(areaOfmeadow, that.areaOfmeadow) && Objects.equals(plants, that.plants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, costOfBuying, area, info, areaOfPloughtFields, areaOfmeadow, plants);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public Long getAreaOfPloughtFields() {
        return areaOfPloughtFields;
    }

    public void setAreaOfPloughtFields(Long areaOfPloughtFields) {
        this.areaOfPloughtFields = areaOfPloughtFields;
    }

    public Long getAreaOfmeadow() {
        return areaOfmeadow;
    }

    public void setAreaOfmeadow(Long areaOfmeadow) {
        this.areaOfmeadow = areaOfmeadow;
    }

    public Set<PlantsEntity> getPlants() {
        return plants;
    }

    public void setPlants(Set<PlantsEntity> plants) {
        this.plants = plants;
    }
}
