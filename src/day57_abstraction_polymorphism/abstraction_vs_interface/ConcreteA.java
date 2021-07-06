package day57_abstraction_polymorphism.abstraction_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA,InterfaceB {
    @Override
    public void absMethodA() {

    }
    @Override
    public void MethodB(){
        System.out.println("Ovirred MethodB");
    }
    public static void MethodC(){
        System.out.println("static MethodC hidden version is called");
    }

    @Override
    public void absMethodD(int num) {
        System.out.println("Overriden version is called");
    }
    /**
     * Class can extend ONE Abstract class
     * Class can implement MULTIPLE interfaces
     */
}
