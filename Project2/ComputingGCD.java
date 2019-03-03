//Class: CS2261-JAVA
//Due Date: 03/04/19  
//Author: Elijah Korneffel
//Description: This script finds gcm of unspecified number of integers

import java.util.Scanner;

public class ComputingGCD
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 integer numbers to compute gcd:");
        System.out.println("Integer1:");
        int integer1 = input.nextInt();
        System.out.println("Integer2:");
        int integer2 = input.nextInt();
        System.out.println("Integer3:");
        int integer3 = input.nextInt();
        System.out.println("Integer4:");
        int integer4 = input.nextInt();
        System.out.println("Integer5:");
        int integer5 = input.nextInt();

        int output = gcd(integer1, integer2, integer3, integer4, integer5);
        System.out.printf("The gcd is: %d ", output);
    }

    //This method receives integer numbers and returns the integer gcd
    public static int gcd(int... numbers)
    {
        int gcd = 1; //Make initial gcd 1
        int k = 2; //Guess of next gcd
        for(int i = 0; i < numbers.length - 1; i++)
        {
            gcd = 1; //reset gcd to 1
            k = 2; //reset gcd
            
            while(k <= numbers[i] && k <= numbers[i + 1])
            {
                if(numbers[i] % k == 0 && numbers[i + 1] % k == 0)
                {
                    gcd = k; //update gcd
                }
                
                k++;
            }
            
            numbers[i + 1] = gcd; //place the gcd in the next spot of the array

        }

        return gcd;

    }
}
