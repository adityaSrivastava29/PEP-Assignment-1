import java.util.*;
public class SwapTwoArray {

    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int [] arr1 = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i] = scn.nextInt();
        }
       int [] arr2 = new int[n];

        for(int i=0;i<n;i++)
        {
            arr2[i] = scn.nextInt();
        }
        System.out.println("arr1 and arr2 before Swapping");
        System.out.print("arr1[] = ");
           for(int i=0;i<n;i++)
           {
             System.out.print(arr1[i]+" ");
           }
           System.out.println();
           System.out.print("arr2[] = ");
           for(int i=0;i<n;i++)
           {
               System.out.print(arr2[i]+" ");
           }
           System.out.println();
        for(int i=0;i<n;i++)
        {
            int temp= arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp;
        }
     System.out.println("arr1 and arr2 after Swapping");
     System.out.print("arr1[] = ");
        for(int i=0;i<n;i++)
        {
          System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("arr2[] = ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr2[i]+" ");
        }

        System.out.println();
    }
    
}
