package day52_inheritance.discordUsers;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Adam");
        user1.setRole("Student");
        Admin admin1=new Admin();
        admin1.setId(54321);
        admin1.setName("Oscar");
        admin1.setRole("Admin");
    }
}
