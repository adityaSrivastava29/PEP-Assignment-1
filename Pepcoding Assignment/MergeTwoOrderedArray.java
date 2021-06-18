import java.util.*;
public class MergeTwoOrderedArray {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n1 =scn.nextInt();
        int[] a = new int[n1];
        for(int i=0;i<n1;i++)
        {
            a[i] = scn.nextInt();
        }

        int n2 =scn.nextInt();
        int[] b = new int[n2];
        for(int i=0;i<n2;i++)
        {
            b[i] = scn.nextInt();
        }

        int[] res = new int[a.length+b.length];

        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j< b.length)
        {
            if(a[i]<b[j])
            {  
                res[k]=a[i];
                i++;
                k++;
                
            }
           else
           {  
              res[k]=b[j];
              j++;
              k++;
           }
           
        }
        while(i< a.length)
        {
            
            res[k]=a[i];
            i++;
            k++;
            
        }
        
        while(j< b.length)
        {
            
            res[k]=b[j];
            j++;
            k++;
            
        }
        System.out.println("Merged two List : ");
        for (int re : res) {
            System.out.print(re+" ");
        }
 
    }
}

