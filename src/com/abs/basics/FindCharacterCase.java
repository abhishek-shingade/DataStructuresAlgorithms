package com.code.generalTopics;

import com.oops.FastReader;

public class FindCharacterCase {
    public static void main(String args[]) {

        FastReader read = new FastReader();
        char ch = read.nextChar();

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("0");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }
}

/*
 * Problem statement
 * Write a program that takes a character as input and prints either 1, 0, or -1
 * according to the following rules.
 * 
 * 1, if the character is an uppercase alphabet (A - Z)
 * 0, if the character is a lowercase alphabet (a - z)
 * -1, if the character is not an alphabet
 * Constraints :
 * Input can be any character.
 * Constraints :
 * Input can be any character.
 * Input format :
 * The only line of input contains a single character.
 * Output format :
 * The only line of output prints eith1, 0 or -1(as applicable).
 * Sample Input 1 :
 * v
 * Sample Output 1 :
 * 0
 * Explanation of Sample Input 1:
 * v is a lower case alphabet hence the output is 0.
 * Sample Input 2 :
 * V
 * Sample Output 2 :
 * 1
 * Explanation of Sample Input 3:
 * V is an upper case alphabet hence the output is 1.
 * Sample Input 3 :
 * #
 * Sample Output 3 :
 * -1
 * Explanation of Sample Input 3:
 * # is a symbol and neither an upper case alphabet nor lower case alphabet;
 * hence the output is -1.
 */