(defun fahrenheit-a-celsius (fahrenheit)
  "Convierte grados Fahrenheit a grados Celsius."
  (/ (* (- fahrenheit 32) 5) 9))

(let ((grados-fahrenheit 33)) ; Puedes cambiar el valor según tus necesidades
  (format t "Fahrenheit: ~a ~%Celsius: ~a" grados-fahrenheit (fahrenheit-a-celsius grados-fahrenheit)))