package day50_inheritance;

public class Animal {
    String type;
    String name;

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void speak(){
        System.out.println(type+" can speak");

    }
}
