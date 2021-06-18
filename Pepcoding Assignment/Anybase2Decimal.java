import java.io.*;
import java.util.*;
public class Anybase2Decimal {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no and its base");
        int n = scn.nextInt();
        int base = scn.nextInt();
        System.out.print("Decimal value of  number "+n + " of base " + base + " is ");
        System.out.println(Anybase2Dec(n,base));
          
    }

    public static int Anybase2Dec(int n,int base)
    {
        int temp = n;
        int resdec=0;
        int p=0;
        while(temp>0)
        {
            int d= temp%10;
            resdec+=(d*(int)Math.pow(base,p));
            temp/=10;
            p++;
        }
         return resdec;
    }
    
}
