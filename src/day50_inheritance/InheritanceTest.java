package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.name="Murodil";
        person1.age=35;
        person1.eat();
        person1.talk();
        person1.walk();
        person1.work("Surgeon");
        Teacher teacher1=new Teacher();
        teacher1.name="Saim";
        teacher1.age=41;
        teacher1.teacherID=1234567;
        teacher1.eat();
        teacher1.talk();
        teacher1.walk();
        teacher1.work("Teacher");
        teacher1.teach("Java");
        System.out.println(teacher1);
        Student student1=new Student();
        student1.name="Adam";
        student1.age=13;
        student1.eat();
        student1.walk();
        student1.talk();
        student1.school="CybertekSchool";
        student1.study("JAVA");
        student1.work("Java Programmer");
    }
}
