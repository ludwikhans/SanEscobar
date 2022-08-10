package gtruty.sanescobar.model;

import gtruty.sanescobar.entities.GameEventEntity;

import java.math.BigDecimal;


public class GameModel {
    private int turnNumber;
    private BigDecimal startMoney = BigDecimal.valueOf(100);
    private BigDecimal availableMoney;
    private int area;
    private String agrarsystem;
    private  int merchant;
    private int usingMerchant;
    private int unoccupiedMerchant;
    private BigDecimal incomFromFields;
    private BigDecimal incomFromBuilding;
    private BigDecimal incomFromAnimal;
    private BigDecimal incomFromOwnedBuilding;
    private BigDecimal totalIncome;
    private String typeOfVilage;
    private int fieldArea;
    private String vilageName;
    private Long locationId;
    private String goodsName;
    private String buildingName ;
    private int fieldsToBuy = 5;
    private  BigDecimal costOfFields;
    private  BigDecimal costOfBuilding;
    private BigDecimal sumOfCost;
    private String eventInfo;
    private String animalInBuilding ;
    private String plantInFields;

    public void setIncomFromFields(BigDecimal incomFromFields) {
        this.incomFromFields = incomFromFields;
    }

    public String getPlantInFields() {
        return plantInFields;
    }

    public void setPlantInFields(String plantInFields) {
        this.plantInFields = plantInFields;
    }

    public String getAnimalInBuilding() {
        return animalInBuilding;
    }

    public void setAnimalInBuilding(String animalInBuilding) {
        this.animalInBuilding = animalInBuilding;
    }

    public String getEventInfo() {
        return eventInfo;
    }

    public void setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
    }

    public String getTypeOfVilage() {
        return typeOfVilage;
    }

    public void setTypeOfVilage(String typeOfVilage) {
        this.typeOfVilage = typeOfVilage;
    }

    public BigDecimal getSumOfCost() {
        return sumOfCost;
    }

    public void setSumOfCost(BigDecimal sumOfCost) {
        this.sumOfCost = sumOfCost;
    }

    public BigDecimal getCostOfFields() {
        return costOfFields;
    }

    public void setCostOfFields(BigDecimal costOfFields) {
        this.costOfFields = costOfFields;
    }

    public BigDecimal getCostOfBuilding() {
        return costOfBuilding;
    }

    public void setCostOfBuilding(BigDecimal costOfBuilding) {
        this.costOfBuilding = costOfBuilding;
    }

    public BigDecimal getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(BigDecimal availableMoney) {
        this.availableMoney = availableMoney;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getFieldsToBuy() {
        return fieldsToBuy;
    }

    public void setFieldsToBuy(int fieldsToBuy) {
        this.fieldsToBuy = fieldsToBuy;
    }

    public int getFieldArea() {
        return fieldArea;
    }

    public void setFieldArea(int fieldArea) {
        this.fieldArea = fieldArea;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public GameModel() {
    }

    public BigDecimal getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(BigDecimal totalIncome) {
        this.totalIncome = totalIncome;
    }

    public BigDecimal getIncomFromOwnedBuilding() {
        return incomFromOwnedBuilding;
    }

    public void setIncomFromOwnedBuilding(BigDecimal incomFromOwnedBuilding) {
        this.incomFromOwnedBuilding = incomFromOwnedBuilding;
    }

    public BigDecimal getIncomFromAnimal() {
        return incomFromAnimal;
    }

    public void setIncomFromAnimal(BigDecimal incomFromAnimal) {
        this.incomFromAnimal = incomFromAnimal;
    }

    public BigDecimal getIncomFromBuilding() {
        return incomFromBuilding;
    }

    public void setIncomFromBuilding(BigDecimal incomFromBuilding) {
        this.incomFromBuilding = incomFromBuilding;
    }

    public BigDecimal getIncomFromFields() {
        return incomFromFields;
    }



    public int getUsingMerchant() {
        return usingMerchant;
    }

    public void setUsingMerchant(int usingMerchant) {
        this.usingMerchant = usingMerchant;
    }

    public int getUnoccupiedMerchant() {
        return unoccupiedMerchant;
    }

    public void setUnoccupiedMerchant(int unoccupiedMerchant) {
        this.unoccupiedMerchant = unoccupiedMerchant;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getMerchant() {
        return merchant;
    }

    public void setMerchant(int merchant) {
        this.merchant = merchant;
    }

    public BigDecimal getStartMoney() {
        return startMoney;
    }

    public void setStartMoney(BigDecimal startMoney) {
        this.startMoney = startMoney;
    }

    public int getTurnNumber() {
        return turnNumber;
    }

    public void setTurnNumber(int turnNumber) {
        this.turnNumber = turnNumber;
    }




    public String getAgrarsystem() {
        return agrarsystem;
    }

    public void setAgrarsystem(String agrarsystem) {
        this.agrarsystem = agrarsystem;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;

    }


    public void setVilageName(String vilageName) {
        this.vilageName = vilageName;
    }

    public String getVilageName() {
        return vilageName;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void processEvent(GameEventEntity gameEvent) {
        //TODO
    }
}
