package day54_abstraction;

public abstract class Student {
    public void code(String language){
        System.out.println("Student is coding using "+language);
    }
    public abstract void attendClass();
}


class OnlineStudents extends Student{
    @Override
 public void attendClass(){
     System.out.println("Online student is attending the class using zoom");
 }
}

class CampusStudents extends Student{
    @Override
    public void attendClass(){
        System.out.println("Campus Student is attending the class in person");
    }
}

class School{
    public static void main(String[] args) {
        OnlineStudents onlineStudent=new OnlineStudents();
        onlineStudent.attendClass();

        CampusStudents campusStudent=new CampusStudents();
        campusStudent.attendClass();
    }
}