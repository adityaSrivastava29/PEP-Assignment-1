import java.util.*;
public class AreaandCircumference {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the radius of Circle : ");
        double  r = scn.nextDouble();
        System.out.println("Area of Circle = "+String.format("%,.4f",AreaOfCircle(r)));
        System.out.println("Circumference of Circle = "+String.format("%,.4f",CircumferenceofCircle(r)));
    }

    public  static double AreaOfCircle(double r)
    {  double area = Math.PI*r*r;
        return area;
    }

    public static double CircumferenceofCircle(double r)
    {
        double circum = 2*Math.PI*r;
        return circum;
    }

}
