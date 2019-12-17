package sequencelogic1.pkg5;

import java.util.*; 

public class SequenceLogic15 {

    public static void questOne() 
    {
        Scanner input = new Scanner(System.in); 
        System.out.print("Please print a number: ");
        
        double numberOne = input.nextDouble(); 
        double numberTwo = Math.pow(numberOne, 2); 
        System.out.println("The number Entered is: "+numberOne);
        System.out.println("The square root number is: "+numberTwo);
    }
    
    public static void questTwo()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Enter number 1: ");
        double numOne = input.nextDouble(); 
        System.out.print("Please Enter number 2: ");
        double numTwo = input.nextDouble(); 
        System.out.print("Please Enter number 3: ");
        double numThree = input.nextDouble(); 
        
        double average = ((numOne+numTwo+numThree)/3) ;
        System.out.print("The average is: "+average);
    }
    
    public static void questThree()
    {
        Scanner input = new Scanner(System.in); 
        System.out.print("\nPlease Enter the amount of CAN dollars: $CAD ");
        
        double canDollars = input.nextDouble(); 
        double usDollars = (canDollars/1.32) ;
        
        System.out.println("Convert to US: $ "+usDollars);
    }
    
    public static void questFour()
    {
        Scanner input = new Scanner(System.in); 
        System.out.print("Please Enter your weight in kg: ");
        double kilogram = input.nextDouble(); 
        double pound = kilogram*2.2; 
        
        System.out.println("Convert to pound: "+pound);
    
    }
    
    public static void questFive()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length in centimeters: ");
        double cen = input.nextDouble(); 
        double inch = cen/2.54; 
        System.out.println("Convert to inch: "+inch);
    }
    
    public static void main(String[] args) {
        //questOne();
        //questTwo(); 
        //questThree(); 
        //questFour();
        questFive(); 
        
        
    }
    
}
