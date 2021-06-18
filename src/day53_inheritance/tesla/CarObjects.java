package day53_inheritance.tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar electricCar1 = new ElectricCar("Tesla", "Model Y", 2021, 48190.0, 326);
        electricCar1.driver(40);
        System.out.println(electricCar1);
        System.out.println("electric car1 make = "+electricCar1.getMake());
        System.out.println("electric car1 model = "+electricCar1.getModel());
        System.out.println("electric car1 year = "+electricCar1.getYear());
        System.out.println("electric car1 range = "+electricCar1.getRange());
        System.out.println("electric car1 price = "+electricCar1.getPrice());
        if(electricCar1.getPrice()>30000){
            System.out.println(electricCar1.getMake()+" || "+electricCar1.getModel()+" is out of my budget");
        }else{
            System.out.println("Just purchased "+electricCar1.getMake()+" || "+electricCar1.getModel());
        }
        ElectricCar electricCar2=new ElectricCar("Tesla","CyberTruck",2022,59990,300);
        System.out.println(electricCar2);
        System.out.println("Count = "+ElectricCar.getCount());
        Roadster roadster1=new Roadster("Roadster",2022,200000,620);
        System.out.println(roadster1);
        roadster1.driver(1000);
        roadster1.driver(600);
        System.out.println("Count = "+ElectricCar.getCount());
        ModelX modelX1=new ModelX("Model X",2021,119900.0,340);
        System.out.println(modelX1);
        modelX1.driver(10);
        System.out.println("Having lunch...");
        modelX1.driver(10);
        System.out.println("Range remaining = "+modelX1.getRange());
        System.out.println("Count = "+ElectricCar.getCount());
    }
}
