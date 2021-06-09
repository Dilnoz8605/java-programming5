package day50_inheritance;

public class Book {
    String title;
    double price;
    String author;
   String genre;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
