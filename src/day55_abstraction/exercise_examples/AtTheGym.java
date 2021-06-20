package day55_abstraction.exercise_examples;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise=new Running();
        Running running=new Running();
        Swimming swimming=new Swimming();
        FreeWeight freeWeight=new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 minutes - calories = "+exercise.getCalories(30));

        running.start();
        running.perform();
        System.out.println("Running 30 minutes - calories = "+ running.getCalories(30));

        swimming.start();
        swimming.perform();
        System.out.println("Swimming 30 minutes - calories = "+swimming.getCalories(30));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("Free Weight 30 minutes - calories = "+freeWeight.getCalories(30));
    }
}
