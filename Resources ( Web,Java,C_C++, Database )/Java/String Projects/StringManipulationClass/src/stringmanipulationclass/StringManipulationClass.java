
package stringmanipulationclass;
import java.util.*; 

public class StringManipulationClass {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        StringMani change = new StringMani();
        
        System.out.println("Please promt a string: ");
        String string = input.nextLine(); 
        
        System.out.println("\nThe reversed character string is: ");
        System.out.println(change.reverseChar(string));
        
        System.out.println("The reversed substring is: ");
        System.out.println(change.reverseString(string));
        
        System.out.println("The rolled character string is: ");
        System.out.println(change.Roll(string));
    }
    
}
