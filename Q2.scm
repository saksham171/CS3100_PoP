#lang scheme
(define nil '())

(define iteration-space
  (lambda (f ll)
    (iteration-helper f ll nil (car ll))))

(define iteration-helper
  (lambda (f l1 l2 cur)
    (if (> cur (car (cdr l1)))
    l2
    (cons (f cur) (iteration-helper f l1 l2 (+ cur (car (cdr (cdr l1)))))))))

(iteration-space (lambda (x) (+ 3 x)) '(0 10 2))