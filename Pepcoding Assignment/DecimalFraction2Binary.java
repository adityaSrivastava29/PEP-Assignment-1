import java.util.*;
public class DecimalFraction2Binary {
    public  static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Decimal number Fraction : ");
        
        String decimal = scn.nextLine();
        String[] Strarray = decimal.split("\\.");
        String dec = Strarray [0];
        String  IntegralBinRes = String.valueOf(DecToBin(Integer.parseInt(dec)));
        String s1 = "0.";
        String d = s1.concat(Strarray[1]);
        double  DecimalPart = Double.parseDouble(d);
       
        String  DecimalBinRes="";
        

        int prec=4;
        while (prec-- > 0)
        {
            
            DecimalPart *= 2;
            int fract_bit = (int) DecimalPart ;
            if (fract_bit == 1)
            {
                DecimalPart = DecimalPart - fract_bit;
                DecimalBinRes +=1;
            }
            else
            {
                DecimalBinRes +=0;
            }
        }
       
        System.out.println("Binary Number = "+IntegralBinRes+"."+DecimalBinRes);
    }
    public static int DecToBin(int n)
    {
        int temp = n;
        int binres=0;
        int p=0;
        while(temp>0)
        {
            int d= temp%2;
            binres+=(d*(int)Math.pow(10,p));
            temp/=2;
            p++;
        }
         return binres;
    }
}
