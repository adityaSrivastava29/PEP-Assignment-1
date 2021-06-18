import java.util.*;
public class spyNo {
 
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        if(Sum(n)==Product(n))
        {
            System.out.println(n+" is a spy no");
        }
    }
    public static long Sum(long n)
    {
        long temp = n;
        long sum=0;

        while(temp>0)
        {
            long d = temp%10;
            sum+=d;
            temp=temp/10;
        }

        return sum;
    }
    public static long Product(long n)
    {
        long temp = n;
        long prod=1;

        while(temp>0)
        {
            long d = temp%10;
            prod*=d;
            temp=temp/10;
        }

        return prod;
    }
}

