#lang scheme
(define mix
  (lambda (l1 l2)
    (apply map list (list l1 l2))))

(define unmix
  (lambda (l)
    (apply map list l)))
    
(mix '(1 2 3) '(alpha beta gamma))
(unmix '((1 alpha) (2 beta) (3 gamma)))