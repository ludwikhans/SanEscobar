package gtruty.sanescobar.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "plants")
public class PlantsEntity{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "products")
    private String products;
    @Column(name = "money_profit")
    private BigDecimal moneyProfit;
    @Column(name = "harvest")
    private Double harvest;
    @Column(name = "sowing_cost")
    private BigDecimal sowingCost;
    @Column(name = "requirements")
    private String requirements;
    @Column(name = "info")
    private String info;
    @Column(name = "special_for")
    private String specialFor;
    @Column(name = "years_old")
    private Long yearsOld;
    @Column(name = "category")
    private String category;





    public PlantsEntity() {
    }

    public PlantsEntity(String name, String products, BigDecimal moneyProfit, Double harvest, BigDecimal sowingCost, String requirements, String info, String specialFor, Long yearsOld, String category) {
        this.name = name;
        this.products = products;
        this.moneyProfit = moneyProfit;
        this.harvest = harvest;
        this.sowingCost = sowingCost;
        this.requirements = requirements;
        this.info = info;
        this.specialFor = specialFor;
        this.yearsOld = yearsOld;
        this.category = category;
    }

    public PlantsEntity(String name) {
        this.name = name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlantsEntity that = (PlantsEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(products, that.products) && Objects.equals(moneyProfit, that.moneyProfit) && Objects.equals(harvest, that.harvest) && Objects.equals(sowingCost, that.sowingCost) && Objects.equals(requirements, that.requirements) && Objects.equals(info, that.info) && Objects.equals(specialFor, that.specialFor) && Objects.equals(yearsOld, that.yearsOld);
    }

    @Override
    public String toString() {
        return "PlantsEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", products='" + products + '\'' +
                ", moneyProfit=" + moneyProfit +
                ", harvest=" + harvest +
                ", sowingCost=" + sowingCost +
                ", requirements='" + requirements + '\'' +
                ", info='" + info + '\'' +
                ", specialFor='" + specialFor + '\'' +
                ", yearsOld=" + yearsOld +
                ", category='" + category + '\'' +

                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, products, moneyProfit, harvest, sowingCost, requirements, info, specialFor, yearsOld, category);
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

    public Double getHarvest() {
        return harvest;
    }

    public void setHarvest(Double harvest) {
        this.harvest = harvest;
    }

    public BigDecimal getSowingCost() {
        return sowingCost;
    }

    public void setSowingCost(BigDecimal sowingCost) {
        this.sowingCost = sowingCost;
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

    public Long getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(Long yearsOld) {
        this.yearsOld = yearsOld;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
