/*
 * trendy number , 3 digit no, middle no should be divisible 3
 */
package javafirst;
import java.util.*;

public class TrendyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
//              this is another method
// 		String s=String.valueOf(n);;
// 		if(s.length()==3){
// 		    char c= s.charAt(1);
// 		    int m=Character.getNumericValue(c);  
// 		    if(m%3==0){
// 		        System.out.println("Trendy Number");
// 		    }
// 		    else{
// 		        System.out.println("Not trendy number");
// 		    }
// 		}
        if(n>99 && n<1000){
            n=n/10;
            n=n%10;
            if(n%3==0){
                System.out.println("Trendy Number");
            }
            else{
                System.out.println("Not trendy number");
            }
        }
		
		else{
		    System.out.println("Not trendy number");
		}
    }
    
}
