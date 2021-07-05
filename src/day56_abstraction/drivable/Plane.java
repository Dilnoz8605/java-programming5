package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPeople(int capacity) {
        System.out.println("Plane can transport "+capacity+" people");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane costs $"+(mile*1)+" to drive "+mile+" miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("The plane is flying in autopilot mode");
    }

    public void land() {
        System.out.println("Plane is landing");
    }

    @Override
    public void hi() {
        System.out.println("Welcome Aboard");
    }

    @Override
    public void bye() {
        System.out.println("Thanks for flying with us");
    }
}
