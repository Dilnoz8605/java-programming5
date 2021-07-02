package day55_abstraction.interface_demo;


public class DriverObjects {
    public static void main(String[] args) {
        WebDriver driver1 = new ChromeDriver();
        WebDriver driver2 = new FirefoxDriver();
        WebDriver driver3 = new InternetExplorerDriver();
        driver1.get("https://google.com");
        driver1.findElement("//input[@name='q']");
        System.out.println("Title = " + driver1.getTitle());
    }
}
