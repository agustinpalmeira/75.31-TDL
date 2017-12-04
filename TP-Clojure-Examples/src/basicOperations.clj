(ns .basicOperations)

;;https://clojuredocs.org/clojure.core/if
(defn is-small? [number]
  (if (< number 100) "yes" "no"))

(println (is-small? 50))
(println (is-small? 500))

;; Salida:
;; yes
;; no

(println (if(even? 6) "even" "odd"))

(even? 2)
(even? 1)

(defn if-let-demo [arg]
  (if-let [x arg]
    "then"
    "else"))

(println (if-let-demo 1)) ; anything except nil/false
;;=> "then"
(println (if-let-demo nil))
;;=> "else"
(println (if-let-demo false))
;;=> "else"