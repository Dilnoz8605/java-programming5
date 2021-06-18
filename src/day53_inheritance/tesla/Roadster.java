package day53_inheritance.tesla;

public class Roadster extends ElectricCar{

    public Roadster(String model, int year, double price, int range) {
        super("Tesla", model, year, price, range);
        System.out.println("Congratulations on your new Roadster");
    }
}
