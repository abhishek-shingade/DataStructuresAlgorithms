package com.code.generalTopics;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int num_1 = scan.nextInt();
        int num_2 = scan.nextInt();
        scan.close();

        int lcm = (num_1 * num_2) / gcd(num_1, num_2);

        System.out.print(lcm);
    }

    private static int gcd(int num_1, int num_2) {
        if (num_2 == 0) {
            return (num_1);
        }

        return (gcd(num_2, (num_1 % num_2)));
    }
}