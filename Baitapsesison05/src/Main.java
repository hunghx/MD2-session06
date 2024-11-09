//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // tạo sẵn danh sach , mảng các cuô sách
        Book[] books = new Book[3];
        books[0] = new Book("B001","Conan",1999);
        books[1] = new Book("B002","Tây Du Ký",1999);
        books[2] = new Book("B003","Cô bé bán diêm",2000);
        // yêu cầu : phân loại sách theo năm xuất bản và tính số lượng của từng nhóm
        // B1 : Phân nhóm theo năm
        // tạo 1 mảng chưa danh sách sau khi phân nhóm
        BookGroupByYear[] bookGroupByYears = new BookGroupByYear[books.length];
        // duyệt từng sách và thêm vào nhóm phân loại
        for (int i = 0; i < books.length; i++) {
           addBook(bookGroupByYears,books[i]);
        }
        // hiển thị ra thống kê
        for (BookGroupByYear group: bookGroupByYears){
            if (group!=null){
                System.out.printf("|Năm - %d | Số lượng : %d |\n",group.getYear(),group.getCount());
            }
        }
    }
    // hàm kiểm tra xem nam xuẩt bản đã tồn tại trong mảng bookGroupByYears
    // nếu đã tồn tại thì tăng số luợng lê 1 them thêm cuốn sách vào trong bookarrray của ối tượng đấy
    // nếu mà chưa tồn tại thì tạo mới đối tượng và thêm vào mảng ban đầu
    public static void addBook(BookGroupByYear[] bookGroupByYears, Book book) {
        boolean flag = false; // mặc đinịnh là ko tồn tại
        for (BookGroupByYear group : bookGroupByYears) {
            if (group!=null){ // nếu đã tồn tại nhóm
                if(group.getYear() == book.getYear()) {
                    // tăng count thêm 1
                    group.setCount(group.getCount()+1);
                    // thêm sách vào nhóm
                    flag = true;
                    break;
                }
            }
        }
        if (!flag){
            // tạo mới nhóm
            BookGroupByYear groupNew = new BookGroupByYear(book.getYear(),1,new Book[]{book});
            // thêm vào mảng phân nhóm
            for (int i = 0; i < bookGroupByYears.length; i++) {
                if (bookGroupByYears[i]==null){
                    bookGroupByYears[i] = groupNew;
                    break;
                }
            }
        }
    }
}