import java.lang.*;
import java.util.*;

public class arthimetic{
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Input two numbers for arthimetic opertions ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Printing addition of two numbers " +(a+b));
        System.out.println("Printing subtraction of two numbers " +(a-b));
        System.out.println("Printing multiplication of two numbers " +(a*b));
        System.out.println("Printing division of two numbers " +(a/b));
        System.out.println("Printing modulus of two numbers " +(a%b));
        // c = a + b

    }
}