import java.io.*;
import java.util.*;
public class CountDigits {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        System.out.println((int)Math.floor(Math.log10(n)+1));
    }

    public static int Countdigit(long n)
    {
        long temp = n;
        int count=0;

        while(temp>0)
        {
            long d = temp%10;
            count++;
            temp=temp/10;
        }
        return count;
    }
}
