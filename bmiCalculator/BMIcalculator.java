//This program calculates a persons bmi based on user inputs of height and weight
package bmiCalculator;
import java.text.DecimalFormat;

import java.util.Scanner;

public class BMIcalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// welcome the user to the app
	System.out.println("Welcome to the Body Mass Index (BMI) Calculator!\n\nThis app will calculate your"
			+ " bmi based on the height and weight that you input.\nPlease be sure to input"
			+ " your accurate weight and height.\n");
		
		// request user input of height and weight
	System.out.println("Please enter your height in inches:");
		double height = Validator.readValidInt();
		
		//
	System.out.println("Please enter your weight in pounds:");
		double weight = Validator.readValidInt();
		
		
		// calculate the users bmi baser on the height and weight input
		double bmi = ((weight * 703) / (height * height));
		//converts the bmi to single place decimal format
		DecimalFormat df = new DecimalFormat("####0.0");
	System.out.println("\nBased on your height of " + height + " inches and your weight of " + weight
				+ " pounds your bmi is " + df.format(bmi) + ".");
		// print out the users bmi category
	System.out.println("\nYour BMI indicates that you are:");
		getCategory(bmi);
		//close scanner
	    scan.close();

	}

	/**
	 * @param bmi
	 */

	// calculates the bmi category based on various bmi ranges
	public static void getCategory(double bmi) {
		if (bmi < 15) {
			System.out.println("very severely underweight");
		}
		if (bmi >= 15 && bmi <= 16) {
			System.out.println("severely underweight");
		}
		if (bmi >= 16.1 && bmi <= 18.4) {
			System.out.println("underweight");
		}
		if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("underweight");
		}
		if (bmi >= 25 && bmi <= 29.9) {
			System.out.println("overweight");
		}
		if (bmi >= 30 && bmi <= 34.9) {
			System.out.println("moderately obese");
		}
		if (bmi >= 35 && bmi <= 39.9) {
			System.out.println("severely obese");
		}
		if (bmi >= 40.0) {
			System.out.println("very severely obese");
		}
		
	}
    
}
