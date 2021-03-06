
"""
 Project Euler Problem 2
 =======================

 Each new term in the Fibonacci sequence is generated by adding the
 previous two terms. By starting with 1 and 2, the first 10 terms will be:

 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

 Find the sum of all the even-valued terms in the sequence which do not
 exceed four million.
"""

def fibSum(n, m):
    a, b = 0, 1
    sum = 0
    while b < n:
        a , b = b, a+b
        if b % m == 0:
            sum += b
    return sum

print fibSum(4000000, 2)
