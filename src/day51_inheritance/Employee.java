package day51_inheritance;

public class Employee {
    String jobTitle;

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public double calculateSalary(double hourlyRate){
        return 52*40*1.10*hourlyRate;

    }
}
