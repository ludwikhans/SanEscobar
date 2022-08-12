package gtruty.sanescobar.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "animals")
public class AnimalsEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "products1")
    private String products1;
    @Column(name = "products2")
    private String products2;
    @Column(name = "money_profit1")
    private BigDecimal moneyProfit1;
    @Column(name = "money_profit2")
    private BigDecimal moneyProfit2;
    @Column(name = "cost_of_buying")
    private BigDecimal costOfBuying;
    @Column(name = "requirement")
    private String requirements;
    @Column(name = "suistenance1")
    private String suistenance1;
    @Column(name = "value_of_suistenance1")
    private Double valueOfSuistenance1;
    @Column(name = "suistenance2")
    private String suistenance2;
    @Column(name = "value_of_suistenance2")
    private Double valueOfSuistenance2;
    @Column(name = "info")
    private String info;
    @Column(name = "special_for")
    private String specialFor;
    @Column(name = "typ")
    private int typ;

    public AnimalsEntity() {
    }

    public AnimalsEntity(String name) {
        this.name = name;
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

    public BigDecimal getCostOfBuying() {
        return costOfBuying;
    }

    public void setCostOfBuying(BigDecimal costOfBuying) {
        this.costOfBuying = costOfBuying;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getSuistenance1() {
        return suistenance1;
    }

    public void setSuistenance1(String suistenance1) {
        this.suistenance1 = suistenance1;
    }

    public Double getValueOfSuistenance1() {
        return valueOfSuistenance1;
    }

    public void setValueOfSuistenance1(Double valueOfSuistenance1) {
        this.valueOfSuistenance1 = valueOfSuistenance1;
    }

    public String getSuistenance2() {
        return suistenance2;
    }

    public void setSuistenance2(String suistenance2) {
        this.suistenance2 = suistenance2;
    }

    public Double getValueOfSuistenance2() {
        return valueOfSuistenance2;
    }

    public void setValueOfSuistenance2(Double valueOfSuistenance2) {
        this.valueOfSuistenance2 = valueOfSuistenance2;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getSpecialFor() {
        return specialFor;
    }

    public void setSpecialFor(String specialFor) {
        this.specialFor = specialFor;
    }

    public int getTyp() {
        return typ;
    }

    public void setTyp(int typ) {
        this.typ = typ;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
