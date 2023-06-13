/*
 * Take two arrays from user and check if the sum of both the arrays are same or not.
 */
package javafirst;
import java.util.Scanner;
public class SumofArrays {

    public static void main(String[] args) {
        
        int n;
        int count=0;
        int c=0;
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
        //reading the number of elements from the that we want to enter  
        n=sc.nextInt();
        //creates an array in the memory of length 10  
        int[] array = new int[10];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
            //reading array elements from the user   
            array[i]=sc.nextInt();
            c=c+array[i];
        }  
        int[] arr= new int [10];
        System.out.println("Enter the elements of the second array: ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            count=count+arr[i];
        }
        
        if(c==count){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
    }
    
}
