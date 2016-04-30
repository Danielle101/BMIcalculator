//This program calculates a persons bmi based on user inputs of height and weight
package bmiCalculator;

import java.util.Scanner;

public class BMIcalculator {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
System.out.println("Welcome to the Body Mass Index (BMI) Calculator!\n");
System.out.println("Please enter your height in inches:");
double height = scan.nextInt();
scan.nextLine();

System.out.println("Please enter your weight in pounds:");
double weight = scan.nextInt();
scan.nextLine();

double bmi = ((weight*703)/(height*height));

System.out.println("Based on your height of " + height + " inches and your weight of "+ weight + " pounds your bmi is " + bmi + ".");
//System.out.println(bmi);
	}

}
