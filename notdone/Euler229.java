import java.util.Date;
/*
Project Euler Problem 229
=========================

Consider the number 3600. It is very special, because

3600 = 48^2 +   36^2

3600 = 20^2 + 2×40^2

3600 = 30^2 + 3×30^2

3600 = 45^2 + 7×15^2

Similarly, we find that 88201 = 99^2 + 280^2 = 287^2 + 2×54^2 = 283^2 +
3×52^2 = 197^2 + 7×84^2.

In 1747, Euler proved which numbers are representable as a sum of two
squares.We are interested in the numbers n which admit representations of
all of the following four types:

n = a[1]^2 +   b[1]^2

n = a[2]^2 + 2×b[2]^2

n = a[3]^2 + 3×b[3]^2

n = a[7]^2 + 7×b[7]^2,

where the a[k] and b[k] are positive integers.

There are 75373 such numbers that do not exceed 10^7.
How many such numbers are there that do not exceed 2×10^9?
*/

public class Euler229 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
