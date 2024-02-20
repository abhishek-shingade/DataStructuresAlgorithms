package com.code.generalTopics;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = scan.nextDouble();
        scan.close();

        int numDigits = (int) Math.log10(num) + 1;

        System.out.print(numDigits);
    }
}