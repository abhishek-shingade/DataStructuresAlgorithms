/*
Add positive num until a negative num is provided via input
add only that negative number and print output
O{n}
*/

package com.code.generalTopics;

import java.util.Scanner;

public class SumOfPositiveNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int num = 0;

        do {
            num = scan.nextInt();
            sum += num;
        } while (num > 0);

        scan.close();

        System.out.print(sum);
    }
}