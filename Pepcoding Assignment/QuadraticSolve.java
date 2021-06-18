import java.util.*;
public class QuadraticSolve {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter three Coefficient and a value : ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int value = scn.nextInt();

        int ans = a*value*value+b*value+c;

        System.out.println("Sloution of Quadratic Equation = "+ans);

    }
}
