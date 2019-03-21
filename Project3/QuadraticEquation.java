//Class: CS2261-JAVA
//Due Date: 03/20/19  
//Author: Elijah Korneffel
//Description: This script contains the QuadraticEquation class to be
//used with the format ax2+bx+c=0
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

public class QuadraticEquation 
{
    double a;
    double b;
    double c;
    

    /* Constructor with a, b, c input coefficients */
    public QuadraticEquation(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //This method returns a value
    public double getA()  
    {
        return a;
    }
    
    //This method returns b value
    public double getB()  
    {
        return b;
    }
    
    //This method returns c value
    public double getC()  
    {
        return c;
    }
    
    //This method returns discriminant value b*2-4*a*c. Returns 0 if discriminant is negative.
    public double getDiscriminant()
    {
        double discriminant = Math.pow(b, 2) - 4*a*c; 
        return discriminant;
    }
    
    //This method returns root1 value. Returns 0 if discriminant is negative.
    public double getRoot1()
    {
        double root1;
        if(getDiscriminant() < 0)
        {
            root1 = 0;

        }
        else
        {
            root1 = (-b + Math.sqrt(getDiscriminant())) / (2*a);
        } 
            return root1; 
    }

    //This method returns root2 value. Returns 0 if discriminant is negative.
    public double getRoot2()
    {
        double root2;
        if(getDiscriminant() < 0)
        {
            root2 = 0;

        }
        else
        {
            root2 = (-b - Math.sqrt(getDiscriminant())) / (2*a);
        } 
            return root2; 
    }
    //Tests out class 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double ain;
        double bin;
        double cin;

        System.out.print("Enter a, b, c:");
        ain = input.nextDouble();
        bin = input.nextDouble();
        cin = input.nextDouble();
        
        QuadraticEquation equation = new QuadraticEquation(ain, bin, cin);
        //Displays corresponding roots based on discriminant
        if(equation.getDiscriminant() < 0)
        {
            System.out.println("Your equation has no roots.");
        }
        else if(equation.getDiscriminant() > 0)
        { 
            System.out.printf("Your equation has the roots: %f and %f", equation.getRoot1(), equation.getRoot2());        
        } 
        else
        {
            System.out.printf("Your equation has the root: %f", equation.getRoot1());        }
    }   


}
