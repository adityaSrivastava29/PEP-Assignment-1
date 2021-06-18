import java.util.*;
public class NCRCalculate {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter two number n & r : ");
        int n = scn.nextInt();
        int r = scn.nextInt();
     System.out.println(n+"C"+r +" = "+nCr(n,r));
    }
    static int nCr(int n, int r)
    {
      int ans = 1;
      if(r>n)
       return 0;
       
      if (r > n - r)
        r = n - r;
        
      for (int i = 0; i < r; ++i) {
        ans *= (n - i);
        ans /= (i + 1);
      }
 
      return ans;
    }
}
