
package main;

import java.util.Set;

// CREATING A FAN CLASS
class Fan{
// DECLARING AND INITIALIZING DATA FIELDS:
private String name; 

// Declaring and initializing constant for speed
final static int SLOW = 1;
final static int MEDIUM = 2;
final static int FAST = 3;

private int speed = SLOW;
private boolean on = false;
private double radius = 5;
private String color = "blue"; 

// CREATING CONSTRUCTOR:
public Fan(String name)
{this.name = name;}

// CREATING ACCESSORS AND MUTATORS:
// Mutator and accessor for speed
public int getSpeed()
{return speed;}
public void setSpeed(int newSpeed)
{speed = newSpeed;}
// mutator and accessor for On
public boolean getOn()
{return on;}
public void setOn(boolean newOn)
{on = newOn;} 
//mutator and accessor for radius
public double getRadius()
{return radius;}
public void setRadius(double newRad)
{radius = newRad;}
// Mutator and accessor for color
public String getColor()
{return color; }
public void setColor(String newColour)
{color = newColour; }

// CREATING OTHER METHODS: 
@Override public String toString()
{
    String fan; 
if(on == true)
    {
        fan = "is on, the speed is " + speed + " ,the color is " + color 
                + ", the radius is " + radius ;
    return fan; 
    }
else
    {
        fan = "is off ,the color is " + color + ", the radius is " + radius ;
     return fan;
    }
}

}
public class Assignment4 {
    public static void main(String[] args) {
    System.out.println("Name:\t Quang Trung Trinh\nStudent id:\tn01237291");
// Create a Fan object: fan1
    Fan fan1 = new Fan("Fan 1");
    fan1.setSpeed(Fan.FAST); 
    fan1.setOn(true);
    fan1.setRadius(10);
    fan1.setColor("yellow");
// print out the fan 1 object   
        System.out.println("Fan 1: " + fan1.toString());
// Create a Fan object: fan2      
    Fan fan2 = new Fan("Fan 2"); 
    fan2.setOn(false);
// print out the fan 2 object
        System.out.println("Fan 2: " + fan2.toString());
    }
    
}

