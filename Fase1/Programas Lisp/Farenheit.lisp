(defun celsius-a-fahrenheit (celsius)
  "Convierte grados Celsius a grados Fahrenheit"
  (+ (* celsius 9/5) 32))

;; Ejemplo de uso:
(let ((temperatura-celsius 25))
  (format t "Temperatura en Celsius: ~a~%" temperatura-celsius)
  (format t "Temperatura en Fahrenheit: ~a~%" (celsius-a-fahrenheit temperatura-celsius)))
