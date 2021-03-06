import java.util.Date;
/*
Project Euler Problem 108
=========================

In the following equation x, y, and n are positive integers.

                                1 + 1 = 1
                                x   y   n

For n = 4 there are exactly three distinct solutions:

                                1 + 1  = 1
                                5   20   4
                                1 + 1  = 1
                                6   12   4
                                1 + 1  = 1
                                8   8    4

What is the least value of n for which the number of distinct solutions
exceeds one-thousand?

NOTE: This problem is an easier version of problem 110; it is strongly
advised that you solve this one first.
*/

public class Euler108 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
