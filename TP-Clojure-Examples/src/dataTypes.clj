(ns .dataTypes)

;;Set
  (println (set '(1 2 3 4)))

;; Distinct elements
  (println (set '(1 1 2 3 2 4 5 5)))

;; Distinc elements
  (println (set [1 1 2 3 2 4 5 5]))

;;
  (println (set [1 2 3 4 5]))

;;
  (println (set "abcdef"))

;;
  (println (set '("a" "b" "c" "d")))

;;
  (println (set {:uno 1 :dos 2 :tres 3}))

;;
  (println (set nil))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Listas

  (println (list 1 2 3 4))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Vectores

  (println (vector 1 2 3 4))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Ejemplo de varios tipos de variables
(defn Example []
  ;; Integer
  (def x 2)

  ;; Float
  (def y 3.5)

  ;; String
  (def string1 "Hola")
  (println x)
  (println y)
  (println string1)
  )

  (Example)