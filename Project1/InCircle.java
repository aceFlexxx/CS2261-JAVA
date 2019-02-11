//This program executes ex3.29
import java.util.Scanner;
import java.lang.Math;

public class InCircle
{    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle1 info in format x-coord, y-coord, radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius1 = input.nextDouble();

        System.out.print("Enter circle2 info in format x-coord, y-coord, radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius2 = input.nextDouble();
        
        String response = computeResponse(x1, y1, radius1, x2, y2, radius2);
        
        System.out.print(response);
    }
    public static String computeResponse(double x1, double y1, double radius1, double x2, double y2, double radius2)
    {
        double distance;

        distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        if(distance <= radius1 - radius2)
        {
            return "Circle2 is inside circle1.";

        }
        else if(distance <= radius1 + radius2)
        {
            return "Circle2 is overlapping circle1.";
        }
        else
        {
            return "Circle2 is neither inside or overlapping circle1.";
        }

    }
    
}
