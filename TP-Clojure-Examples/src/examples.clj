(ns .examples)

;;Fuente: kimh.github.io/clojure-by-example/

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;We invoke the function println with the argument Hello, world!.
;We call the invocation of function applying the function to data in Clojure or other functional programming language.
(println "Hello, world!")
;The entire line of the code (....) is called a form in Clojure. It's also called expression in a general sense.
true
100
"dog"
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;Bindings
;Giving names to values is called assignment in many programming languages.
;However, we call the mapping between names and values binding in Clojure.

;Symbol
;Symbols are used to bind names to values.
;' will prevent a form from being evaluated.
;We are doing this here because we want to treat symbols as data in order to pass them to type function.
(println (type 'a))
(type 'a)