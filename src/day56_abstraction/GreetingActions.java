package day56_abstraction;

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
