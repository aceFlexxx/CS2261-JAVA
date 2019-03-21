//Class: CS2261-JAVA
//Due Date: 03/20/19  
//Author: Elijah Korneffel
//Description: This script contains the Circle2D class 
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

public class Circle2D 
{
    double x;
    double y;
    double radius;
    

    /* Default constructor */
    public Circle2D()
    {
        x = 0;
        y = 0;
        radius = 1; 
    }

    /* Constructor with x, y, radius inputs */
    public Circle2D(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    //This method returns x value
    public double getX()  
    {
        return x;
    }
    
    //This method returns y value
    public double getY()  
    {
        return y;
    }
    
    //This method returns radius value
    public double getRadius()  
    {
        return radius;
    }
    
    //This method returns area of circle.
    public double getArea()
    {
        double area = Math.PI * Math.pow(radius, 2); 
        return area;
    }
    
    //This method returns perimeter.
    public double getPerimeter()
    {
        double perimeter = 2 * Math.PI * radius; 
        return perimeter;
    }
    
    //This method returns true if specefied (x, y) point is inside this circle.
    public boolean contains(double x, double y)
    {
        double distance;

        distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));

        //Checks if point is INSIDE circle - not on, so < vs <= is used.
        if(distance < this.radius)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //This method returns true if specefied circle is inside this circle.
    public boolean contains(Circle2D otherCircle)
    {
        double distance;

        distance = Math.sqrt(Math.pow(this.x - otherCircle.x, 2) + Math.pow(this.y - otherCircle.y, 2));

        //Check that the otherCircle is contained in this circle.
        if(this.radius > (distance + otherCircle.radius))
        {
            return true;
        }
        else
        { 
            return false;
        }
    }

    //This method returns true if specefied circle and this circle overlap.
    public boolean overlaps(Circle2D otherCircle)
    {
        double distance;

        distance = Math.sqrt(Math.pow(this.x - otherCircle.x, 2) + Math.pow(this.y - otherCircle.y, 2));

        //Checks if otherCircle and this circle overlap.
        if(distance < (this.radius + otherCircle.radius))
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
    //Tests out class 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.printf("Circle c1 perimeter: %f\n", c1.getPerimeter());
        System.out.printf("Circle c1 area: %f", c1.getArea());

        if(c1.contains(3, 3))
        {
            System.out.println("\nCircle c1 contains point (3, 3)");
        }
        else
        {
            System.out.println("Circle c1 does not contain point (3, 3)");
        } 

        if(c1.contains(new Circle2D(4, 5, 10.5)))
        {
            System.out.println("Circle c1 contains given Circle2D(2, 2, 5.5)");
        }
        else
        {
            System.out.println("Circle c1 does not contain given Circle2D(2, 2, 5.5)");
        }

        if(c1.overlaps(new Circle2D(3, 5, 2.3)))
        {
            System.out.println("Circle c1 overlaps given Circle2D(3, 5, 2.3)");
        }
        else
        {
            System.out.println("Circle c1 does not overlap given Circle2D(3, 5, 2.3)");
        }
    } 
}


