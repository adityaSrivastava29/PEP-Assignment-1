import java.io.*;
import java.util.*;
public class DigitIntoWord {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> WordArray = new ArrayList<String>(
            Arrays.asList("zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"));
        int temp = Reverse(n);
        String res="";
        while(temp>0)
        {
            int d = temp%10;
            res+= WordArray.get(d)+",";
            temp=temp/10;
        }
        System.out.println(res);
    }
    public static int Reverse(int n)
    {
        int temp = n;
        int rev=0;
        while(temp>0)
        {
            int d = temp%10;
            rev=rev*10+d;
            temp=temp/10;
        }
        return rev;
    }
       
}
