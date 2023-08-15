import java.lang.*;
import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        System.out.println("Input an integer \n");
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if(a%2 == 0){
            System.out.println("The given number is even");
        }
        else {
            System.out.println("The given number is odd");
        }
        
    }    
}
