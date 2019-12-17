
package moviechallenge;
import java.util.Scanner;

public class MovieChallenge {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Movie[] movie = new Movie[3];
    
    String[] name = new String[3];
    int[] year = new int[3]; 
    String[] rate = new String[3]; 
    
    System.out.println("--------Favorite movie---------");
    
    for(int n=0; n<3; n++)
    {    
        System.out.println("Name of movie "+n+": ");
        name[n]=input.next();
        System.out.println("Year Released: ");
        year[n]= input.nextInt();
        System.out.println("Rating G(general audience), PG (parental guidance), R(restricted), M(Mature)");
        rate[n] = input.next(); 
        
        movie[n] = new Movie(name[n], year[n], rate[n]);
    }
    
    for(int i=0; i<3; i++)
    {
        System.out.println("Movie "+i+":");
        System.out.println("Movie's name: "+movie[i].getName());
        if(movie[i].getYear()!=0)
        {System.out.println("Year released: "+movie[i].getYear());}
        else
        {System.out.println("Year released: Invalid year");}
        System.out.println("Rating: "+movie[i].getRating()+"\n \n");
    }
    
    
  } 
}
