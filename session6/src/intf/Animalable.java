package intf;

public interface Animalable {
    public static final Double PI = 3.14;
    // m tac các tính năng ăn uống, di chuyển của động vật
   public abstract void eat(String food); // ăn thức ăn
    void move(int steps); // di chuyển 1 số lượng bước

}
