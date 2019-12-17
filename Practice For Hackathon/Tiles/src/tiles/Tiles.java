// 3 points problem,  DMOPC '14 Contest 1 P2 - Tiles
package tiles;
import java.util.*; 

public class Tiles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int length = input.nextInt(); 
        int width = input.nextInt(); 
        int lengthTile = input.nextInt();  
        double lengthDivide = length/lengthTile;  
        double widthDivide = width/lengthTile;  
        int maxTile; 
        
        if((length>1000 || length < 1) || (width>1000 || width < 1) || (lengthTile>1000 || lengthTile < 1))
        {System.exit(0);}

         maxTile = (int)lengthDivide* ((int)widthDivide); 
         System.out.println(maxTile);
    }
    
}
