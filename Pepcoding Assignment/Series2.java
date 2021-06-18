import java.util.*;
public class Series2 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the  number : ");
        int  n = scn.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {  if(i%2!=0)
            sum+=i;
           else
           sum-=i;
        }
        System.out.println("Sum Of Series 1-2+3-4-5…… up to "+ n+" term = "+ sum);
    }
}
