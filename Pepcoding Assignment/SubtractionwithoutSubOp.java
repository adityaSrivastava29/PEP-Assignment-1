import java.io.*;
import java.util.*;
public class SubtractionwithoutSubOp {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int res = n1 + (~n2+1);
        System.out.println(res);
    }

}
