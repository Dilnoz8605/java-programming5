package day52_inheritance;

public class MobileApp {
    private String name;
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    protected boolean download(){
        System.out.println(name+" version "+version+" is downloaded");
        return true;
    }
    public void useTheApp(int minutes){
        System.out.println("Using the app "+name+" for "+minutes+" minutes");
    }
}
