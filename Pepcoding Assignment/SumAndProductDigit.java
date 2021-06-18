import java.io.*;
import java.util.*;
public class SumAndProductDigit {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();

        long temp = n;
        long sum=0;
        long product=1;

        while(temp>0)
        {
            long d = temp%10;
            sum+=d;
            product*=d;
            temp=temp/10;
        }

    System.out.println("Sum of Digits = " + sum + "\nProduct of Digits = "+ product);
    }
   
}
