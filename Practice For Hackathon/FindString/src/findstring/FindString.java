/* Bro this is Trung Trinh or Trevorrrrr */
package findstring;
import java.math.*;
import java.util.*; 

public class FindString {

    public static void solve(String bigString, String subString, int subLength)
    {
        int counter; 
        int lastIndex = subLength; 
        int can = 0;
        String sub; 
        int lim = bigString.length(); 
        
        for(counter=0; counter<lim; counter++)
        {
            sub = bigString.substring(counter,lastIndex);
            lastIndex++; 
            
            if(lastIndex>lim)
            {break;}
            
            if(subString.equals(sub))
            {
                System.out.println(counter);
                can++; 
                break; 
            }
        }
        
        if(can==0)
        {System.out.println(-1);}
 
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bigString = input.next(); 
        String subString = input.next(); 
        
       int subLength = subString.length(); 

        solve(bigString, subString, subLength); 
    }
    
}
