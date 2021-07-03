package day56_abstraction;

public interface Greeting {
    void hi();
    void bye();
}
class MountainLanguage implements Greeting{
    @Override
    public void hi() {
        System.out.println("Zeee");
    }
    @Override
    public void bye(){
        System.out.println("Buaaa");
    }
}
class Japanese implements Greeting{
    @Override
    public void hi() {
        System.out.println("こんにちは");
    }

    @Override
    public void bye() {
        System.out.println("さようなら");
    }
}
