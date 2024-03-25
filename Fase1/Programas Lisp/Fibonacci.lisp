(defun factorial (n)
  "Calcula el factorial de un número"
  (if (<= n 1)
      1
      (* n (factorial (- n 1)))))

(defun fibonacci (n)
  "Calcula el término n de la serie de Fibonacci"
  (if (<= n 1)
      n
      (+ (fibonacci (- n 1)) (fibonacci (- n 2)))))

;; Ejemplo de uso:
(let* ((numero 5)
       (factorial-result (factorial numero))
       (fibonacci-result (fibonacci numero)))
  (format t "Factorial de ~a: ~a~%" numero factorial-result)
  (format t "Término ~a de la serie de Fibonacci: ~a~%" numero fibonacci-result))
