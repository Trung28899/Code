// Aye yo It's Trevor
// 3points problem:  DMOPC '14 Contest 7 P1 - Finding Bessarion
package station;
import java.util.*; 

public class Station {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt(); 
        //System.out.println(number);
        String[] station = new String[number]; 
        int counter; 
        int index=0; 
        
        for(counter=0; counter<number; counter++)
        {
            station[counter] = input.nextLine();
            if(station[counter].equals("Bessarion"))
            {index = counter;}
        }
        

       if(((index+1)<counter) && (index!=0)&&(number!=1))
        {
            if(((station[index-1].equals("Bayview")) || (station[index+1].equals("Bayview"))) && ((station[index-1].equals("Leslie")) || (station[index+1].equals("Leslie"))))
            {
                System.out.println("Y");
            } else
            {
                System.out.println("N");
            }
        } else
        {
            if(((index+1)==counter)&& (index!=0)&&((station[index-1].equals("Bayview")) || (station[index-1].equals("Leslie"))))
            {System.out.println("Y");}
            else
            {System.out.println("N");}
        }
        
    }
    
}
