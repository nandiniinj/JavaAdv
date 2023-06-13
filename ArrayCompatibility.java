/*
 Two arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or equal to 
 the ith element in the second array for all i elements.If the array size is zero or lesser then display the message "Invalid array size".
 Write a Java program to find whether 2 arrays are compatible or not.If the arrays are compatible display the message as 
 "Arrays are Compatible" ,if not then display the message as "Arrays are Not Compatible".
 */
package javafirst;
import java.util.*;
public class ArrayCompatibility {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of elements of 1st array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        
        System.out.println("Enter the elements: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the no. of elements of 2nd array: ");
        int m= sc.nextInt();
        int[] array= new int[m];
        
        System.out.println("Enter the elements: ");
        for (int i=0; i<m; i++){
            array[i]=sc.nextInt();
        }
        
        if(n!=m){
            System.out.println("Invalid");
        }
        else{
            boolean flag = false;
            for (int i=0; i<n; i++){
                if(arr[i]>=array[i]){
                    flag=true;
                }
                else{
                    flag=false;
                }
            }
            if(flag==true){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
        
    }
    
}
