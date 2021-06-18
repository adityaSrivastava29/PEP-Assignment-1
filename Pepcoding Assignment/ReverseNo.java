import java.io.*;
import java.util.*;
public class ReverseNo {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        System.out.println(Reverse(n));
    }

    public static long Reverse(long n)
    {
        long temp = n;
        long rev=0;

        while(temp>0)
        {
            long d = temp%10;
            rev=rev*10+d;
            temp=temp/10;
        }

        return rev;
    }
}
