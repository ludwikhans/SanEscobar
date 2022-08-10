package gtruty.sanescobar.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "buildings_supply")
public class BuildingsSupplyEntity {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "cost_of_buildings")
    private BigDecimal costOfBuilding;
    @Column(name = "info")
    private String info;
    @Column(name = "type")
    private Integer type;


    public BuildingsSupplyEntity(String name, BigDecimal costOfBuilding, String info, Integer type) {
        this.name = name;
        this.costOfBuilding = costOfBuilding;
        this.info = info;
        this.type = type;
    }



    public BuildingsSupplyEntity(String name) {
        this.name = name;
    }

    public BuildingsSupplyEntity() {
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

    public BigDecimal getCostOfBuilding() {
        return costOfBuilding;
    }

    public void setCostOfBuilding(BigDecimal costOfBuilding) {
        this.costOfBuilding = costOfBuilding;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}

