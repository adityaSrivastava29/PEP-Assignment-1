public class PerfectNo {
   
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean res = CheckPerfectNo(n);
        System.out.println(res);
    }

    public static boolean CheckPerfectNo(int n)
    {   int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
             sum+=i;
        }
        if(sum==n)
         return true;
        else 
        return false;
    }
}
