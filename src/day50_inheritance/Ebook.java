package day50_inheritance;

public class Ebook extends Book{
    String size;
    int pages;

    @Override
    public String toString() {
        return "Ebook{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }

    public void readBook(){
        System.out.println("Reading the eBook");
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("size = " + size);
        System.out.println("pages = " + pages);
        System.out.println("price = " + price);

    }
}
