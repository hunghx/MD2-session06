package baitap;

public class Car extends Transportations{
    private String color;
    private int countSeat;
    // constructor

    public Car() {
    }

    public Car(String name, int yearIn, double weight, String color, int countSeat) {
        super(name, yearIn, weight);
        this.color = color;
        this.countSeat = countSeat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCountSeat() {
        return countSeat;
    }

    public void setCountSeat(int countSeat) {
        this.countSeat = countSeat;
    }
}
