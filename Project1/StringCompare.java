//This program compares to strings for common root 
import java.util.Scanner;
import java.lang.Math;

public class StringCompare 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String common = null; 

        System.out.print("Enter string1 and hit \"Enter\": ");
        String string1 = input.nextLine();
        
        System.out.print("Enter string2 and hit \"Enter\": ");
        String string2 = input.nextLine();
        
        common = compareStrings(string1, string2);
        if(common == null)
        {
            System.out.println("The strings have no common prefix.");

        }
        else
        {
            System.out.println("The common prefix is: " + common);
        }
    }
    
    //This method compares two given strings and returns common prefix
    public static String compareStrings(String string1, String string2)
    {
        String response = "";
        int limitor = 0;
        int prefixEnd = 0;

        if(string1.length() >= string2.length())
        {
            limitor = string2.length();
            
        }//Decides which length to use when traversing 
        else
        { 
            limitor = string1.length();
        }

        //Traverses the strings to see if consecutive chars are equal. 
        for(int i = 0; i < limitor; i++)
        {
            if(string1.charAt(i) == string2.charAt(i))
            {
                prefixEnd += 1;
            }
            else if(i <= 0)
            {
                return null;//return a blank string if none are equal
            }
            else//Exits once the prefix is not equal
            {
                break;
            }
        }

        return string1.substring(0,prefixEnd);
    }
}
