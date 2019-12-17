package texttoutf; 
import java.util.*; 
import java.io.*; 

public class TextToUTF {

    public static void main(String[] args) throws FileNotFoundException, IOException  {
    System.out.println("Student name: Quang Trung Trinh\n\n"
                + "Student id: n01237291\n");

    // Create a text file 
    File file1 = new File("file1.txt"); 
    // if else statement to operate only when the file is not exist
    if(file1.exists())
        {
            System.out.println("File already exists");
            System.exit(1); 
        }
    else{
    // Create a new object to add contents
        PrintWriter output = new PrintWriter(file1);
        // writting content of file1
        output.println("John: 85.5;");
        output.println("Jim: 185.5;");
        output.println("George: 105.25;");
        output.close(); 
        }
    
    // Create a binary file: 
    FileOutputStream file2 = new FileOutputStream("file2.utf");
    DataOutputStream out1 = new DataOutputStream(file2);

    // Create a Scanner Object to read file1.txt
   Scanner input = new Scanner(file1); 
    
   /* Create a StringBuilder object to get the nextline of file1 temporarily*/
   StringBuilder getNextLine = new StringBuilder(""); 
    
   /* Create a StringBuilder object to store the content that is added to file2
       After storing the content of file2, we can use this object to get the size 
       of file2
    */
   StringBuilder getContent = new StringBuilder("");
    
    // adding content from file1 to file2
   while(input.hasNext())
  {
      //get the next line of file1
    getNextLine.append(input.nextLine());
     // add the nextline to getContent
    getContent.append(getNextLine.toString());
     // add content of nextline into file2
    out1.writeUTF(getNextLine.toString() );
     // Clear the getNextLine String 
    getNextLine.setLength(0);
  }
    //close file2
out1.close(); 
        
        // Get the size of file1 in bytes
        System.out.println("The size of text file is: " + file1.length() + " bytes");
        
        // Get the size of file2 in bytes in UTF-8
        final byte[] utf8Bytes = getContent.toString().getBytes("UTF-8");
        System.out.println("The size of binary file: " + utf8Bytes.length +" bytes");
    }
    
}

