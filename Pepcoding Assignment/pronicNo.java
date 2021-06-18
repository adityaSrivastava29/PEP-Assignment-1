import java.util.*;
public class pronicNo {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
     
      if(Math.sqrt(n)*Math.sqrt(n)==n)
      {
        System.out.println(n + " is a pronic no");
      }
        // for(int i=0;i<=n;i++)
        // {
        //     System.out.println(i*(i+1) + " is a pronic no");
        // }
    }
}
