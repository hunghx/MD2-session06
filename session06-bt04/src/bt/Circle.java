package bt;

public class Circle extends Shape{
    private double radios;

    public Circle() {
    }

    public Circle(String color, double radios) {
        super(color);
        this.radios = radios;
    }

    public double getRadios() {
        return radios;
    }

    public void setRadios(double radios) {
        this.radios = radios;
    }

    @Override
    public double getArea() {
        return Math.PI*radios*radios;
    }
}
