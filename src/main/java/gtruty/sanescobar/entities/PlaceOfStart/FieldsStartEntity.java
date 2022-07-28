package gtruty.sanescobar.entities.PlaceOfStart;

import gtruty.sanescobar.entities.PlantsEntity;
import gtruty.sanescobar.model.field.TypeOfField;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "fields_start")
public class FieldsStartEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private TypeOfField type;
    @Column(name = "cost_of_buying")
    private BigDecimal costOfBuying;
    @Column(name = "area")
    private Integer area;
    @Column(name = "info")
    private String info;
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
        FieldsStartEntity that = (FieldsStartEntity) o;
        return Objects.equals(id, that.id) && type == that.type && Objects.equals(costOfBuying, that.costOfBuying) && Objects.equals(area, that.area) && Objects.equals(info, that.info) && Objects.equals(seed, that.seed) && Objects.equals(plants, that.plants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, costOfBuying, area, info, seed, plants);
    }

    @Override
    public String toString() {
        return "FieldsStartEntity{" +
                "id=" + id +
                ", type=" + type +
                ", costOfBuying=" + costOfBuying +
                ", area=" + area +
                ", info='" + info + '\'' +
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

    public TypeOfField getType() {
        return type;
    }

    public void setType(TypeOfField type) {
        this.type = type;
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
