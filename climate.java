import java.lang.*;
import java.util.*;
public class climate {
    public static void main(String[] args) {
        float x_farenheit, celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the temperature in your city in terms of farenheit ");
        x_farenheit = sc.nextFloat();
        celsius = (x_farenheit-32)*5/9;
        System.out.print("The temperature in Celsius is " +celsius +"\n");
    }
}
