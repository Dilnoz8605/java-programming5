package day57_abstraction_polymorphism.polymorphism;

public class Triangle extends Shape{
    @Override
    public void draw() {
        for (int i = 1; i < 11; i+=2) {
            System.out.println();
            for (int j1 = 1; j1 <= 11-i; j1++) {
                System.out.print(" ");
            }
            for (int j3 = 0; j3 < i; j3++) {
                System.out.print("*");
            }
            for (int j3 = 0; j3 < i-1; j3++) {
                if(i!=1) {
                    System.out.print("*");
                }else{
                    break;
                }
            }
        }

    }
}
