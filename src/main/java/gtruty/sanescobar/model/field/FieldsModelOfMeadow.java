package gtruty.sanescobar.model.field;

import java.math.BigDecimal;

public class FieldsModelOfMeadow {


    private String name = "Łąka";
    private BigDecimal costOfBuying;
    private Integer area;
    private String info = "podstawa do hodowli zwierząt";
    private String seed;

    public FieldsModelOfMeadow(Integer area) {
        this.area = area;
    }

    public BigDecimal getCostOfBuying() {
        return costOfBuying;
    }

    public void setCostOfBuying(BigDecimal costOfBuying) {
        this.costOfBuying = costOfBuying;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }
}

