package gtruty.sanescobar.data.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "buildings")
public class BuildingsEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "product")
    private String products;
    @Column(name = "money_profit")
    private BigDecimal moneyProfit;
    @Column(name = "cost_of_buildings")
    private BigDecimal costOfBuilding;
    @Column(name = "requirements")
    private String requirements;
    @Column(name = "info")
    private String info;
    @Column(name = "number_of_animals")
    private Long numberOfAnimal;
    @Column(name = "place_for_goods")
    private Long placeForGoods;
    @Column(name = "special_for")
    private String specialFor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingsEntity that = (BuildingsEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(products, that.products) && Objects.equals(moneyProfit, that.moneyProfit) && Objects.equals(costOfBuilding, that.costOfBuilding) && Objects.equals(requirements, that.requirements) && Objects.equals(info, that.info) && Objects.equals(numberOfAnimal, that.numberOfAnimal) && Objects.equals(placeForGoods, that.placeForGoods) && Objects.equals(specialFor, that.specialFor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, products, moneyProfit, costOfBuilding, requirements, info, numberOfAnimal, placeForGoods, specialFor);
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

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public BigDecimal getMoneyProfit() {
        return moneyProfit;
    }

    public void setMoneyProfit(BigDecimal moneyProfit) {
        this.moneyProfit = moneyProfit;
    }

    public BigDecimal getCostOfBuilding() {
        return costOfBuilding;
    }

    public void setCostOfBuilding(BigDecimal costOfBuilding) {
        this.costOfBuilding = costOfBuilding;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Long getNumberOfAnimal() {
        return numberOfAnimal;
    }

    public void setNumberOfAnimal(Long numberOfAnimal) {
        this.numberOfAnimal = numberOfAnimal;
    }

    public Long getPlaceForGoods() {
        return placeForGoods;
    }

    public void setPlaceForGoods(Long placeForGoods) {
        this.placeForGoods = placeForGoods;
    }

    public String getSpecialFor() {
        return specialFor;
    }

    public void setSpecialFor(String specialFor) {
        this.specialFor = specialFor;
    }
}
