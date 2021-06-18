import java.io.*;
import java.util.*;
public class Factorial {
    
    public static void main(String[] args)
    {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int n = scn.nextInt();
        System.out.print("Factorial of "+n+": ");
        System.out.println(fact(n));
    }
    public static int fact(int n)
    {
        if(n==0 || n==1)
         return 1;
         
        return fact(n-1)*n;
    }
}

