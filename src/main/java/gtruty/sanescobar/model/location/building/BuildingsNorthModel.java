package gtruty.sanescobar.model.location.building;

import javax.persistence.*;
import java.math.BigDecimal;


public class BuildingsNorthModel {


    private String name;
    private String products1;
    private String products2;
    private BigDecimal moneyProfit1;
    private BigDecimal moneyProfit2;
    private BigDecimal costOfBuilding;
    private String requirements1;
    private String requirements2;
    private String suistenance;
    private Double valueOfSuistenance;
    private String info;
    private Long numberOfAnimal;
    private Long placeForGoods;
    private String specialFor;
    private Integer amount;




    public BuildingsNorthModel(String name, String products1, String products2, BigDecimal moneyProfit1, BigDecimal moneyProfit2, BigDecimal costOfBuilding, String requirements1, String requirements2, String suistenance, Double valueOfSuistenance, String info, Long numberOfAnimal, Long placeForGoods, String specialFor, Integer amount) {
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

}
