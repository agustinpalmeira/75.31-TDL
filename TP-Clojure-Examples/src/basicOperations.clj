(ns .basicOperations)

;;https://clojuredocs.org/clojure.core/if
(defn is-small? [number]
  (if (< number 100) "yes" "no"))

(println (is-small? 50))
(println (is-small? 500))




