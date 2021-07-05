package day56_abstraction.greeting;

import day56_abstraction.greeting.Greeting;
import day56_abstraction.greeting.Japanese;
import day56_abstraction.greeting.MountainLanguage;

public class GreetingActions {
    public static void main(String[] args) {
        Greeting gt = new MountainLanguage();
        gt.hi();
        gt.bye();
        gt=new Japanese();
        gt.hi();
        gt.bye();
    }
}
