package ra;

import demo.Dog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // khởi  tạo đối tượng động vật
//        Animal cat  = new Animal();
//        cat.speciesName = "Cat";
//        cat.gen = true;
//        cat.weight = 4;
//        cat.color = "Orange";
////        cat.legCount = 4;
//        System.out.println(cat.speciesName);


        // tạo đối tượng đôg vật có xương sống
        Animal animal = new Dog("animal");
        System.out.println(animal.getLegCount());; /// =???
        Dog dog = new Dog("Dog");
        System.out.println(dog.getLegCount());; // trả về ???

    }
}