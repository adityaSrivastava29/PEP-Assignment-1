import java.io.*;
import java.util.*;
public class Largestnum {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
             max=arr[i];
        }
        System.out.println(max);
    }
    
}
