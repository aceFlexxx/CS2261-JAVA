//Class: CS2261-JAVA
//Due Date: 03/20/19  
//Author: Elijah Korneffel
//Description: This script tests importing and using QuadraticEquation class. 

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
