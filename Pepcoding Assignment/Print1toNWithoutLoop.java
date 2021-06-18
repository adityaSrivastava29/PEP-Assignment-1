import java.io.*;
import java.util.*;
public class Print1toNWithoutLoop {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print(n);
    }
    public static void print(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
       
         
        print(n-1);

        System.out.print(n+" ");

    }
}
