import java.util.*;
public class Series1 {
   
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the  number : ");
        int  n = scn.nextInt();
        double sum=0.0;
        for(double i=1;i<=n;i++)
        {
            sum+=1/i;
        }
        System.out.println("Sum Of Series 1+1/2+1/3+1/4+…… up to "+ n+" term = "+ String.format("%,.2f",sum));
 
    }
}
