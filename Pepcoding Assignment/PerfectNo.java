import java.io.*;
import java.util.*;

public class PerfectNo {
   
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scn.nextInt();
        boolean res = CheckPerfectNo(n);
        System.out.println(res);
    }

    public static boolean CheckPerfectNo(long n)
    {  
        
        long sum = 1;

        for (int i = 2; i <= Math.sqrt(n); i++)
       {
          if (n % i==0)
          {
            if(i != Math.sqrt(n))
                sum += i + (n / i);
            else
                sum  += i;
          }
       }
     if (sum == n && n != 1)
        return true;
     
     return false;
        
    
    }
}
