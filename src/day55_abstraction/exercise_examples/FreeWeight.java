package day55_abstraction.exercise_examples;

public class FreeWeight extends Lifting {
    @Override
    public void perform() {
        System.out.println("Lifting some weights");
    }

    @Override
    public int getCalories(int minutes) {
        return minutes*7;
    }
    public void endLift(){
        System.out.println("Ending the Lifting exercise");
    }
}
