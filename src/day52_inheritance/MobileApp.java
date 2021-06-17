package day52_inheritance;

public class MobileApp {
    String name;
    String version;
    protected boolean download(){
        System.out.println(name+" version "+version+" is downloaded");
        return true;
    }
    public void useTheApp(int minutes){
        System.out.println("Using the app "+name+" for "+minutes+" minutes");
    }
}
