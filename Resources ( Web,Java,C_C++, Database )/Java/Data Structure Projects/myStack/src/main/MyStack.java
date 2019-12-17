/*
not really a stack, this is in first in first out manner (fifo)
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;

public class MyStack {

    public static void main(String[] args) {
    System.out.println("Student name: Quang Trung Trinh \n"
            + "Student id: n01237291");
  
    Scanner input = new Scanner(System.in); 
    // Create a MyStack object    
    Stack string = new Stack(); 
        
// prompt the user for 5 string
        System.out.println("Please enter 5 string: ");
        
        for(int i = 0; i<5; i++)
        {
        string.add(input.nextLine());
        }

// Display 5 string
        System.out.println("\n5 Strings are: ");
        
        for(int i=0; i<5; i++)
        {
            System.out.println(string.get(string.size()-1));
            string.remove(string.size()-1); 
        }    
}
    
}
