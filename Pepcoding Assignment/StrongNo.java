import java.io.*;
import java.util.*;
public class StrongNo {
  
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
       long n = scn.nextLong();
       System.out.println(CheckStrongNo(n));
    }

    public static boolean CheckStrongNo(long n)
    {
        int[] factarray = new int[10];
        factarray[0]=1;
        factarray[1]=1;
        for(int i=2;i<10;i++)
        {
            factarray[i] = factarray[i-1]*i;

        }
        long temp=n;
        long sum=0;
        while(temp>0)
        {
            int d = (int)(temp%10);
            sum+=factarray[d];
            temp=temp/10;
        }

        if(sum==n)
         return true;
        
        return false;

    }
}
