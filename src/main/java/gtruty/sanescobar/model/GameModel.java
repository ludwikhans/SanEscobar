package gtruty.sanescobar.model;

import gtruty.sanescobar.dao.startlocation.FieldCentralDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;



public class GameModel extends Game {
    private int turnNumber;
    private BigDecimal startMoney = BigDecimal.valueOf(100);
    private long money;
    private int area;
    private String agrarsystem;
    private  int merchant;
    private int usingMerchant;
    private int unoccupiedMerchant;


    public GameModel() {
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

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
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


}
