/*
aye yo it's Trevor, What's poping
7 points problem, DMOPC '14 Contest 1 P3 - New Students
 */
package average;
import java.util.*; 

public class Average {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int initialNumber = input.nextInt(); 
        double[] initialMarks = new double[initialNumber];
        int counter; 
        double total=0; 
        
        for(counter=0; counter<initialNumber; counter++)
        {
            initialMarks[counter] = input.nextDouble(); 
            total += initialMarks[counter]; 
        }
        
        int newNumber = input.nextInt(); 
        int totalStudents = initialNumber+newNumber; 
        double[] average = new double[newNumber]; 
        int count = 0; 
        
        double[] updatedMarks = new double[totalStudents]; 
        
        for(counter=0; counter<totalStudents; counter++)
        {
            if(counter < initialNumber)
            {updatedMarks[counter] = initialMarks[counter];}
            else
            {
                updatedMarks[counter] = input.nextDouble();
                if(updatedMarks[counter]>1000 || updatedMarks[counter]<0)
                {System.out.println("Marks must not be >1000 or lower than 0");}
                total += updatedMarks[counter];
                average[count] = total/(counter+1) ;  
                count++; 
            }
        }
        
        if(newNumber > 1000 || initialNumber < 1)
        {
            System.out.println("(1≤I,S≤1000)");
            System.exit(0);
        }
        
        for(counter=0; counter<newNumber; counter++)
        {
            System.out.println(average[counter]);
        }
    }
    
}
