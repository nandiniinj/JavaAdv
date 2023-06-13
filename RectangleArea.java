
package javafirst;
import java.util.*;

public class RectangleArea {

    public static void main(String[] args) {
        // TODO code application logic here
        
        double l,b,p,a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length: ");
        l=sc.nextDouble();
        System.out.println("Enter the breadth: ");
        b=sc.nextDouble();
        p=2*(l+b);
        a=l*b;
        
        
        System.out.println("Perimeter: "+p+" units");
		System.out.println("Area: "+a+" sq. units");
    }
    
}
