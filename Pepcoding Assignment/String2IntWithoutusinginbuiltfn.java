import java.util.*;
public class String2IntWithoutusinginbuiltfn {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int num = 0;

	
	   for(int i = 0; i < str.length(); i++)
       {
        num = num * 10 + (str.charAt(i) - '0');
       }
		

	
	System.out.print("String Converted into Int is " + num);

        
    }
}
