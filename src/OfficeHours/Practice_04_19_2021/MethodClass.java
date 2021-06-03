package OfficeHours.Practice_04_19_2021;

public class MethodClass {

    /*

        void -> runs a block of code, there is no return value
           Arrays.sort() -> takes an array, sorts it, doesn't return anything

        return -> runs a block of code, but there is a return value
            Arrays.binarySearch() -> takes an array and element, tries to find the element, returns the index of the element

     */

    public static void methodOne(){
        System.out.println("One");
    }

    public static String methodTwo(){
        return "Two";
    }

    public static int methodThree(String word){
        return word.length();
    }

    public static boolean login (String username, String password){
        return true;
    }



}
