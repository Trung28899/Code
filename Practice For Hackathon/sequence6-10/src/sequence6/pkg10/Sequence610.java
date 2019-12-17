package sequence6.pkg10;
import java.util.*; 

public class Sequence610 {

    public static void questSixandSeven()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Enter The Price: $");
        double price = input.nextDouble(); 
        System.out.print("Please Enter The Discount: %");
        double discount = input.nextDouble(); 
        
        if(discount<0 || discount>100)
        {
            System.out.println("Invalid discount(must be from 1-99%)");
            System.out.print("Please reEnter Discount: %");
            discount = input.nextDouble(); 
        }
        
        double before = price - ((price*discount)/100);
        
        System.out.println("Original Price: "+price);
        System.out.println("Discount %"+discount);
        System.out.println("Price before tax: $"+before);
        System.out.println("Tax is: 15%");
        double after = before + ((before*15)/100); 
        System.out.println("Price after tax: $"+after);
    }
    
    public static void questNine()
    {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Please Enter Your Name: ");
        String name = input.nextLine(); 
        System.out.print("Previous Meter Reading: kWh");
        double previous = input.nextDouble(); 
        System.out.print("Current Meter Reading: kWh");
        double current = input.nextDouble(); 
        
        double difference = current - previous; 
        double price = 25+difference*0.2; 
        
        System.out.println("\n");
        System.out.println("Your Name: "+name);
        System.out.println("Previous Meter Reading: "+previous+"kWh");
        System.out.println("Current Meter Reading: "+current+"kWh");
        System.out.println("Amount of payment: $"+price);
    }
    
    public static void questTen()
    {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Please Enter Your Name: ");
        String name = input.nextLine(); 
        System.out.print("Previous Meter Reading: kWh");
        double previous = input.nextDouble(); 
        System.out.print("Current Meter Reading: kWh");
        double current = input.nextDouble(); 
        System.out.print("Fixed Charge is: $");
        double Charge = input.nextDouble();
        System.out.print("Rate Per Unit in cents: ");
        double Rate = input.nextDouble();
        
        
        double difference = current - previous; 
        double price = Charge+(difference*Rate/100); 
        
        System.out.println("\n");
        System.out.println("Your Name: "+name);
        System.out.println("Previous Meter Reading: "+previous+"kWh");
        System.out.println("Current Meter Reading: "+current+"kWh");
        System.out.println("Fixed Charge: $"+Charge);
        System.out.println("Rate per unit: "+Rate+" Cents");
        System.out.println("Amount of payment: $"+price);
    }
    
    public static void main(String[] args) {
        //questSixandSeven(); 
        //questNine(); 
        questTen();
    }
    
}
