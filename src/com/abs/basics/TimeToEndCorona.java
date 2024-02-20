package com.code.generalTopics;

import java.util.Scanner;

public class TimeToEndCorona {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int recovered = scan.nextInt();
        int new_cases = scan.nextInt();
        int currently_active = scan.nextInt();
        scan.close();

        int days = 0;

        do {
            days += 1;
            currently_active = (currently_active + new_cases) - recovered;
        } while (currently_active > 0);

        System.out.print(days);
    }
}
/*
 * Given three integers, A, B and C. You have to find the number of days it will
 * take to reach zero cases of Corona in a city.
 * 
 * A - Average cases recovered in a day of the corona.
 * B - Number of new cases of corona daily.
 * C - Current active cases of the corona.
 * 
 * Return the minimum number of days it will take to reach 0 active cases of
 * Covid.
 */
/*
 * Input
 * The first argument will be integer A, which denotes the recovered cases in a
 * day.
 * The second argument will be integer B, which denotes the new cases in a day.
 * The third argument will be integer C, which denotes the currently active
 * cases.
 */
/*
 * Output
 * Return an integer which denotes the minimum days to reach 0 cases.
 */
/*
 * Input 1:
 * A = 5
 * B = 3
 * C = 1
 * Input 2:
 * A = 4
 * B = 3
 * C = 2
 */
/*
 * Output 1:
 * 1
 * Output 2:
 * 2
 */
/*
 * Explanation
 * At the end of Day 1, 3 new cases of Covid will arise.
 * So, total cases at the end of Day-1 before recovery will be 1 + 3 = 4.
 * And after recovery there will be (4 - 5) = -1 cases, since there cannot be
 * negative number of cases
 * the cases would be 0 at the end of Day 1
 */
/* O{n} */