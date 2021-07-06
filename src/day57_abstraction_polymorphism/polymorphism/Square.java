package day57_abstraction_polymorphism.polymorphism;

public class Square extends Shape{
    @Override
    public void draw() {
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 0; j < 15; j++) {
                System.out.print("*");
            }
        }
    }
}
