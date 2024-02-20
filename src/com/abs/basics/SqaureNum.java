/* Given an integer N, generate & print an array containing squares of all numbers from 1 to N */
/* N = 5 */
/* Output: 1 4 9 16 25 */
/* O{n} */

package com.code.generalTopics;

import java.util.Scanner;

public class SqaureNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        scan.close();

        for (int i = 1; i <= num; i++) {
            System.out.print(i * i + " ");
        }
    }
}
