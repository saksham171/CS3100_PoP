#lang scheme
(define maximum-argument
  (lambda (f ll)
    (max-value f ll (car ll))))

(define max-value
  (lambda (f ll cur)
    (if (null? ll) cur
        (if (> (f (car ll)) (f cur)) (max-value f (cdr ll) (car ll))
            (max-value f (cdr ll) cur)))))
(maximum-argument (lambda (x) (* -3 x)) '(3 4 5))
