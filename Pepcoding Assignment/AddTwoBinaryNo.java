import java.util.*;
public class AddTwoBinaryNo {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int bin1 = scn.nextInt();
        int bin2 = scn.nextInt();

        int res=0;
        int carry = 0,p=1;
        while(bin1>0 || bin2>0 || carry>0)
        {
            int d1 = bin1%10;
            int d2 = bin2%10;
            int sum = d1+d2+carry;
            carry =sum/2;
            sum=sum%2;
             res=res+sum*p;
             p=p*10;
             bin1/=10;
             bin2/=10;

        }
        System.out.println("Addition Result = "+ res);

    }
}
