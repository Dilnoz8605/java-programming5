package day53_inheritance.hiding;

public class Phone {
    String type="Old School Phone";
    public static void use(){
        System.out.println("Using the phone");
    }
    public void call(){
        use();
        System.out.println(" and making a phone call");
        }
    }

