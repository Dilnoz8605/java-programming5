package day58_polymorphism;

public class SupermanTest {
    public static void main(String[] args) {
        Father superman1=new Superman();
        superman1.playWithKid();
        superman1.feedKid();
        superman1.raiseKid();

        Worker superman2=new Superman();
        superman2.work("SDET");
        System.out.println("Superman2 got paid "+superman2.getPaid());

        Superman superman3=new Superman();
        superman3.feedKid();
        superman3.playWithKid();
        superman3.raiseKid();
        superman3.work("SDET");
        superman3.getPaid();
    }
}
