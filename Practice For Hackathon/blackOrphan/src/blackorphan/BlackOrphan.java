
package blackorphan;
import java.util.*; 

public class BlackOrphan {
    public static String translateAT_1(String dna1)
    {
        String binaryString = ""; 
        int counter; 
        
        for(counter=0; counter<dna1.length(); counter++)
        {
            if((dna1.charAt(counter)=='A') || (dna1.charAt(counter)=='T'))
		{
			binaryString+='1';
		} else
		{
			binaryString+='0';
		}
        }
        return binaryString; 
    }
    
    public static String translateAT_0(String dna1)
    {
        String binaryString = ""; 
        int counter; 
        
        for(counter=0; counter<dna1.length(); counter++)
        {
            if((dna1.charAt(counter)=='G') || (dna1.charAt(counter)=='C'))
		{
			binaryString+='1';
		} else
		{
			binaryString+='0';
		}
        }
        return binaryString; 
    }
    
    public static int binaryToDecimal(String binaryString)
    {
        int counter=0;
        int count;
        int binary=0; 
        
        for(count=(binaryString.length()-1); count>=0 ;count--)
        {
            if(binaryString.charAt(count)=='1')
            {
                binary += Math.pow(2, counter); 
            }
            counter++; 
        }
        return binary; 
    }
    
    public static String getCharacter(String binaryString)
{
    int counter;
    int count;
    String charArray="";
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 

    int length = binaryString.length();
    int control = (int)(length/8);

    for(counter=0; counter < control; counter++)
    {
        String tempArray="";
        // copying 8 bits to temporary array
        for(count=0; count<8; count++)
        {
            int size = counter*8 + count;
            if(size<length)
            {
                tempArray += binaryString.charAt(size);
            } 
        }

        // if the tempory string size is less than 8, break the loop, return characters
        if(tempArray.length()==8)
            {
                int decimal = binaryToDecimal(tempArray); // Translating binary to decimal
                if((decimal>64) && (decimal<91))
                {
                    charArray+=alphabet.charAt(decimal-65); 
                } else if(decimal==32)
                {
                    charArray+=" ";
                }
            } else
            {
                break;
            }
    }

    return charArray;
}
    
    public static String checkCases(String binaryString)
{
    String characterString="";
    int length = binaryString.length();
    int numberOfBits;
    int numberOfChars;
    int counter;

    for(counter=0; counter<length; counter++)
    {
        String subBinaryString="";
        numberOfChars = (int)((length-counter)/8) ;
        numberOfBits = numberOfChars*8;

        subBinaryString+=binaryString.substring(counter, counter+numberOfBits); 
        characterString+=getCharacter(subBinaryString);
        
        if(characterString.length()!=numberOfChars)
        {
            characterString="";
            continue; 
        } else {break;}
        
    }
return characterString;
}
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter; 
        String[] test= new String[2]; 
        String[] charArray = new String[2]; 
        
        for(counter=0; counter<10; counter++)
        {
            String dna1 = input.nextLine(); 
            String dna2 = input.nextLine(); 
            
            test[0] = translateAT_0(dna1); 
            charArray[0] = checkCases(test[0]); 
            test[1] = translateAT_1(dna1); 
            charArray[1] = checkCases(test[1]);
            
            if(charArray[0].length()>charArray[1].length())
            {
                System.out.println(charArray[0]);
            } else 
            {
                System.out.println(charArray[1]);
            }
           
        }
        
    }
    
}
