import java.util.*;
public class HCF {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int  n1 = scn.nextInt();
        int  n2 = scn.nextInt();
        // System.out.println("LCM of "+n1+" and "+n2 + " is : "+n1*n2/GCD(n1,n2));
        System.out.println("GCD of "+n1+" and "+n2 + " is : "+GCD(n1,n2));

    }

    static int GCD(int a,int b)
    {
        if(a==0)
        return b;
        else
         return GCD(b%a,a);
    }
}
