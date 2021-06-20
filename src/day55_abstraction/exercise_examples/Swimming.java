package day55_abstraction.exercise_examples;

public class Swimming extends Exercise{
    @Override
    public void perform() {
        System.out.println("Swimming in a swimming pool");
    }

    @Override
    public int getCalories(int minutes) {
        return minutes*11;
    }
}
