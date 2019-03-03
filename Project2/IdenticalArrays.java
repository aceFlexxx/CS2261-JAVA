//Class: CS2261-JAVA
//Due Date: 03/04/19  
//Author: Elijah Korneffel
//Description: This script finds if two arrays are identical.

import java.util.Scanner;
import java.util.Arrays;

public class IdenticalArrays 
{
    public static void main(String[] args)
    {
        int[] list1 = new int[1];
        int[] list2 = new int[1];
        boolean equal = false;

        Scanner input = new Scanner(System.in);
        list1 = inputList(input);
        list2 = inputList(input); 
        equal = identifyLists(list1, list2);
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));
        if(equal)
        {
                System.out.println("Your lists are equal.");
        }
        else
        {
            System.out.println("Your lists are not equal.");
        }
    }   
    //This method takes the inputs from the user to build list.
    public static int[] inputList(Scanner input)
    {

        int size = 0; 
        int[] myArray;

        System.out.print("Enter list size and elements:");
        size = input.nextInt();
        
        myArray = new int[size];
        //Allocate space for list size
        
        for(int i = 0; i < size; i++)
        {
            myArray[i] = input.nextInt();
        }

        return myArray;

    }

    //This method sorts the arrays and determines if they are equal.
    public static boolean identifyLists(int[] array1, int[] array2)
    {
        boolean identical = false;
        

        //First check the size to see if it is worth sorting.
        if(!(array1.length == array2.length))
        {
            return identical;
        }
        else
        {
            Arrays.sort(array1);
            Arrays.sort(array2);

            if(Arrays.equals(array1, array2))
            {
                identical = true;
            }
            else
            {
                identical = false;
            }

            return identical;
        }
    }
}
