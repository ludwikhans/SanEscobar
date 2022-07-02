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
    @Column(name = "products")
    private String products;
    @Column(name = "money_profit")
    private BigDecimal moneyProfit;
    @Column(name = "cost_of_buying")
    private BigDecimal costOfBuying;
    @Column(name = "requirement")
    private String requirements;
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
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(products, that.products) && Objects.equals(moneyProfit, that.moneyProfit) && Objects.equals(costOfBuying, that.costOfBuying) && Objects.equals(requirements, that.requirements) && Objects.equals(info, that.info) && Objects.equals(specialFor, that.specialFor) && Objects.equals(buldings, that.buldings) && Objects.equals(plants, that.plants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, products, moneyProfit, costOfBuying, requirements, info, specialFor, buldings, plants);
    }
}
