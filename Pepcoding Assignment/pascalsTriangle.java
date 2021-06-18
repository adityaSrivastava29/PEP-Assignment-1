import java.util.*;
public class pascalsTriangle {
       
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int  rows = sc.nextInt();
        int ncr = 1 ;
        
        for(int i=0; i<rows; i++)
        {
           for(int space=1; space <= rows-i; space++)
             System.out.print(" ") ;

           for(int j=0; j <= i; j++)
           {
                if (j==0 || i==0)
                 ncr = 1;
                else
                 ncr = ncr*(i-j+1)/j;

               System.out.print(ncr + " ");
           }
           System.out.println();
        }
        
   }
}
