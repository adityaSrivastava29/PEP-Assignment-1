import java.io.*;
import java.util.*;
public class SumOfDigits {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        System.out.println(Sum(n));
    }

    public static long Sum(long n)
    {
        long temp = n;
        long sum=0;

        while(temp>0)
        {
            long d = temp%10;
            sum+=d;
            temp=temp/10;
        }

        return sum;
    }
}
