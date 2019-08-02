package javaapplication15.grade12;
import java.util.*;
/**
 *
 * @author Vedant Shah
 */
public class Recursion6 {

    public static String printTriangle(int n){
        if(n < 1)
            return "You cannot have negative triangles.";
        else{
            String triangle = printTriangle(n - 1);
            triangle = triangle + "*";
            System.out.println(triangle);
            return triangle;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Triangle Printer!");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc1.nextInt();
        printTriangle(num);
    }
    
}
