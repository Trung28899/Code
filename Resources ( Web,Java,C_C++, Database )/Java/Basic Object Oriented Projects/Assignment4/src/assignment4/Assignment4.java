package assignment4;

// CREATING A REGULARPOLYGON CLASS
class RegularPolygon{
// DECLARING AND INITIALIZING DATA FIELDS:
private int n = 3; 
private double side = 1; 
private double x = 0;
private double y = 0;

//CREATING CONSTRUCTORS:
public RegularPolygon()
{
this.n=n;
this.side = side;
this.x = x;
this.y = y;
}

public RegularPolygon(int num, double length)
{
    this.n=num;
    this.side=length;
    this.x=x;
    this.y=y;
}

public RegularPolygon(int num, double length, double xCo, double yCo)
{
    this.n=num;
    this.side=length;
    this.x=xCo;
    this.y=yCo;
}

// CREATING ACCESSORS AND MUTATORS:
// Mutator and accessor for n
public int getN()
{return n;}
public void setN(int newN)
{n = newN;}

// mutator and accessor for side
public double getSide()
{return side;}
public void setSide(double newSide)
{side = newSide;} 

//mutator and accessor for x
public double getX()
{return x;}
public void setRadius(double newX)
{x = newX;}
// Mutator and accessor for y
public double getColor()
{return y; }
public void setColor(double newY)
{y = newY; }

// CREATING OTHER METHODS: 
//getPerimeter:
public double getPerimeter()
{
    double perimeter;
    perimeter = n*side;
    return perimeter;
}
//getArea:
public double getArea()
{
    double area; 
    area = (n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
    return area;
}


}
public class Assignment4 {
    public static void main(String[] args) {
    System.out.println("Name:\t Quang Trung Trinh\nStudent id:\tn01237291");
// Create RegularPolygon's objects by different constructors:
    RegularPolygon polygon1 = new RegularPolygon(); 
    RegularPolygon polygon2 = new RegularPolygon(6,4);
    RegularPolygon polygon3 = new RegularPolygon(10,4,5.6,7.8);
    
// Print out the result of 3 polygons:
        System.out.println("Polygon 1 perimeter: " + polygon1.getPerimeter() 
        + "\n Polygon 1 Area: " + polygon1.getArea());
        
       System.out.println("Polygon 2 perimeter: " + polygon2.getPerimeter() 
        + "\n Polygon 2 Area: " + polygon2.getArea());
       
       System.out.println("Polygon 3 perimeter: " + polygon3.getPerimeter() 
        + "\n Polygon 3 Area: " + polygon3.getArea());
    }
    
}
