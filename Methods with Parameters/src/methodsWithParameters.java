import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class methodsWithParameters
	{

		public static void main(String[] args)
			{
				double feet = feetInput();
				double inches = inchesInput();
				double totalInches = convertHeightToTotalInches(feet, inches);
				System.out.println("You are " + totalInches + " inches tall." );
				double centimeters = convertToCentimeters(totalInches);
				System.out.println("You are " + centimeters + " centimeters tall." );
				double meters = convertToMeters(centimeters);
				System.out.println("You are " + meters + " meters tall.");
				double feet2 = convertToFeet(meters);
				System.out.println("You are " + feet2 + " feet tall.");
				double inches2 = convertToInches(feet2);
				System.out.println("You are " + inches2 + " inches tall.");
	
				
			}
		public static double feetInput()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("How tall are you in feet?");
				return userInput.nextDouble();
				
			}
		public static double inchesInput()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("How tall are you in inches?");
				return userInput.nextDouble();
			}
		public static double convertHeightToTotalInches(double f, double i)
			{
				return (f*12) + i;
			}
		public static double convertToCentimeters(double c)
			{
				return (c * 2.54);
			}
		public static double convertToMeters(double m)
			{
				return (m/100);
			}
		public static double convertToFeet(double q)
			{
				return (q * 3.28084);
			}
		public static double convertToInches(double t)
			{
				return (t * 12);
			}


	}




















//double quarts = inputQuarts();
//double pints = convertToPints(quarts);
//double fluidOunces = convertToFluidOunces(pints);
//double milliliters = convertToMilliliters(fluidOunces);
//
//public static double inputQuarts()
//{
//	System.out.println("Please input the number of quarts you'd like to convert to milliliters.");
//	return userInput.nextDouble();
//}
//public static double convertToPints(double numberofQuarts)
//{
//	double pints = numberOfQuarts*2;
//	System.out.println("That equals " + pints + " pints.");
//	return pints;
//}
//public static double convertToFluidOunces(double numberOfPints)
//{
//	double fluidOunces = numberOfPints*16;
//	System.out.println("That equals " + fluidOunces + " fluidOunces");
//}