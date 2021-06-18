import java.util.*;

public class ArmstrongNo {
    
public static void main(String[] args)
{
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the number : ");
    long n = scn.nextLong();
   System.out.println(CheckArmstrongNo(n));
}

public static boolean CheckArmstrongNo(long n)
{   long temp=n;
    long sum=0;
   
    int noOfDigits = (int)Math.floor(Math.log10(n)+1);
    while(temp>0)
    {
        int d = (int)(temp%10);
        sum+= Math.pow(d,noOfDigits);
        temp=temp/10;
    }
    if(sum==n)
     return true;

    return false;
  
}

}
