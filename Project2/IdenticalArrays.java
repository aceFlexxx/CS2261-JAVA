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

        Scanner input = new Scanner(System.in);
        list1 = inputList(input);
        list2 = inputList(input);
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2)); 
    }   
    //This method takes the inputs from the user to build list.
    public static int[] inputList(Scanner input)
    {

        int size = 0; 
        int[] myArray;

        System.out.print("Enter list size:");
        size = input.nextInt();
        
        myArray = new int[size];
        //Allocate space for list size
        
        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter array element:");
            myArray[i] = input.nextInt();
        }

        return myArray;

    }
}
