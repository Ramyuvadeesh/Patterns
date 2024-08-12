// Java Program to print
// Rhombus Arrow pattern
import java.util.*;

public class pattern4 {
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to print spaces
            for (j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (j = 1; j <= n; j++) {
                System.out.print("*");
            }
            // printing new line for each row
            System.out.println();
        }
         for (i = 1; i <= n-1; i++) {
            // inner loop to print spaces
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // inner loop to print stars
            for (j = 1; j <= n; j++) {
                System.out.print("*");
            }
            // printing new line for each row
            System.out.println();
        }
    }
    

    // Driver Function
    public static void main(String args[])
    {
        int n = 17;
        printPattern(n);
    }
}
