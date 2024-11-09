package baitap;

public class Test {
    public static void main(String[] args) {
        // tạo 5 phần tử Car
        Car car1 = new Car("Mercedes",1990,2000,"black",5);
        Car car2 = new Car("lambogini",1990,2000,"black",5);
        Car car3 = new Car("toyota",1990,2000,"black",5);
        Car car4 = new Car("fords",1990,2000,"black",5);
        Car car5 = new Car("RollRoyce",1990,2000,"black",5);
        // khởi tạo mảng
        Car[] carArray = new Car[]{car1,car2,car3,car4,car5};
    }
}
