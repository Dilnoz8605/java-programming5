package day50_inheritance;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {
    static int num;
    static List<String> carModels;
    static {
        System.out.println("static initializer block");
        num=10;
        carModels=new ArrayList<>();
        carModels.addAll(Arrays.asList("\"Abarth\",\n" +
                "  \"Alfa Romeo\",\n" +
                "  \"Aston Martin\",\n" +
                "  \"Audi\",\n" +
                "  \"Bentley\",\n" +
                "  \"BMW\",\n" +
                "  \"Bugatti\",\n" +
                "  \"Cadillac\",\n" +
                "  \"Chevrolet\",\n" +
                "  \"Chrysler\",\n" +
                "  \"Citroën\",\n" +
                "  \"Dacia\",\n" +
                "  \"Daewoo\",\n" +
                "  \"Daihatsu\",\n" +
                "  \"Dodge\",\n" +
                "  \"Donkervoort\",\n" +
                "  \"DS\",\n" +
                "  \"Ferrari\",\n" +
                "  \"Fiat\",\n" +
                "  \"Fisker\",\n" +
                "  \"Ford\",\n" +
                "  \"Honda\",\n" +
                "  \"Hummer\",\n" +
                "  \"Hyundai\",\n" +
                "  \"Infiniti\",\n" +
                "  \"Iveco\",\n" +
                "  \"Jaguar\",\n" +
                "  \"Jeep\",\n" +
                "  \"Kia\",\n" +
                "  \"KTM\",\n" +
                "  \"Lada\",\n" +
                "  \"Lamborghini\",\n" +
                "  \"Lancia\",\n" +
                "  \"Land Rover\",\n" +
                "  \"Landwind\",\n" +
                "  \"Lexus\",\n" +
                "  \"Lotus\",\n" +
                "  \"Maserati\",\n" +
                "  \"Maybach\",\n" +
                "  \"Mazda\",\n" +
                "  \"McLaren\",\n" +
                "  \"Mercedes-Benz\",\n" +
                "  \"MG\",\n" +
                "  \"Mini\",\n" +
                "  \"Mitsubishi\",\n" +
                "  \"Morgan\",\n" +
                "  \"Nissan\",\n" +
                "  \"Opel\",\n" +
                "  \"Peugeot\",\n" +
                "  \"Porsche\",\n" +
                "  \"Renault\",\n" +
                "  \"Rolls-Royce\",\n" +
                "  \"Rover\",\n" +
                "  \"Saab\",\n" +
                "  \"Seat\",\n" +
                "  \"Skoda\",\n" +
                "  \"Smart\",\n" +
                "  \"SsangYong\",\n" +
                "  \"Subaru\",\n" +
                "  \"Suzuki\",\n" +
                "  \"Tesla\",\n" +
                "  \"Toyota\",\n" +
                "  \"Volkswagen\",\n" +
                "  \"Volvo\""));
    }
public StaticBlockDemo(){
    System.out.println("Constructor Method");
    num+=5;
}


}
