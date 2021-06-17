package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.jobTitle="Developer";
        System.out.println( employee1.calculateSalary(55.00));
        Contractor contractor1=new Contractor();
        contractor1.jobTitle="SDET";
        System.out.println(contractor1.calculateSalary(50.00));
        Contractor sdetContractor=new Contractor();
        double sdetSalary=sdetContractor.calculateSalary(55);
        System.out.println("sdetSalary = " + sdetSalary);
    }
}
