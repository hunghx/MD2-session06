package baitap;

public class Transportations {
    // các thuộc tính : private
    private String name;
    private  int yearIn;
    private double weight;
    // các constructor
    public Transportations() {
    }
    public Transportations(String name, int yearIn, double weight) {
        this.name = name;
        this.yearIn = yearIn;
        this.weight = weight;
    }
    // các phơng thwucs setter/getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearIn() {
        return yearIn;
    }

    public void setYearIn(int yearIn) {
        this.yearIn = yearIn;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
