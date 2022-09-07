#lang scheme
(define iter-fib
  (lambda (n)
    (fib-calc 1 0 n)))

(define fib-calc
  (lambda (f_n-1 f_n-2 cur)
    (if (zero? cur) f_n-2
        (fib-calc (+ f_n-1 f_n-2) f_n-1 (- cur 1)))))

(iter-fib 50)