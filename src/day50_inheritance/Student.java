package day50_inheritance;

public class Student extends Person{
        String school;
        public void study(String subject){
            System.out.println(name+" is studying "+subject);
        }
}
