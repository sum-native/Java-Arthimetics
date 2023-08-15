import java.lang.*;
import java.util.*;

public class swap {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Input two numbers to swap \n");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Input is a=" +a +" b=" +b);
        c = a;
        a = b;
        b = c;
        System.out.println("Numbers after swapping a=" +a +" b=" +b);
    }
}
