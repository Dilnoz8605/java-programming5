package day55_abstraction.exercise_examples;

public abstract class Exercise {
    public void start(){
        System.out.println("Warming up and starting the exercise");
    }
    public abstract void perform();
    public abstract int getCalories(int minutes);



}
