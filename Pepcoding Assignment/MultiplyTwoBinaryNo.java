import java.util.*;
public class MultiplyTwoBinaryNo {

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int b = 2;
    int res = getProduct(b, n1, n2);
    System.out.println("Multiplication Result = "+res);
 }

 public static int getProduct(int b, int n1, int n2){
   
    int i=0,ans=0,p=0;
    while(n1>0)
    {
      int r1=n1%10;
      int mul1 = MultiplySigleDigit(b,n2,r1);
      mul1=mul1*(int)(Math.pow(10,p));
      p++;
      ans= sumofBinary(b,i,mul1);
      n1=n1/10;
      i=ans;
       
    }
     return i;
 }
 
 public static int MultiplySigleDigit(int b,int n1,int r1)
 {
     int carry=0,ans=0,p=0;
     
     while(n1>0||carry>0)
     {
       int r2=n1%10;
       n1 /= 10;
       int sum=r1*r2+carry;
       carry=sum/b;
       sum=sum%b;
       ans=ans+sum*(int)(Math.pow(10,p));
       p++;
     }
      return ans;
     
 }
     
       
 public static int sumofBinary(int b,int n1,int n2)
 {
        int sum=0,ans=0,carry=0,i=0;
        while(n1>0||n2>0||carry>0)
         {  
             int r1=n1%10;
             int r2=n2%10;
             sum=r1+r2+carry;
             ans=ans+(int)((sum%b)*Math.pow(10,i));
             i++;
             carry=sum/b;
             n1=n1/10;
              n2=n2/10;
             
         }
         return ans;
 }
}
