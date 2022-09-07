#lang scheme
(define nil '())

(define iteration-space
  (lambda (ll)
    (iteration-helper ll nil (car ll))))

(define iteration-helper
  (lambda (l1 l2 cur)
    (if (> cur (car (cdr l1)))
    l2
    (cons cur (iteration-helper l1 l2 (+ cur (caddr l1)))))))

(iteration-space '(0 10 2))