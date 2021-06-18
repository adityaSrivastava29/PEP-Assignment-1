import java.io.*;
import java.util.*;
public class Prime {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number : ");
        Long n = scn.nextLong();

        System.out.println(CheckPrimeNo(n));
        System.out.print("Prime numbers less than 100 are : ");
          printprimetoN(100);
    }
    public static void printprimetoN(int x)
    {
        for(int i=2;i<x;i++)
        {
            if(CheckPrimeNo(i)==true)
            System.out.print(i+" ");
        }
    }
    public static boolean CheckPrimeNo(long n)
    {
        long div=2;
        if(n==1)
         return false;
         
        while(div<=Math.sqrt(n))
        {
            if(n%div==0)
            {
                break;
            }

            div++;
        }
        
        if(div > Math.sqrt(n))
         return true;
        else
         return false;
    }
}
