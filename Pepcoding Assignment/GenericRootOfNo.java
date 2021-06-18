import java.io.*;
import java.util.*;
public class GenericRootOfNo {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int temp = n;
        int sum=0;

        while(temp>0)
        {
            long d = temp%10;
            sum+=d;
            temp=temp/10;
            
            if(temp==0 && sum>=10)
            {   temp=sum;
                sum=0;     
            }
        }
      System.out.println(sum);
    }
}
