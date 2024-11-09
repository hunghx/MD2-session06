package ra;

import demo.Dog;

public class Vertebrate extends Animal {
    // thừa kế các đặc điểm và hành vi ca ANimal
    private int age;
    private double height;

    public Vertebrate(String speciesName) {
        super(speciesName);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
}
