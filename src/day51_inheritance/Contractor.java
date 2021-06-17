package day51_inheritance;

public class Contractor extends Employee{
    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public double calculateSalary(double hourlyRate){
        return 52*40*hourlyRate;

    }
}
