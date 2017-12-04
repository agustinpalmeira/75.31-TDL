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

(if (even? 5)
  (do (println "even") "not odd")
  (do (println "odd") "not even"))

(when true (println "true"))

(defn filter-evens [coll]
  (if-let [evens (seq (filter even? coll))]
    (println (str "Evens are:" evens))
    (println "No evens.")))

(let [x 5] ;;binds 5 to x
  (cond
    (< x 2)  (println "x is less than 2")
    (< x 10) (println "x is less than 10")

    :else (println "x is greater than or equal to 10")))

(defn value [x]
  (case x
    5 "x is 5"
    10 "x is 10"
    "x isn't 5 or 10"))
(value 11) ;;"x isn't 5 or 10"
(value 10);;"x is 10
