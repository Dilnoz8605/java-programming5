package day55_abstraction.interface_demo;

public interface WebDriver {
    void get(String url);
    void findElement(String locator);
    void quit();
    String getTitle();
}
