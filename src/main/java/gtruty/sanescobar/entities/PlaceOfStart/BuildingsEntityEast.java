package gtruty.sanescobar.entities.PlaceOfStart;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "building_east")
public class BuildingsEntityEast {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
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
    private Integer numberOfAnimal;
    @Column(name = "place_for_goods")
    private Integer placeForGoods;
    @Column(name = "special_for")
    private String specialFor;
    @Column (name = "amaount")
    private Integer amount;
    @Column(name = "type")
    private Integer type;
    @Column (name = "animal_in_building")
    private String animalInBuilding;

    public BuildingsEntityEast() {
    }

    public BuildingsEntityEast(String name) {
        this.name = name;
    }

    public BuildingsEntityEast(String name, String products1, String products2, BigDecimal moneyProfit1, BigDecimal moneyProfit2, BigDecimal costOfBuilding, String requirements1, String requirements2, String suistenance, Double valueOfSuistenance, String info, Integer numberOfAnimal, Integer placeForGoods, String specialFor, Integer amount, Integer type) {
        this.name = name;
        this.products1 = products1;
        this.products2 = products2;
        this.moneyProfit1 = moneyProfit1;
        this.moneyProfit2 = moneyProfit2;
        this.costOfBuilding = costOfBuilding;
        this.requirements1 = requirements1;
        this.requirements2 = requirements2;
        this.suistenance = suistenance;
        this.valueOfSuistenance = valueOfSuistenance;
        this.info = info;
        this.numberOfAnimal = numberOfAnimal;
        this.placeForGoods = placeForGoods;
        this.specialFor = specialFor;
        this.amount = amount;
        this.type = type;
    }

    public BuildingsEntityEast(String name, String products1, String products2, BigDecimal moneyProfit1, BigDecimal moneyProfit2, BigDecimal costOfBuilding, String requirements1, String requirements2, String suistenance, Double valueOfSuistenance, String info, Integer numberOfAnimal, Integer placeForGoods, String specialFor, Integer amount, Integer type, String animalInBuilding) {
        this.name = name;
        this.products1 = products1;
        this.products2 = products2;
        this.moneyProfit1 = moneyProfit1;
        this.moneyProfit2 = moneyProfit2;
        this.costOfBuilding = costOfBuilding;
        this.requirements1 = requirements1;
        this.requirements2 = requirements2;
        this.suistenance = suistenance;
        this.valueOfSuistenance = valueOfSuistenance;
        this.info = info;
        this.numberOfAnimal = numberOfAnimal;
        this.placeForGoods = placeForGoods;
        this.specialFor = specialFor;
        this.amount = amount;
        this.type = type;
        this.animalInBuilding = animalInBuilding;
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

    public Integer getNumberOfAnimal() {
        return numberOfAnimal;
    }

    public void setNumberOfAnimal(Integer numberOfAnimal) {
        this.numberOfAnimal = numberOfAnimal;
    }

    public Integer getPlaceForGoods() {
        return placeForGoods;
    }

    public void setPlaceForGoods(Integer placeForGoods) {
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAnimalInBuilding() {
        return animalInBuilding;
    }

    public void setAnimalInBuilding(String animalInBuilding) {
        this.animalInBuilding = animalInBuilding;
    }
}
