#lang scheme
(define makeList
  (lambda (l x)
    (if (null? l)
        (list x)
        (cons (car l) (makeList (cdr l) x)))))

(define make-setty-list
  (lambda (l)
    (make-list 1 '() l)))

(define make-list
  (lambda (prev res l)
    (cond
      ((null? l) res)
      ((empty? res)
       (make-list (car l) (makeList res (car l)) (cdr l)))
      ((= (car l) prev)
       (make-list prev res (cdr l)))
      (else
       (make-list (car l) (makeList res (car l)) (cdr l))))))

(define setty-list-union
  (lambda (l1 l2)
    (make-setty-list (cons l1 l2))))

(define minus-fn
  (lambda (l1 cur l2)
    (cond
      ((null? l2) l1)
      ((null? (cdr l2)) (remove cur l1))
      (else
       (minus-fn (remove cur l1) (car (cdr l2)) (cdr l2))))))
(define setty-list-minus
  (lambda (l1 l2)
    (minus-fn l1 (car l2) l2)))


(make-setty-list '(1 2 2 1 3))
(setty-list-minus '(1 2 1 3) '(1 3))

        