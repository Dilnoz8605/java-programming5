package day53_inheritance.hiding;

public class Parent {
    String name="parent>Mike Smith";
    public void introduce1(){
        System.out.println("Hello my name is "+name);
    }
}
class Child extends Parent{
    String name="child<Bob Smith";
    public void introduce2(){
        System.out.println("Hello my name is "+name);
    }
}
class Runner{
    public static void main(String[] args) {
        Parent parent=new Parent();
        parent.introduce1();
        Child child=new Child();
        child.introduce1();
        child.introduce2();
    }
}