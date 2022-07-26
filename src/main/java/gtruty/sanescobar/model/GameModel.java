package gtruty.sanescobar.model;

import java.math.BigDecimal;

public class GameModel {
    private int turnNumber;
    private BigDecimal startMoney = BigDecimal.valueOf(100);
    private long money;
    private double area = 10;
    private String agrarsystem;

    public GameModel() {
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

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
    public String agrarSystem(){
        if (area > 50){
            return "Trójpolówka" ;
        }return "dwópolówla";
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getAgrarsystem() {
        return agrarsystem;
    }

    public void setAgrarsystem(String agrarsystem) {
        this.agrarsystem = agrarsystem;
    }
}
