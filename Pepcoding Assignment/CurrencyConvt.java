import java.util.*;
public class CurrencyConvt{

    public static void main(String[] args)
	{   Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scn.nextInt();

		System.out.println(convert(n));
		
	}

	private static final String EMPTY = "";

	private static final String[] X =
	{
		EMPTY, "One ", "Two ", "Three ", "Four ", "Five ", "Six ",
		"Seven ", "Eight ", "Nine ", "Ten ", "Eleven ","Twelve ",
		"Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ",
		"Seventeen ", "Eighteen ", "Nineteen "
	};

	private static final String[] Y =
	{
		EMPTY, EMPTY, "Twenty ", "Thirty ", "Forty ", "Fifty ",
		"Sixty ", "Seventy ", "Eighty ", "Ninety "
	};

	
	private static String convertToDigit(int n, String suffix)
	{
		
		if (n == 0) {
			return EMPTY;
		}
		if (n > 19) {
			return Y[n / 10] + X[n % 10] + suffix;
		}
		else {
			return X[n] + suffix;
		}
	}


	public static String convert(int n)
	{
		
		StringBuilder res = new StringBuilder();
		res.append(convertToDigit((n / 1000000000) % 100, "Billion, "));
		res.append(convertToDigit((n / 10000000) % 100, "Crore, "));

		res.append(convertToDigit(((n / 100000) % 100), "Lakh, "));

		res.append(convertToDigit(((n / 1000) % 100), "Thousand "));

		res.append(convertToDigit(((n / 100) % 10), "Hundred "));

		if ((n > 100) && (n % 100 != 0)) {
			res.append("and ");
		}
		res.append(convertToDigit((n % 100), ""));

		return res.toString();
	}
}  

