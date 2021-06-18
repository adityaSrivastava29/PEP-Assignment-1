import java.io.*;
import java.util.*;
public class FindPower {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int power = scn.nextInt();

   System.out.println(PowerCalc(base,power));
    }

    public static  int PowerCalc(int base,int power)
    {
        if(power==0)
         return 1;

        int xnminus1= PowerCalc(base,power-1);
        int res = xnminus1 * base;

        return res ;
    }
}
