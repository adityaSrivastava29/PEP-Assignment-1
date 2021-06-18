import java.io.*;
import java.util.*;
public class Decimal2Anybase {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Decimal no. and the base of no. which you want to convert");
        int n = scn.nextInt();
        int base = scn.nextInt();
        System.out.println("Decimal number "+n + " is converted into number " + DecToAnybase(n,base) + " of base " + base);
       
          
    }

    public static int DecToAnybase(int n,int base)
    {
        int temp = n;
        int res=0;
        int p=0;
        while(temp>0)
        {
            int d= temp%base;
            res+=(d*(int)Math.pow(10,p));
            temp/=base;
            p++;
        }
         return res;
    }
    
}
