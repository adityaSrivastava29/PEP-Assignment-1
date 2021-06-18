import java.io.*;
import java.util.*;
public class SplitNoIntoDigits {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();

        long temp = n;
        while(temp>0)
        {
            long d = temp%10;
            System.out.println(d);
            temp=temp/10;
        }

   
    }
}
