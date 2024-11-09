package demo;

import intf.Animalable;
import intf.Shape;
import ra.Animal;

public class Dog extends Animal implements Animalable,Cloneable {
    @Override
    public void eat(String food) {

    }

    @Override
    public int getLegCount() {
       return 0;
    }

    @Override
    public void move(int steps) {

    }

    String name;

    public Dog(String speciesName) {
        super(speciesName); // hàm super dúng để gọi tới constructor của lớp cha,
        // phải đc gọi đầu tiên trong hàm tạo
        this.name = "meomeo";
        sum(7.5,8);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
    }
    double sum(double a, double b){
        return 0;
    };
    double sum( double b){
        return 0;
    };
    double sum(double a, double b,double c){
        return 0;
    };
    double sum(double a, double b,int c){
        return 0;
    };
    double sum(double a, int b){
        return 0;
    };
    double sum(float a, double b){
        return 0;
    };
}
