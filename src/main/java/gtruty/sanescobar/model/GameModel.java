package gtruty.sanescobar.model;

public class GameModel {
    private int turnNumber;
    private long money;
    private double area = 10;
    private String agrarsystem;

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
