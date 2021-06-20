package day55_abstraction.exercise_examples;

public class Running extends Exercise{
    @Override
    public void perform(){
        System.out.println("Running");
    }
    @Override
    public int getCalories(int minutes){
        return minutes*10;
    }
}
