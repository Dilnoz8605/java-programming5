package day55_abstraction.exercise_examples;

public class JavaProgramming extends Exercise{
    @Override
    public void perform() {
        System.out.println("Coding some java");
    }

    @Override
    public int getCalories(int minutes) {
        return 35;
    }
}
