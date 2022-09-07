#lang scheme
;In a compiler it is common to create symbol-tables. Create three
;functions (create-symbol-table, extend-symbol-table, lookup) using which
;we can create an initial symbol table, extend it and do lookup.
;You can infer the parameter details about the functions based on the
;following example.

(define create-symbol-table
  (lambda (lst)
    (lambda (x)
        (lookup-helper lst x))))

(define lookup-helper
    (lambda (lst x)
        (cond
            [(null? lst) '()]
            [(eq? (car (car lst)) x) (cdr (car lst))]
            [else (lookup-helper (cdr lst) x)])))

(define extend-symbol-table
    (lambda (st lst)
        (lambda (x)
            (cond
                [(null? lst) (st x)]
                [else (lookup-helper lst x)]))))

;(define lookup
 ;   lambda (st x)
  ;  (st x))

(define myST (create-symbol-table '((a 3) (b 6))))
;(lookup myST 'b) should return 6
;(lookup myST 'c) should return '()
(define myST2 (extend-symbol-table myST '((e 2) (b 7) (d 5))))
;(lookup myST2 'b) should return 7
;(lookup myST2 'd) should return 5
;(lookup myST 'b) should return 6
