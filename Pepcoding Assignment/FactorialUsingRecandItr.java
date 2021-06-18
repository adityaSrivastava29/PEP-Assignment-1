import java.util.*;
public class FactorialUsingRecandItr {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int n = scn.nextInt();
        System.out.print("Factorial of "+n+" Using Recursion : ");
        System.out.println(factRecursion(n));
        System.out.print("Factorial of "+n+" Using Iteration : ");
       System.out.println(factIterative(n));
    }
    public static int factRecursion(int n)
    {
        if(n==0 || n==1)
         return 1;
         
        return factRecursion(n-1)*n;
    }

    public static int factIterative(int n)
    {   
        if(n==0)
          return 1;
        
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }

        return fact;
    }
}
