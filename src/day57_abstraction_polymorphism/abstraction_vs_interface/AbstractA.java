package day57_abstraction_polymorphism.abstraction_vs_interface;

public abstract class AbstractA {
    public AbstractA(){
        System.out.println("Constructor is welcome here");
    }
    int num1;
    private double price;
    public static int count;
    public final String type="abstract";
    public static final String LANGUAGE="java";
//Both abstract class and interface are used to achieve abstraction
//in java.
    public abstract void absMethodA();
    public void MethodB(){
        System.out.println("MethodB");
    }
    public static void MethodC(){
        System.out.println("Static MethodC");
    }
}
