
package Mainl;
import java.util.Scanner; 

public class Roll {

    static StringBuilder Roll(StringBuilder a)
    {
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
    return a; 
    }
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    StringBuilder aa = new StringBuilder("");     
    
    System.out.println("Please prompt a String: ");
    String b = input.nextLine(); 
    aa.append(b); 

        System.out.println("The rolled string is: ");
        System.out.println(Roll(aa));
    }
    
}
