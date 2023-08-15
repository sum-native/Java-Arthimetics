import java.lang.*;
import java.util.*;

public class simpleinterest {
    public static void main(String args[]) {
        int time, principal;
        float interest_rate;
        double simple_interest; 
        System.out.println("Enter the details - Principal Amount, Time, Rate of Interest \n");
        Scanner sc = new Scanner(System.in);
        principal = sc.nextInt();
        time = sc.nextInt();
        interest_rate = sc.nextFloat();
        System.out.println("The simple interest for the " +principal + " with " +interest_rate + " and " +time + " period is " );
        simple_interest = (principal*interest_rate*time)/100;
        System.out.println("Simple Intrest " +simple_interest);
        System.out.print("Interest per month is " +simple_interest/12);
    }    
}
