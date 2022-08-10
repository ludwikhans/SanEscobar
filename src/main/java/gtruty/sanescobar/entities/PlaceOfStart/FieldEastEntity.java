package gtruty.sanescobar.entities.PlaceOfStart;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "fields_east")
public class FieldEastEntity {

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

    public FieldEastEntity() {
    }

    public FieldEastEntity(String name) {
        this.name = name;
    }

    public FieldEastEntity(String name, BigDecimal costOfBuying, Integer area, String info, String seed) {

        this.name = name;
        this.costOfBuying = costOfBuying;
        this.area = area;
        this.info = info;
        this.seed = seed;
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

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }
}
