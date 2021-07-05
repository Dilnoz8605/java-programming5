package day56_abstraction.drivable;

public interface SelfDrivable {
    void autoPiloting();
default void selfParking(){
    System.out.println("Self Parking");
}
}
