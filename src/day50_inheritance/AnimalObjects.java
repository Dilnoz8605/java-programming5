package day50_inheritance;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name="Gray";
        animal1.type="Pitbull";
        animal1.speak();
        Cat cat1=new Cat();
        cat1.speak();
        Dog dog1=new Dog();
        dog1.speak();
        }
    }

