package main;
import java.io.PrintWriter; 
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.*; 

public class FileI_O {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Student name: Quang Trung Trinh\n\n"
                + "Student id: n01237291\n");

    // Create a new file 
    File file = new File("myFile.txt"); 
    
    // if else statement to operate only when the file is not exist
    if(file.exists())
        {
            System.out.println("File already exists");
            System.exit(1); 
        }
    else{
    // Create a new object to add contents
        PrintWriter output = new PrintWriter(file);
    
    // Genrate random numbers and add it to the file
        System.out.println("Unsorted numbers: ");
    
        for(int i=0; i<20; i++)
    {
        double rand = Math.random()*20 ; 
        output.print((int)rand + " "); 
        System.out.print((int)rand + " ");
    }
        System.out.println(" ");
    
    // Close the file
    output.close();
        
        }
   
    // New Scanner obj to read the content of the file
    Scanner input = new Scanner(file); 
   
    // array to store the numbers in the file
    int[] array = new int[20]; 
    
    for(int n=0; n<20; n++){
    // Store the number in the file to array and print it
        array[n] = input.nextInt(); 
    }
    
    // sort array numbers
    Arrays.sort(array); 
    
    // print out the sorted array
        System.out.println("Sorted numbers: ");
    for(int n=0; n<20; n++)
    {
        System.out.print(array[n] + " ");
    }
        
    System.out.println("");
 }
    
}
