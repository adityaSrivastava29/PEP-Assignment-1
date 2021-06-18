import java.io.*;
import java.util.*;
public class SwapTwoNo {
 
    static int n1=5,n2=4;
    void swap()
    {
    n1=n1+n2;
    n2=n1-n2;
    n1=n1-n2;
    }

    public static void main(String[] args)
    {
        

        System.out.println("Before swapping " + n1 + " "+n2);
 
        SwapTwoNo instance = new SwapTwoNo();
        instance.swap();
        
        System.out.println("After swapping " + n1 + " "+n2);

    }

}
