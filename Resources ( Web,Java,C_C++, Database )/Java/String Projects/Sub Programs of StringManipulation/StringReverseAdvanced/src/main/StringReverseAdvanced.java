/*  the first version of string reverse is actually reverse all
the characters in the string, this one revese the substrings of a string
STEP TO DO: 
- Prompt in from user a string, or use a specified string
- Get all the substring individually
- Put all the substring backward
*/
package main;

import java.util.ArrayList;
import java.util.Scanner;

public class StringReverseAdvanced {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    String string = input.nextLine(); 
    
    // add space so that the string end with a space
    // doing this make the reverse string seperated
    string += " "; 
    
    System.out.println(string);
    System.out.println(reverseString(string));
    }
    
    // put all the substring backward to get reverse substring
    public static String reverseString(String string)
    {
     // Use 1 index array to pass by reference 
    // Because variable can pass by value only
    int[] begin = {0}; 
    int[] end = {0}; 
    int count; 
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
    
    // Get all the substring individually
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
}

