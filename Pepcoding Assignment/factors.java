import java.util.*;
public class factors {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int n = scn.nextInt();
        System.out.print("Enter the number "+n+" are : ");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            System.out.print(i+" ");
        }
    }
}
