// Reverse String: 
/* Method 1: 
- take the string from a prompted string into
another string from the bottom to the top. This method require 2
String object
Method 2 : 
- Reverse the string within the object
Method 3: 
- Use reverse method
*/
package stringreverse;

import java.util.*;

public class StringReverse {

// Method 1: take a prompted string into another string
    // from bottom to the top
    static String reverseChar(String a)
{
int i; 
String b =""; 

for(i=a.length()-1; i>=0; i--)
{
    b = b + a.charAt(i);  
}

return b; 
}
    //Method 2: Reverse using 1 string    
    static StringBuilder reverseChar1(StringBuilder a)
{
int i, n=0; 
int count = (int)(a.length()/2); 

//loop runs only half of the string
for(i=a.length() - 1; i>=count; i--)
{
    //swapping characters
    char c = a.charAt(n); 
    a.setCharAt(n, a.charAt(i)); 
    a.setCharAt(i, c);
   n++; 
}

return a; 
}

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        System.out.println("Please prompt a String: ");
        String a = input.nextLine();
        StringBuilder b = new StringBuilder(""); 
        b.append(a);  
        System.out.println("The reverse string (method 1) is: " + reverseChar(a));
        System.out.println("The reverse string (method 2) is: " + reverseChar1(b));
        
        //Method 3: using the reverse function
        // ??? Don't know why we have to reverse 2 times ???
        b = b.reverse().reverse();  
        System.out.println("The reverse string (method 3) is: " + b);
    }
    
}
