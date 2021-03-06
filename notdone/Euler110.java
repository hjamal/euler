import java.util.Date;
/*
Project Euler Problem 110
=========================

In the following equation x, y, and n are positive integers.

                                1 + 1 = 1
                                x   y   n

It can be verified that when n = 1260 there are 113 distinct solutions and
this is the least value of n for which the total number of distinct
solutions exceeds one hundred.

What is the least value of n for which the number of distinct solutions
exceeds four million?

NOTE: This problem is a much more difficult version of problem 108 and
as it is well beyond the limitations of a brute force approach it requires
a clever implementation.
*/

public class Euler110 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
