//This program generates random license plates 
import java.util.Scanner;
import java.lang.Math;

public class LicensePlate 
{    
    public static void main(String[] args)
    {
        createPlate();
        
    }
    
    public static void createPlate()
    {

        char charDisp1;
        char charDisp2;
        char charDisp3;
        char charDisp4;
        char charDisp5;
        char charDisp6;

        String licensePlate = "";
        
        System.out.println("Here are 10 random license plates:");
        
        for(int i = 0; i < 10; i++)//Create each char for the plate using random function
        {
            charDisp1 = (char)(65 + Math.random()*26);
            charDisp2 = (char)(65 + Math.random()*26);
            charDisp3 = (char)(48 + Math.random()*10);
            charDisp4 = (char)(48 + Math.random()*10);
            charDisp5 = (char)(65 + Math.random()*26);
            charDisp6 = (char)(48 + Math.random()*10);
            
            licensePlate = charDisp1 + "" + charDisp2 + "" + charDisp3 + " " + charDisp4 + "" + charDisp5 + "" + charDisp6;
            System.out.println(licensePlate);
        }

    }
}
