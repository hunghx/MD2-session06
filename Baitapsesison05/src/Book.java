public class Book {
    private String bookId;
    private String bookName;
    private int year;
    // ........ các thuộc tính khác

    public Book() {
    }

    public Book(String bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String bookId, String bookName, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.year = year;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
