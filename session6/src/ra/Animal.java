package ra;

public class Animal {
    public String speciesName; // tên loài
    public String color;
    double weight;
    protected boolean gen; // có thể truy cập từ bên ngoài nhưng cần phải kế thừa
    private int legCount;

    public int getLegCount() {
        // bảo mật
        // logic kiểm tra  thông tin truy cập
        return this.legCount;
    }

    public Animal(String speciesName) {
        this.speciesName = speciesName;
        System.out.println("gọi tới constructor có 1 tham s là Stirng");
    }

    public Animal() {
    }

    public Animal(int legCount) {
        // khới tạo giá trị mặc định cho các thuộc tính
        speciesName = "no name";
        color = "no color";
        weight = 0;
        gen = false;
        this.legCount = legCount;
    }

}
