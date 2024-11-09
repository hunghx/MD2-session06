package baitap;

public class Plane extends Transportations{
    private String type;
    private String company;

    public Plane() {
    }

    public Plane(String name, int yearIn, double weight, String type, String company) {
        super(name, yearIn, weight);
        this.type = type;
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
