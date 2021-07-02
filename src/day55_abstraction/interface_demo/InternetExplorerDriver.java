package day55_abstraction.interface_demo;

public class InternetExplorerDriver implements WebDriver{

    @Override
    public void get(String url) {
        System.out.println("InternetExplorerDriver - navigating to "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("InternetExplorerDriver - locating element by "+locator);
    }

    @Override
    public void quit() {
        System.out.println("InternetExplorerDriver - quitting driver");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
