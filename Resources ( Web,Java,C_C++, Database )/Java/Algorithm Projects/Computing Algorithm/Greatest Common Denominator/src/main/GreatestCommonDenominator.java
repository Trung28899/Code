//PROGRAM TO FIND GREATEST COMMON DOMINATOR (IN PROGRESS)
package main;
import java.util.*; 
public class GreatestCommonDenominator {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.println("Please prompt in 2 numbers: ");
    int number1 = input.nextInt(); 
    int number2 = input.nextInt(); 
    
    int a = finder(breakDown(number1), breakDown(number2)); 
    System.out.println("The Greatest Common Denominator Is: " + a); 
  }

/* break down the number into the multiplication of prime numbers and store the 
result in an array. Return that array for using */
  public static int[] breakDown(int number)
{
   int[] arrayInt = new int[15]; 
   
   arrayInt[0] = dividable(2, number); 
   arrayInt[1] = dividable(3, number); 
   arrayInt[2] = dividable(5, number); 
   arrayInt[3] = dividable(7, number); 
   arrayInt[4] = dividable(11, number);
   arrayInt[5] = dividable(13, number);
   arrayInt[6] = dividable(17, number);
   arrayInt[7] = dividable(19, number);
   arrayInt[8] = dividable(23, number);
   arrayInt[9] = dividable(29, number);
   arrayInt[10] = dividable(31, number);
   arrayInt[11] = dividable(37, number);
   arrayInt[12] = dividable(41, number);
   arrayInt[13] = dividable(43, number);
   arrayInt[14] = dividable(47, number);
    System.out.println("");
return arrayInt;
}
  
  /* function to determine if a number is dividable by a number and what is the
  maximum power of the divider that the number can divide
  */
  public static int dividable(int divider, int number)
  {
      int counter1 = 0; 
      int dividable =0; 
      int nu = number; 
    
//check if the number dividable for divider
        while(counter1 == 0)
      {
        
            if(number%divider == 0)
        {
            dividable++;
            number = number/divider; 
        }else
            {counter1 = 1;}
      }
      
     if(dividable > 0)
     {System.out.printf("The number %d can be divided by %d ^ %d \n", nu, divider, dividable);}
  return dividable;
  } 

  /* find the greatest denominator by:
  - comparing 2 arrays
  - if both elements in 2 arrays > 0, take the lowest
  - multiply it with the right number to get the greatest denominator
  */
  public static int finder(int[] A, int[] B)
  {
  int count; 
  int[] store = new int[15]; 
  int track=0; 
   // compare 2 arrays, if both elments > 0, take the lowest 
    for(count=0; count<A.length; count++)
    {
        if(A[count]>0 && B[count]>0)
        {
            if(A[count]>B[count])
            {
            store[track++] = B[count]; 
            } else
                {
                store[track++] = A[count]; 
                }
        } else {store[track++] = 0;} // sync the indexes for multiplication   
    }
    // Get the denominator
    int denominator = 1; 
    int[] multiplier = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47}; 
    int countt; 
    
    for(count =0; count<store.length; count++)
        {
            if(store[count] > 0)
                {
                    int result = 1;
                    int count2; 
                        for(count2=0; count2<store[count]; count2++)
                            {
                                result *= multiplier[count];
                            }
                        
                    denominator *= result; 
                }   
        }
    
    return denominator; 
  }
}
