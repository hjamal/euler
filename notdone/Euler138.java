import java.util.Date;
/*
Project Euler Problem 138
=========================

Consider the isosceles triangle with base length, b = 16, and legs, L =
17.

By using the Pythagorean theorem it can be seen that the height of the
triangle, h = (17^2 8^2) = 15, which is one less than the base length.

With b = 272 and L = 305, we get h = 273, which is one more than the base
length, and this is the second smallest isosceles triangle with the
property that h = b 1.

Find L for the twelve smallest isosceles triangles for which h = b 1 and
b, L are positive integers.
*/

public class Euler138 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
