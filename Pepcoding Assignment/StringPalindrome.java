import java.io.*;
import java.util.*;
public class StringPalindrome {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
        HashSet<Integer> hs = new HashSet<>();
         int[]  arr = new int[n];
 
     HashMap<Integer,Integer> hm = new HashMap<>();
    
  
          

 long sum=0;

	   for(int i=0;i<n;i++)
       {  
           
         int  val = scn.nextInt();
         sum+=val;
          arr[i]=val;
          hs.add(val);
          if(hm.containsKey(val))
          {
              hm.put(val,hm.get(val)+1);
              
          }
          else
          hm.put(val,1);
         
       }

        
       if(hm.size()==n)
       System.out.println(n);
    //   Arrays.sort(arr);
       int count=0;
      for(int key : hm.keySet())
     {
        int value = hm.get(key);

        if(value >1)
        {
            if(hm.containsKey(key+1) ==false) 
            {   hm.put(key+1,1
                );
                count++;
            }
           if(hm.containsKey(key-1)==true)
        }  
     }

    
     System.out.println(count+hm.size());

       
        
    }

    public static boolean CheckPalindrome(String str)
    {
       int i=0;
       int j=str.length()-1;

        while(i<j)
        {
            char ch1= str.charAt(i);
            char ch2=str.charAt(j);
             if(ch1!=ch2)
             return false;

             i++;
             j--;
        }
         return true;
    }
    
    public static void printAllSubstring(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                  System.out.println(str.substring(i,j));
          
            }
        }
    }
}
