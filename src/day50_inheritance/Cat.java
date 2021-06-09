package day50_inheritance;

public class Cat extends Animal{
    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void jump(){
        System.out.println(name+" can run");

    }
}
