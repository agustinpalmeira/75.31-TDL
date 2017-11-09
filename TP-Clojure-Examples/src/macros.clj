(ns .macros)

;;Square sin macro:
(def square (fn [x] (* x x)))

;;Square con macro:
(defn squareMacro [x] (* x x))

(println "Square sin macro:")
(println (square 5))

(println "Square con macro:")
(println (squareMacro 5))

;;;;;;;;;

(def a 1)
(def b 2)

;(macroexpand '(when (pos? a) (println "positive") (/ b a)))
(if (pos? a) (do (println "positive") (/ b a)))

;;;

(defmacro my-first-macro []
  (list reverse "Hello World"))

;(macroexpand '(my-first-macro))

(println (my-first-macro))

