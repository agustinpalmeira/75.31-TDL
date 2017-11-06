(ns .lists-vectors)

;;Ejemplos vectores y listas con operaciones dentro. Declaraciones de variables.

  (def a [-10 5 2 1])
  (println (format "Devuelve el maximo de todos los numeros en la lista: %s" a))
  (println (max -10 5 2 1))

  (def b [2 2])
  (println (format "Devuelve el producto de todos los numeros en la lista: %s" b))
  (println (* 2 2))

  (println (format "Devuelve el producto de la lista %s y luego el maximo de la lista formada por el %s con el %s" b 10 b))
  (println (max 10 (* 2 2)))

  (println (format "Devuelve una lista con distintos tipos de datos:"))
  (println [1 "TDL" 24.05])

  (println (format "Devuelve una lista con distintos tipos de datos:"))
  (println [2 "TDL" (* 5 3)])

