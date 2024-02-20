// O{1}

package com.code.generalTopics;

import java.util.Scanner;

public class SumNaturalNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        scan.close();

        int sum = (num * (num + 1)) / 2;

        System.out.print(sum);
    }
}