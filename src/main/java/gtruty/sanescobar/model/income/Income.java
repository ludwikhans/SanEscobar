package gtruty.sanescobar.model.income;

import java.math.BigDecimal;

public abstract class Income {

    BigDecimal finalIncome;
    BigDecimal income;
    Integer incomModifiing;
    Integer Area;


    public BigDecimal getFinalIncome() {
        return finalIncome;
    }

    public void setFinalIncome(BigDecimal finalIncome) {
        this.finalIncome = finalIncome;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public Integer getIncomModifiing() {
        return incomModifiing;
    }

    public void setIncomModifiing(Integer incomModifiing) {
        this.incomModifiing = incomModifiing;
    }

    public Integer getArea() {
        return Area;
    }

    public void setArea(Integer area) {
        Area = area;
    }
}
