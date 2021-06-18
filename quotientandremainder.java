import java.io.*;
import java.util.*;
public class quotientandremainder {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("Quotient = " + a/b +"\nRemainder = "+a%b);
    }

}
