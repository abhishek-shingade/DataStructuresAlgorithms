package com.code.generalTopics;

import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        String classification;

        Scanner scan = new Scanner(System.in);
        float height = scan.nextFloat(); // in cm
        float weight = scan.nextFloat(); // in kg
        scan.close();

        float bmi = calculateBMI(height, weight);
        classification = getClassification(bmi);
        String round_bmi = String.format("%.1f", bmi);

        System.out.println(classification);
        System.out.print(round_bmi);
    }

    private static float calculateBMI(float height, float weight) {
        // cm to mtrs
        height /= 100;

        // bmi formula
        return weight / (height * height);
    }

    private static String getClassification(float bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}

/*
 * BMI Calculator
 * Problem Description -
 * 
 * Given the height (A) and weight (B) of a person as input in centimetres and
 * kilograms.
 * 
 * Find the BMI of that person and the classification of the user based on their
 * BMI.
 * 
 * Print Underweight if BMI < 18.5
 * Print Normal if BMI lies in the range [18.5, 24.9]
 * Print Overweight if BMI lies in the range (24.9, 29.9]
 * Print Obese if BMI is greater than 29.9
 * If x is the weight in kilograms and y is the height in metres.
 * 
 * Then, BMI is calculated as x/(y*y).
 * 
 * Note: Use round(BMI,1) to get only one digit after decimal
 * 
 * Problem Constraints -
 * 
 * 1 <= A <= 180
 * 
 * 1 <= B <= 120
 * 
 * Input Format -
 * 
 * The first line contains the height of the person in centimetres.
 * 
 * The second line of the input contains the weight of the person in kilograms.
 * 
 * Output Format -
 * 
 * The first line of the output contains the classification of a person based on
 * the BMI value.
 * 
 * The second line of the output contains the BMI value of the person having
 * only one digit after decimal.
 * 
 * 
 * 
 * Sample Input -
 * 
 * Input 1:
 * 
 * 101
 * 29
 * Input 2:
 * 
 * 129
 * 31
 * Sample Output -
 * 
 * Output 1:
 * 
 * Overweight
 * 28.4
 * Output 2:
 * 
 * Normal
 * 18.6
 */
/* O{1} */