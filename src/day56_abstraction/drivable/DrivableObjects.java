package day56_abstraction.drivable;

public class DrivableObjects {
    public static void main(String[] args) {
       Tesla model3=new Tesla();
       model3.start();
       model3.hi();
       model3.transportPeople(6);
       model3.cost(500);
       model3.autoPiloting();
       model3.bye();
       model3.stop();

       Plane plane=new Plane();
       plane.hi();
       plane.start();
       plane.transportPeople(500);
       plane.cost(3000);
       plane.autoPiloting();
       plane.land();
       plane.stop();
       plane.bye();
    }
}
