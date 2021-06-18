import java.util.*;
public class largestof3numusingbinaryminus{

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
   
        int large = Integer.MIN_VALUE;
        if((n2-n1)>0 && (n2-n3)>0)
        {
            large= n2;
        }
        else{
            if(n1-n3>0)
            large=n1;
            else
             large = n3;
        }
         
      System.out.println("Largest among "+n1 +","+n2+" & "+ n3+" is "+large);  
        
    }
}