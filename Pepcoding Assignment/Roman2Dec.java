import java.util.*;
public class Roman2Dec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Roman No in Uppercase : ");
        String str = scn.nextLine();
        int dec = toDecimal(str);
        System.out.println(str + " converts to " + dec);
        }
    public static int toDecimal(String str) {
	    int len = str.length();
	    str = str + " ";
	    int result = 0;
	    for (int i = 0; i < len; i++) {
	    char ch = str.charAt(i);
	   
	    char nextChar = str.charAt(i + 1);

	  
	    if (ch == 'M') {
		result += 1000;
	   
	    } else if (ch == 'C') {
		if (nextChar == 'M') {
		    result += 900;
		   
		    i++;
		} else if (nextChar == 'D') {
		    result += 400;
		   
		    i++;
		} else {
		    result += 100;
		}
	    
	    } else if (ch == 'D') {
		result += 500;
	   
	    } else if (ch == 'X') {
		if (nextChar == 'C') {
		    result += 90;
		    
		    i++;
		} else if (nextChar == 'L') {
		    result += 40;
		    
		    i++;
		} else {
		    result += 10;
		}
	   
	    } else if (ch == 'L') {
		result += 50;
	 	
	    } else if (ch == 'V') {
		result += 5;
         
	    } else if (ch == 'I') {
		if (nextChar == 'X') {
		    result += 9;
		    
		    i++;
		} else if (nextChar == 'V') {
		    result += 4;
		   
		    i++;
		} else {
		    result += 1;
		}	    
	    }
	}
	return result;
    }

    
}