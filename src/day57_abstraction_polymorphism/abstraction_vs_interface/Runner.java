package day57_abstraction_polymorphism.abstraction_vs_interface;

public class Runner {
    /**AbstractA abstractA=new AbstractA(); ERROR
     //InterfaceA interfaceA=new InterfaceA(); ERROR
     //We cannot create object(instantiate) neither of them.
     */
    public static void main(String[] args) {
        InterfaceA.staticMethodE("wooden-spoon");

    }
}
