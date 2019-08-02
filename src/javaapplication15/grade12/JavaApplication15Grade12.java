package javaapplication15.grade12;
import java.util.*;

/**
 *
 * @author Vedant Shah
 */
public class JavaApplication15Grade12 {

    public static boolean prime(int n, int b){
        if((n / b) == n)
            return true;
        
        else if(n % b != 0)
            return prime(n, b - 1);
        
        else
            return false;
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Prime Checker!");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Please enter a positive value so you can determine if it is a prime number or not: ");
        int val = sc1.nextInt();
        boolean isPrime = prime(val, val - 1);
        if(isPrime == false)
            System.out.println("The value entered is not a prime number.");
        else
            System.out.println("The value entered is a prime number.");
        
    }
    
}
