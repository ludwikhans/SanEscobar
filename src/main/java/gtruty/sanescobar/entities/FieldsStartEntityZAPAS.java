/*
package gtruty.sanescobar.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "fields_start")
public class FieldsStartEntityZAPAS {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "cost_of_buying")
    private BigDecimal costOfBuying;
    @Column(name = "area")
    private Integer area;
    @Column(name = "info")
    private String info;
    @Column(name = "area_of_plought_fields")
    private Integer areaOfPloughtFields;
    @Column(name = "area_of_meadow")
    private Integer areaOfmeadow;
    @Column(name = "seed_of_field")
    private String seed;
    @ManyToMany
    @JoinTable(name = "plants_on_fields",joinColumns = @JoinColumn (name = "fiels_id" ),
            inverseJoinColumns = @JoinColumn(name = "plants_id"))
    private Set<PlantsEntity> plants;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldsStartEntityZAPAS that = (FieldsStartEntityZAPAS) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(costOfBuying, that.costOfBuying) && Objects.equals(area, that.area) && Objects.equals(info, that.info) && Objects.equals(areaOfPloughtFields, that.areaOfPloughtFields) && Objects.equals(areaOfmeadow, that.areaOfmeadow) && Objects.equals(seed, that.seed) && Objects.equals(plants, that.plants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, costOfBuying, area, info, areaOfPloughtFields, areaOfmeadow, seed, plants);
    }

    @Override
    public String toString() {
        return "FieldsStartEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", costOfBuying=" + costOfBuying +
                ", area=" + area +
                ", info='" + info + '\'' +
                ", areaOfPloughtFields=" + areaOfPloughtFields +
                ", areaOfmeadow=" + areaOfmeadow +
                ", seed='" + seed + '\'' +
                ", plants=" + plants +
                '}';
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

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getAreaOfPloughtFields() {
        return areaOfPloughtFields;
    }

    public void setAreaOfPloughtFields(Integer areaOfPloughtFields) {
        this.areaOfPloughtFields = areaOfPloughtFields;
    }

    public Integer getAreaOfmeadow() {
        return areaOfmeadow;
    }

    public void setAreaOfmeadow(Integer areaOfmeadow) {
        this.areaOfmeadow = areaOfmeadow;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public Set<PlantsEntity> getPlants() {
        return plants;
    }

    public void setPlants(Set<PlantsEntity> plants) {
        this.plants = plants;
    }
}
*/
