package day57_abstraction_polymorphism.polymorphism;

public class Runner {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.makeNoise();
        Animal anm1=new Dog();
        anm1.makeNoise();
        Animal anm2=new Horse();
        anm2.makeNoise();
        Animal anm3=new Cat();
        anm3.makeNoise();
        Shape shape=new Triangle();
        shape.draw();
        Shape shape1=new Square();
        shape1.draw();
        Shape shape2=new Circle();
        shape2.draw();

    }
}
