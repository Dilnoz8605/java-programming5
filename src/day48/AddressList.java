package day48;

public class AddressList {
    public static void main(String[] args) {
        Address cyberTekAddress=new Address();
        cyberTekAddress.setCity("Nashville","ADAM2008","5Ht388rc");
        cyberTekAddress.getCity("ADAM2008","5Ht388rc");
        cyberTekAddress.setState("TN","ADAM2008","5Ht388rc");
        cyberTekAddress.getState("ADAM2008","5Ht388rc");
        cyberTekAddress.setZipCode("37027","ADAM2008","5Ht388rc");
        cyberTekAddress.getZipCode("ADAM2008","5Ht388rc");
        cyberTekAddress.setStreet("8227 Rossi Road","ADAM2008","5Ht388rc");
        System.out.println(cyberTekAddress.toString());
        Address newAddress=new Address();
    }
}
