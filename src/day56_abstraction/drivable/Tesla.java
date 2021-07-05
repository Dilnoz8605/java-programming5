package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPeople(int capacity) {
        System.out.println("Tesla can transport "+capacity+" people");
    }

    @Override
    public void cost(int miles) {
        System.out.println("Tesla costs $"+(miles*0.10)+" to drive "+miles+" miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Tesla is driving in autonomous mode");
    }

    @Override
    public void hi() {
        System.out.println("Hello, this is the Tesla car");
    }

    @Override
    public void bye() {
        System.out.println("Bye, have a nice day");
    }
}
