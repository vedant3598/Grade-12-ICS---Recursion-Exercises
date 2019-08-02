package javaapplication15.grade12;
import java.util.*;

/**
 *
 * @author Vedant Shah
 */
public class Recursion5 {

    public static int digitSum(int num){
        if(num == 1 || num == 0)
            return num;
        
        return (num % 10 + digitSum(num / 10));
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to DigitSum!");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Please enter a positive integer to determine the sum of the integers you entered: ");
        int val = sc1.nextInt();
        System.out.println("The sum of the integer you entered is: " + digitSum(val) + ".");
    }
    
}
