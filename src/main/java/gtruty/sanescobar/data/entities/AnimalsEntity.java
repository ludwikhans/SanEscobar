package gtruty.sanescobar.data.entities;

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
    @ManyToMany
    @JoinTable(name = "buildings_for_animals",joinColumns = @JoinColumn (name = "animals_id" ),
            inverseJoinColumns = @JoinColumn(name = "plants_id"))
    private Set<BuildingsEntity> buldings;
    @ManyToMany
    @JoinTable(name = "plants_for_animals",joinColumns = @JoinColumn (name = "animals_id" ),
            inverseJoinColumns = @JoinColumn(name = "plants_id"))
    private Set<PlantsEntity> plants;

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

    public Set<BuildingsEntity> getBuldings() {
        return buldings;
    }

    public void setBuldings(Set<BuildingsEntity> buldings) {
        this.buldings = buldings;
    }

    public Set<PlantsEntity> getPlants() {
        return plants;
    }

    public void setPlants(Set<PlantsEntity> plants) {
        this.plants = plants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalsEntity that = (AnimalsEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(products1, that.products1) && Objects.equals(products2, that.products2) && Objects.equals(moneyProfit1, that.moneyProfit1) && Objects.equals(moneyProfit2, that.moneyProfit2) && Objects.equals(costOfBuying, that.costOfBuying) && Objects.equals(requirements, that.requirements) && Objects.equals(suistenance1, that.suistenance1) && Objects.equals(valueOfSuistenance1, that.valueOfSuistenance1) && Objects.equals(suistenance2, that.suistenance2) && Objects.equals(valueOfSuistenance2, that.valueOfSuistenance2) && Objects.equals(info, that.info) && Objects.equals(specialFor, that.specialFor) && Objects.equals(buldings, that.buldings) && Objects.equals(plants, that.plants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, products1, products2, moneyProfit1, moneyProfit2, costOfBuying, requirements, suistenance1, valueOfSuistenance1, suistenance2, valueOfSuistenance2, info, specialFor, buldings, plants);
    }
}
