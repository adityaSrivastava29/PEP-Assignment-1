import java.util.*;
public class FibSeries {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int n = scn.nextInt();
        System.out.print("Fibonacci Series of "+n+" numbers Using Recursion : ");
        for(int i = 0; i < n; i++){
            System.out.print(fibonacciRecursion(i) +" ");
        }
        System.out.println();
        System.out.print("Fibonacci Series of "+ n +" numbers Using Iteration : ");
         FibIterative(n);
    }

    public static int fibonacciRecursion(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        if(n == 1 || n == 2)
        {
            return 1;
         }
        return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }
    
        
    static void FibIterative(int n)
    {
        int num1 = 0, num2 = 1;
        int i = 0;
        while (i < n) {
  
           
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            i++;
        }
    }
    
}
