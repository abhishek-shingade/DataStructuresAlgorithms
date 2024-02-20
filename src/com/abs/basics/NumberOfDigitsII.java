package com.code.generalTopics;

import java.util.Scanner;

public class NumberOfDigitsII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numDigits = 0;

        int num = scan.nextInt();
        scan.close();

        while (num > 0) {
            num = num / 10;
            numDigits++;
        }

        System.out.print(numDigits);
    }
}
