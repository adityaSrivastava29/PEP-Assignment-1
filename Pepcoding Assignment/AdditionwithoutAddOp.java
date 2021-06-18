import java.io.*;
import java.util.*;
public class AdditionwithoutAddOp {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int res;
       if(n1>=0 && n2>=0)
       { for(int i=1;i<=n2;i++)
        {
            n1++;
        }
         res=n1;
       }
       else if(n1<=0 && n2<=0)
       { for(int i=1;i<= Math.abs(n2);i++)
        {
            n1--;
        }
         res=n1;
       }
       else
       { int neg,pos;
          if(n1<0)
          {   neg=n1;
              pos=n2;
          }
          else
          { neg=n2;
            pos=n1;
          }
          
          for(int i=1;i<=Math.abs(neg);i++)
          {
              pos--;
          }
          res=pos;
       }
        System.out.println(res);
    }
}
