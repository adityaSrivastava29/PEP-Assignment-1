import java.util.*;
public class Largestof3numusingconditional {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        int large= n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3) ;
        
        System.out.println("Largest among "+n1 +","+n2+" & "+ n3+" is "+large);
        
    }
}
