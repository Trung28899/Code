
package movie;

public class Moviee {
    public String name;
    public int year; 
    public char rating;
    
    public Moviee()
    {
    name = "Undeclarred movie";
    year = 0;
    rating = 'N'; 
    }
    
    public Moviee(String name, int year, char rating)
    {
    this.name = name;
    if(year > 1800 && year <2019)
        this.year = year;
    else{System.out.println("invalid year");}
    this.rating = rating; 
    }
    
    public String getName()
    {return name; }
    public int getYear()
    {return year; }
    public char getRating()
    {return rating;}
}
