import java.util.*;
public class GCDRecandItr {
 
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int  n1 = scn.nextInt();
        int  n2 = scn.nextInt();
         
        System.out.println("GCD of "+n1+" and "+n2 + " using Recursion is : "+GCD(n1,n2));
        System.out.println("GCD of "+n1+" and "+n2 + " using Iteration is : "+GCDItr(n1,n2));

    }

    static int GCD(int a,int b)
    {
        if(a==0)
        return b;
        else
         return GCD(b%a,a);
    }

    static int GCDItr(int a,int b)
    {

        int div=a;
        int dvd=b;
      
        while(dvd%div!=0)
       {
           int rem=dvd%div;
           dvd=div;
           div=rem;
           
       }

       return div;
    }
    
}
