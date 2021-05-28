package day48;

public class Address {
    private String city;
    private String street;
    private String state;
    private String zipCode;
    private String country ="USA";
    private String username="ADAM2008";
    private String password="5Ht388rc";
    private String oldPassword="1234567";
    private String oldUsername="NOAH2011";
    public Address(){
        System.out.println("Added constructor");
    }

    public void getCity(String username,String password) {
        if (this.password.equals(password) && this.username.equals(username)) {
            System.out.println(city);
        }else{
            System.out.println("Invalid username or password");
        }
    }

    public void setCity(String city,String username,String password) {
        if (this.password.equals(password) && this.username.equals(username)) {
            this.city = city;
        }else{
            System.out.println("Invalid username or password");
        }

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street,String username,String password) {
        if (this.password.equals(password) && this.username.equals(username)) {
            this.street=street;
        }else{
            System.out.println("Invalid username or password");
        }
    }

    public void getState(String username,String password) {
        if (this.password.equals(password) && this.username.equals(username)) {
            System.out.println(state);
        }else{
            System.out.println("Invalid username or password");
        }
    }

    public void setState(String state,String username,String password) {
        if (this.password.equals(password) && this.username.equals(username)) {
            this.state = state;
        }else{
            System.out.println("Invalid username or password");
        }

    }

    public void getZipCode(String username,String password) {
        if (this.password.equals(password) && this.username.equals(username)) {
            System.out.println(zipCode);
        }else{
            System.out.println("Invalid username or password");
        }
    }

    public void setZipCode(String zipCode,String username,String password) {
        if (this.password.equals(password) && this.username.equals(username)) {
            this.zipCode = zipCode;
        }else{
            System.out.println("Invalid username or password");
        }

    }

    public void getCountry(String username,String password) {
        if (this.password.equals(password) && this.username.equals(username)) {
            System.out.println(country);
        }else{
            System.out.println("Invalid username or password");
        }
    }

    public void setCountry(String country,String username,String password) {
        if (this.password.equals(password) && this.username.equals(username)) {
            this.country = country;
        }else{
            System.out.println("Invalid username or password");
        }

    }

    public String getUsername(String oldUsername,String oldPassword) {
        if (this.oldPassword.equals(oldPassword) && this.oldUsername.equals(oldUsername)) {
            System.out.println(username);
        }else{
            System.out.println("Invalid username or password");
        }

        return username;
    }

    public void setUsername(String username,String username1,String password1) {
        if (password1.equals(password) && username1.equals(username)) {
            this.username=  username;
        } else {
            System.out.println("Invalid username or password");
        }
    }

    public void getPassword(String username,String password) {
        if (password.equals(oldPassword) && username.equals(oldUsername)) {
            System.out.println(password);
        }else{
            System.out.println("Invalid username or password");
        }
    }

    public void setPassword(String password1,String username1,String password) {
        if (password1.equals(oldPassword) && username1.equals(oldUsername)) {
            this.password = password;
        }else{
            System.out.println("Invalid username or password");
        }

    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", oldPassword='" + oldPassword + '\'' +
                ", oldUsername='" + oldUsername + '\'' +
                '}';
    }
}
