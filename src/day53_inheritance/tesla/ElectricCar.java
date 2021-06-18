package day53_inheritance.tesla;

public class ElectricCar {
    private String make;
    private String model;
    private int year;
    private double price;
    private int range;
    private static int count;
    public static final int MAX_RANGE=400;
    public ElectricCar(String make, String model, int year, double price, int range) {
       setMake(make);
       setModel(model);
       setYear(year);
       setPrice(price);
       setRange(range);
       count++;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", range=" + range +
                '}';
    }
        public final void charge(){
            System.out.println("Charging the electric car using plug-in");
            range=MAX_RANGE;
        }
    protected void driver(int miles){
        if(range==0 || range-miles<0){
            System.out.println("ERROR: cannot driver that far, you don't have enough range");
        }else{
            range-=miles;
            System.out.println("Driving "+miles+" miles...");
        }
    }

    public static int getCount() {
        return count;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
