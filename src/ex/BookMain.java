package ex;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
        book.displayInfo();

        Book book2 = new Book("Hello Java", "Lee");
        book2.displayInfo();

        Book book3 = new Book("JPA Programming", "LEE", 700);
        book3.displayInfo();
    }

}
