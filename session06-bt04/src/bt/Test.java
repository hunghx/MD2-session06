package bt;

public class Test {
    public static void main(String[] args) {
        Shape vuong = new Rectangle("Green",5,5);
        Shape chunhat = new Rectangle("Blue",10,5);
        Shape tron = new Circle("Green",5);
        System.out.printf("Hình vuông có mau sac la : %s , diện tích là %s \n",vuong.getColor(),vuong.getArea());
        System.out.printf("Hình chu nhat có mau sac la : %s , diện tích là %s \n",chunhat.getColor(),chunhat.getArea());
        System.out.printf("Hình tron có mau sac la : %s , diện tích là %s \n",tron.getColor(),tron.getArea());
    }
}
