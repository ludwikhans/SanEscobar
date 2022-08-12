package gtruty.sanescobar.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "fields_supply")
public class FieldsSupplyEntity {

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
    @Column(name = "seed_of_field")
    private String seed;


    public FieldsSupplyEntity() {
    }

    public FieldsSupplyEntity(String name) {
        this.name = name;
    }

    public FieldsSupplyEntity(String name, BigDecimal costOfBuying, Integer area, String info, String seed) {
        this.name = name;
        this.costOfBuying = costOfBuying;
        this.area = area;
        this.info = info;
        this.seed = seed;
    }

    public FieldsSupplyEntity(String name, BigDecimal costOfBuying, Integer area, String info) {
        this.name = name;
        this.costOfBuying = costOfBuying;
        this.area = area;
        this.info = info;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FieldsSupplyEntity(Long id, String typ, BigDecimal costOfBuying, Integer area, String info, Set<PlantsEntity> plants) {
        this.id = id;
        this.name = name;
        this.costOfBuying = costOfBuying;
        this.area = area;
        this.info = info;
    }
}
