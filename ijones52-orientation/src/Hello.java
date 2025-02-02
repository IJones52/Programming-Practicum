/*
* TCSS 305 � Winter 2020
* Assignment 1 � Orientation
*/
import java.awt.Color;
/**
* This program just holds some methods that fulfill the requirements of Programming Assignment 1
* It features a basic method that will print hello world and a method to find the average red value out of a set of colors.
* 
* @author Ismael Jones
* @version 1/9/2020 
*/
public class Hello {
    
    public static void main(String[] args) {
       //The required hello world
       Test t = new Test();
       t.printHelloWorld();
       
       //Passing all the tests for averageRedValue
       System.out.println(averageRedValue(new Color(0,0,255), new Color(0,0,255)));
       System.out.println(averageRedValue(new Color(152,0,0)));
       System.out.println(averageRedValue());
       Color[] colors = {new Color(124,0,0),new Color(24,0,0),new Color(200,0,0)};
       System.out.println(averageRedValue(colors));
       
    }
    
    public static double averageRedValue(Color ...colors) {
        double average = 0.0;
        //Loop over colors and take their red value 
        for(int i = 0; i < colors.length; i ++) {
            average += colors[i].getRed();
        }
        if(colors.length != 0) {
         //Return the average
        return average/colors.length;
        }
        else {
            //if the array has length 0, return 0;
            return average;
        }
    }
}
