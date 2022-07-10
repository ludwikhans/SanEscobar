package gtruty.sanescobar.model.plants;

import java.math.BigDecimal;

public abstract class Plant implements PlantCategory {
 private String name;
 private    PlantsCategory plantsCategory;
 private Integer area;
 private Integer profit;
 private BigDecimal income;


 public Plant(String name, PlantsCategory plantsCategory, Integer area, Integer profit, BigDecimal income) {
  this.name = name;
  this.plantsCategory = plantsCategory;
  this.area = area;
  this.profit = profit;
  this.income = income;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public PlantsCategory getPlantsCategory() {
  return plantsCategory;
 }

 public void setPlantsCategory(PlantsCategory plantsCategory) {
  this.plantsCategory = plantsCategory;
 }

 public Integer getArea() {
  return area;
 }

 public void setArea(Integer area) {
  this.area = area;
 }

 public Integer getProfit() {
  return profit;
 }

 public void setProfit(Integer profit) {
  this.profit = profit;
 }

 public BigDecimal getIncome() {
  return income;
 }

 public void setIncome(BigDecimal income) {
  this.income = income;
 }
}
