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
        System.out.println(name+" can run");

    }
}
