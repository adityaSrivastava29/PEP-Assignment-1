import java.io.*;
import java.util.*;
public class Anybase2Anybase {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no and its base and also the base of resultant no");
        int n = scn.nextInt();
        int base = scn.nextInt();
        int resbase = scn.nextInt();
     int  dec = Anybase2Dec(n, base);
     int  resno = DecToAnybase(dec,resbase);
     System.out.println("The no "+n+" of base "+ base + " is converted into number "+ resno +" of base " + resbase);   
    }
    public static int DecToAnybase(int no,int base)
    {
        int temp = no;
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
    public static int Anybase2Dec(int no,int base)
    {
        int temp = no;
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
