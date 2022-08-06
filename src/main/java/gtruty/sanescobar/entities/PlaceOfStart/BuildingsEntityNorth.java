package gtruty.sanescobar.entities.PlaceOfStart;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "building_north")
public class BuildingsEntityNorth {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "product1")
    private String products1;
    @Column(name = "product2")
    private String products2;
    @Column(name = "money_profit1")
    private BigDecimal moneyProfit1;
    @Column(name = "money_profit2")
    private BigDecimal moneyProfit2;
    @Column(name = "cost_of_buildings")
    private BigDecimal costOfBuilding;
    @Column(name = "requirements1")
    private String requirements1;
    @Column(name = "requirements2")
    private String requirements2;
    @Column(name = "suistenance")
    private String suistenance;
    @Column(name = "value_of_suistenance")
    private Double valueOfSuistenance;
    @Column(name = "info")
    private String info;
    @Column(name = "number_of_animals")
    private Long numberOfAnimal;
    @Column(name = "place_for_goods")
    private Long placeForGoods;
    @Column(name = "special_for")
    private String specialFor;
    @Column (name = "amaount")
    private Integer amount;
    @Column (name = "animal_in_building")
    private String animalInBuilding;

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

    public String getProducts1() {
        return products1;
    }

    public void setProducts1(String products1) {
        this.products1 = products1;
    }

    public String getProducts2() {
        return products2;
    }

    public void setProducts2(String products2) {
        this.products2 = products2;
    }

    public BigDecimal getMoneyProfit1() {
        return moneyProfit1;
    }

    public void setMoneyProfit1(BigDecimal moneyProfit1) {
        this.moneyProfit1 = moneyProfit1;
    }

    public BigDecimal getMoneyProfit2() {
        return moneyProfit2;
    }

    public void setMoneyProfit2(BigDecimal moneyProfit2) {
        this.moneyProfit2 = moneyProfit2;
    }

    public BigDecimal getCostOfBuilding() {
        return costOfBuilding;
    }

    public void setCostOfBuilding(BigDecimal costOfBuilding) {
        this.costOfBuilding = costOfBuilding;
    }

    public String getRequirements1() {
        return requirements1;
    }

    public void setRequirements1(String requirements1) {
        this.requirements1 = requirements1;
    }

    public String getRequirements2() {
        return requirements2;
    }

    public void setRequirements2(String requirements2) {
        this.requirements2 = requirements2;
    }

    public String getSuistenance() {
        return suistenance;
    }

    public void setSuistenance(String suistenance) {
        this.suistenance = suistenance;
    }

    public Double getValueOfSuistenance() {
        return valueOfSuistenance;
    }

    public void setValueOfSuistenance(Double valueOfSuistenance) {
        this.valueOfSuistenance = valueOfSuistenance;
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getAnimalInBuilding() {
        return animalInBuilding;
    }

    public void setAnimalInBuilding(String animalInBuilding) {
        this.animalInBuilding = animalInBuilding;
    }
}
