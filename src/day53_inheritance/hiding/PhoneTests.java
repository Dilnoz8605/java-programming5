package day53_inheritance.hiding;

public class PhoneTests {
    public static void main(String[] args) {
        Phone phone1=new Phone();
        Mobile mobile1=new Mobile();
        phone1.call();
        mobile1.text();
        mobile1.call();
    }
}
