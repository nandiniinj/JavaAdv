/*
 * Take year and month as input from the user and print the no. of days in that month and year
 */
package javafirst;
import java.util.Scanner;
public class YearMonth {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        int y= sc.nextInt();
        int m=sc.nextInt();
        
        if(y%4==0 && y%100==0 && y%400==0){
            
            if(m>=1 && m<=7){
                 
                if(m%2==0){
                    if(m==2){
                        System.out.println("No. of days in this month are 29");
                    }
                    else{
                        System.out.println("30");
                    }
                }
                else{
                    System.out.println("31");
                }
            } 
            else if(m>=8 && m<=12){
                if(m%2==0){
                    System.out.println("31");
                }
                else{
                    System.out.println("30");
                }
        }
       
        
    
        }
        else{
            if(m>=1 && m<=7){

                if(m%2==0){
                    if(m==2){
                        System.out.println("No. of days in this month are 28");
                    }
                    else{
                        System.out.println("30");
                    }
                }
                else{
                    System.out.println("31");
                }
            } 
            else if(m>=8 && m<=12){
                if(m%2==0){
                    System.out.println("31");
                }
                else{
                    System.out.println("30");
                }
            }


        }
    }
}
