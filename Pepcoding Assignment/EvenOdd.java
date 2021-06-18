import java.io.*;
import java.util.*;

public class EvenOdd {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        Long n = scn.nextLong();
        if(CheckEvenOdd(n))
        {
            System.out.println(n+" is Even");
        }
        else
        System.out.println(n+" is Odd");
    }

    public static boolean CheckEvenOdd(long n)
    {
      if(n%2==0)
       return true;
      else
       return false;

    }
}
