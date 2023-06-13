/*
 * To convert character to ASCII value
 */
package javafirst;

public class ASCIIvalue {

    public static void main(String[] args) {
        // TODO code application logic here
        //character to ascii value
        char ch = 'a';
        int as_chi = ch;
        System.out.println("ASCII value of " + ch + " is: " + as_chi);
        
        //ascii value to character
        int ascii;
        System.out.println("Enter a number: ");
        ascii=sc.nextInt();
        char as_chi = (char)ascii;
        System.out.println("ASCII value of " +ascii + " is: " + as_chi);
    }
    
}
