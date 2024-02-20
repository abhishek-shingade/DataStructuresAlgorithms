/* Given a string, check whether it is a palindrome. */
/* O{n} */

package com.code.generalTopics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();

        StringBuilder sb = new StringBuilder(scan.next());
        sb.reverse();

        String rev = sb.toString();

        if (str.equals(rev)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}