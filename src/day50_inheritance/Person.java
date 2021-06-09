package day50_inheritance;

public class Person {
    String name;
    int age;
    public void talk(){
        System.out.println(name+" is talking");
    }
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void walk(){
        System.out.println(name+" is walking");
    }
    public void work(String job){
        System.out.println(name+" is working at "+job);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

