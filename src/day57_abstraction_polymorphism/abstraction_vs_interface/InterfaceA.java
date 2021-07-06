package day57_abstraction_polymorphism.abstraction_vs_interface;

public interface InterfaceA{
   /* public InterfaceA(){
        System.out.println("Constructor doesn't work in interface");
    }*/
    public static final String TYPE="interface";
    double MAXCOUNT=500;//this is also public static final
    //Both abstract class and interface are used to achieve abstraction
    //in java.
    public abstract void absMethodD(int num);
    public static void staticMethodE(String str){
        System.out.println("StaticMethodE "+str);
    }
    public static void defaultMethodF(){
        System.out.println("defaultMethodF");
    }
}
