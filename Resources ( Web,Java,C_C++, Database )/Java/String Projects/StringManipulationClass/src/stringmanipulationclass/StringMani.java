
package stringmanipulationclass;

import java.util.ArrayList;


public class StringMani{
    public StringMani(){};
    
    // Method that return a charater reversed string
    // Take a string as argument, pass the reversed character string out
    static String reverseChar(String string)
    {
    int i; 
    String b =""; 

        for(i=string.length()-1; i>=0; i--)
        {
            b = b + string.charAt(i);  
        }

return b; 
    }
    
    // take in a string and reverse substrings of that string
    public static String reverseString(String string)
    {
     // Use 1 index array to pass by reference 
    // Because variable can pass by value only
    int[] begin = {0}; 
    int[] end = {0}; 
    int count; 
    string += " "; 
    ArrayList<String> subStringList = new ArrayList<>(); 
    for(count =0; count < string.length(); )
        {
        subStringList.add(getSub(string, begin, end)); 
        count = begin[0]; 
        }
    
    String reverseString = ""; 
    for(count = (subStringList.size()-1); count >=0; count--)
        {
            reverseString += subStringList.get(count); 
        }
    return reverseString; 
    }
    
    // Get all the substring of a string, take in a begin index and an end index
    // the 2 indexes have to be a 1 element array
    // this method is created to support reverstring method
public static String getSub(String string, int[] begin, int[] end)
    {
       int n=0; 
        while(n==0)
        {
            if(string.charAt(end[0]) == ' ' || end[0] == (string.length()-1))
            {
            n=1;
            }
            // Increment the end to get the end index of the string
            end[0]++; 
        }
        // begin =< substring < end, other words, substring doesn't contain end character
        String subString = string.substring(begin[0], end[0]);
            // update the begin index of next substring
        begin[0]=end[0]; 
        return subString; 
    }
    
    // Take in a string as parameter and roll all the characters in that string
    static String Roll(String string)
    {
        StringBuilder a = new StringBuilder(string); 
        String alphabet = "abcdefghijklmnopqrstuvwxyz" ; 
        int i;  
    
    for(i=0; i<a.toString().length(); i++)
        {
            int mark =0;
        for(int n =0; n<alphabet.length(); n++)
            {
                
            if(a.toString().charAt(i)==alphabet.charAt(n) && a.toString().charAt(i)!='z'&& mark!=3)
            {a.setCharAt(i, alphabet.charAt(n+1));
            mark =3;} 
            else if(a.toString().charAt(i)=='z' && mark !=1 )
            {a.setCharAt(i, 'a');
            mark=1;}
            else if(a.toString().charAt(i)==' ' && mark != 2)
            {a.setCharAt(i, ' ');
            mark=2;} 
            
            }
        }
    return a.toString(); 
    }
}
