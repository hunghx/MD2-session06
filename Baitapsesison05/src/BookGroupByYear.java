public class BookGroupByYear {
    private int year;
    private int count; // lựa chọn 1 trong 2
    private Book[] bookArray;

    public BookGroupByYear() {
    }

    public BookGroupByYear(int year,int count, Book[] bookArray) {
        this.year = year;
        this.count = count;
        this.bookArray = bookArray;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book[] getBookArray() {
        return bookArray;
    }

    public void setBookArray(Book[] bookArray) {
        this.bookArray = bookArray;
    }
}
