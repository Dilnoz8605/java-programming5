package day51_inheritance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyftRide=new Lyft();
        LyftXL lyftXLRide=new LyftXL();
        Lux luxRide=new Lux();
        System.out.println("Lyft Ride for 5 miles = $"+Math.round(lyftRide.calculateRate(5)));
        System.out.println("LyftXL Ride for 5 miles = $"+Math.round(lyftXLRide.calculateRate(5)));
        System.out.println("Lux Ride for 5 miles = $"+Math.round(luxRide.calculateRate(5)));

    }
}
