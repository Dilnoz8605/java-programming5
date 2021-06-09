package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book1=new Book();
        book1.title="Intro to Java";
        book1.author="Akbar";
        book1.price=19.99;
      book1.genre="programming";
        System.out.println(book1);
        AudioBook audioBook1=new AudioBook();
        audioBook1.author="Unmesh";
        audioBook1.length=60;
        audioBook1.narrator="Noah";
        audioBook1.price=44.99;
        audioBook1.title="Selenium CookBook";
        audioBook1.genre="automation";
        audioBook1.listen();
        Ebook eBook1=new Ebook();
        eBook1.title="Java Data Structures";
        eBook1.author="Dilnoza";
        eBook1.price=85.00;
        eBook1.genre="programming";
        eBook1.size="2GB";
        eBook1.pages=1000;
        eBook1.readBook();


    }
}
