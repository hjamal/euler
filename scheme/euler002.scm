; Project Euler Problem 2
; =======================
;
; Each new term in the Fibonacci sequence is generated by adding the
; previous two terms. By starting with 1 and 2, the first 10 terms will be:;
;
; 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
;
; Find the sum of all the even-valued terms in the sequence which do not
; exceed four million.

(define (problem2)
  (define (sum-even-fibs-up-to n)
    (define (even? a) (= (remainder a 2) 0))
    (define (inner a b s)
      (cond ((>= a n) s)
            ((even? a) (inner b (+ a b) (+ a s)))
            (else (inner b (+ a b) s))))
    (inner 1 2 0))
  (sum-even-fibs-up-to 4000000))

(problem2)