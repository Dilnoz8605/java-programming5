package day50_inheritance;

public class Dog extends Animal{
    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void run(){
        System.out.println("Dog can run");

    }
    @Override
    public void speak(){
        System.out.println("Dog is saying woof-woof");
    }
}
