import java.util.*;
public class Main{


    public static  void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        int t= scn.nextInt();
        while(t-- >0)
        {
            int n = scn.nextInt();
            int s = scn.nextInt();

            String M = scn.next();

            int count5=0;
            int count2=0;
            int count6=0;
            int count9=0;
        String num = String.valueOf(n); 
         int[] freq = new int[10];

            for(int j=0;j<M.length();j++)
            {

                char ch = M.charAt(j);
                freq[ch-'0']++;
            }
          
            for(int i=0;i<10;i++)
            {
                System.out.print(freq[i]+" ");
            }
            System.out.println();
    //   for(int i=0;i<num.length();i++)
    //        char ch = num.charAt(i);
            

    //         }
            


        }
    }
}