package day50_inheritance;

public class MethodOverloading {
    public static void main(String[] args) {
        addition(1,2);
        addition(1,2,3);
        addition(1,2,3,4);
    }
    public static void addition(int num1, int num2){
        System.out.println(num1+num2);
    }
    public static void addition(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }
    public static void addition(int num1, int num2, int num3, int num4){
        System.out.println(num1+num2+num3+num4);
    }
}
