package Exercise19;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise19 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in inches: ");
        String weight = scanner.nextLine();

        System.out.print("Enter your height in inches: ");
        String height = scanner.nextLine();

        double Weight = 0;
        double Height = 0;

        try {
            Weight = Double.parseDouble(weight);
        } catch (NumberFormatException nfe) {
            System.out.print("Please enter a number value for weight next time.");
            System.exit(0);
        }

        try {
            Height = Double.parseDouble(height);
        } catch (NumberFormatException nfe) {
            System.out.print("Please enter a number value for height next time.");
            System.exit(0);
        }

        double BMI = ((Weight/(Height*Height))*703);

        System.out.println("Your BMI is " + String.format("%.1f", BMI));

        if (BMI >= 18.5 && BMI <= 25){
           System.out.print("You are within ideal weight range.");
        }
        else if (BMI > 25) {
            System.out.print("You are overweight. You should see your doctor. ");
        }
        else if (BMI < 18.5){
            System.out.print("You are underweight. You should see your doctor. ");
        }



    }

}
