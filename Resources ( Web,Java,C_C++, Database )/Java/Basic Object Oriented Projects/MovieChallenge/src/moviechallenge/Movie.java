
package moviechallenge;

public class Movie {
    private String name;
    private int year; 
    private String rating;
    
    public Movie()
    {
    name = "Undeclarred movie";
    year = 0;
    rating = "G"; 
    }
    
    public Movie(String name, int year, String rating)
    {
    this.name = name;
    if(year > 1800 && year <2019)
        this.year = year;
    else{this.year = 0;}
    this.rating = rating; 
    }
    
    public void setName(String name)
    {this.name = name;}
    public void setYear(int year)
    {this.year = year;}
    public void setRate(String rating)
    { this.rating = rating; }
    
    public String getName()
    {return name; }
    public int getYear()
    {return year; }
    public String getRating()
    {return rating;}
}

