import java.io.*;
import java.util.*;
public class Decimal2Binary {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(DecToBin(n));
          
    }

    public static int DecToBin(int n)
    {
        int temp = n;
        int binres=0;
        int p=0;
        while(temp>0)
        {
            int d= temp%2;
            binres+=(d*(int)Math.pow(10,p));
            temp/=2;
            p++;
        }
         return binres;
    }
    
    

}
