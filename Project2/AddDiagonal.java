//Class: CS2261-JAVA
//Due Date: 03/04/19  
//Author: Elijah Korneffel
//Description: This script finds the sum of a 4x4 matrix diagonal.

import java.util.Scanner;
import java.util.Arrays;

public class AddDiagonal 
{
    public static void main(String[] args)
    {
        double[][] matrix = new double[4][4];
        double sum = 0;
        Scanner input = new Scanner(System.in);
  
        matrix = inputMatrix(input);
        sum = addDiagonal(matrix);
        printMatrix(matrix);
        System.out.printf("Your diagonal sum is %f", sum);
    }   
    //This method isn't necessary but prints the matrix to view input. 
    public static void printMatrix(double[][] myMatrix)
    {
        for(int i = 0; i < myMatrix.length; i++)
        {

            for(int j = 0; j < myMatrix[i].length; j++)
            {
                System.out.print("[");
                System.out.print(myMatrix[i][j]);
                System.out.print("]");
            }
            System.out.println("");
        }
    }

    //This method takes the inputs from the user to build 4x4 matrix.
    public static double[][] inputMatrix(Scanner input)
    {

        double[][] myMatrix = new double[4][4];

        System.out.println("Enter 4x4 matrix row by row:");
        for(int i = 0; i < myMatrix.length; i++)
        {
            for(int j = 0; j < myMatrix[i].length; j++)
            {
                myMatrix[i][j] = input.nextDouble();
            }
        }

        return myMatrix;

    }
    //This method adds the diagonal of given matrix.
    public static double addDiagonal(double[][] matrix)
    {
        double matrixSum = 0;

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(j == i)
                {
                    matrixSum += matrix[i][j];
                }
            } 
        }
        return matrixSum;
    }
}
