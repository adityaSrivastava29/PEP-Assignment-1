import java.util.*;
public class PerformUserActionInArray {
    static int[] arr;
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the array Size  : ");
        int n= scn.nextInt();
         arr = new int[n];
        System.out.print("Enter the array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        System.out.print("Press 1 for Print the even-valued elements\nPress 2 for Print the odd-valued elements \n");
        System.out.print("Press 3 for Calculate and print the sum and average of the elements of array\n");
        System.out.print("Press 4 for Print the maximum and minimum element of array\n");
        System.out.print("Press 5 for Remove the duplicates from the array\n");
        System.out.print("Press 6 for Print the array in reverse order\n");
        System.out.print("Press 7 for re-Enter Array size  and array\n");
        System.out.print("Press 0 for Exit\n\n\n");
      

      System.out.print("Enter the value of desired Action from Menu :");
        int input = scn.nextInt();
        
        while(input!=0)
        {
          if(input==1)
          {
             EvenValuePrint(arr);
          }
          else if(input==2)
          {
             OddValuePrint(arr);
          }
          else if(input==3)
          {
           SumAndAvg(arr);
          }
          else if(input==4)
          {
            MaxandMin(arr);
          }
          else if(input==5)
          {  
             int[] a =RemoveDuplicates(arr);
             arr= new int[a.length];
             arr=a;
          }
          else if(input==6)
          {
            PrintRev(arr);
          }
          else if(input==7)
          {
            int[] b =ReEnterArray(arr);
            arr= new int[b.length];
             arr=b;
          }
          System.out.print("Enter the value of desired Action from Menu : ");
          input = scn.nextInt();
        
        }
    }
    public static void EvenValuePrint(int[] arr)
    {   
        System.out.println("Even Valued Elements are : ");
        for(int i=0;i<arr.length;i++)
        {   if(arr[i]%2==0)
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public static void OddValuePrint(int[] arr)
    {   
        System.out.println("Odd Valued Elements are : ");
        for(int i=0;i<arr.length;i++)
        {   if(arr[i]%2!=0)
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public static void MaxandMin(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int  min= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {  
            max=Math.max(max,arr[i]);
            min= Math.min(min,arr[i]);
        }
        System.out.print("min = "+min+"\n"+"max = "+max);
        System.out.println();

    }
    public static void SumAndAvg(int[]  arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i]; 
        }
        int avg=sum/arr.length;
        System.out.print("sum = "+sum+"\n"+"Average = "+avg);
        System.out.println();

    }
    public static void PrintRev(int[]  arr)
    {
        System.out.println("Array in Reverse Order");
        for(int i=arr.length-1;i>=0;i--)
          System.out.print(arr[i]+" ");

        System.out.println();
    }
    public static int[] RemoveDuplicates(int[] arr)
    {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        int[] temp =  new int[set.size()];
        Iterator<Integer> it = set.iterator();
        int idx=0;
        while(it.hasNext()) {
           temp[idx++]=it.next();
         }
         
       System.out.println("Array after Duplicate Removal : ");
       for (int value : temp) {
        System.out.print(value+" ");
       }
       System.out.println();
       return temp;
    }
    public static int[] ReEnterArray(int[] arr)
    {   Scanner scn = new Scanner(System.in);
        System.out.print("Enter the array Size  : ");
        int n = scn.nextInt();
        int[] tmp = new int[n];
        System.out.print("Enter the array : ");
        for(int i=0;i<n;i++)
        {
            tmp[i] = scn.nextInt();
        }
        return tmp;
    }
}
