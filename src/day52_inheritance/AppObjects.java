package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
MobileApp mobileApp1=new MobileApp();
mobileApp1.setName("Youtube");
mobileApp1.useTheApp(10);

Instagram instagram=new Instagram();
instagram.setName("Instagram");
instagram.useTheApp(20);
instagram.setVersion("1.1.2");
instagram.download();

Discord b22Discord=new Discord();
b22Discord.setName("Discord");
b22Discord.useTheApp(100);
b22Discord.setVersion("0.23");
b22Discord.download();
b22Discord.printInfo();

    }
}
