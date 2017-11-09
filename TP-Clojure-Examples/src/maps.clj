(ns .maps)

;;https://clojuredocs.org/clojure.core/map

;(map f)(map f coll)(map f c1 c2)(map f c1 c2 c3)(map f c1 c2 c3 & colls)

;Returns a lazy sequence consisting of the result of applying f to
;the set of first items of each coll, followed by applying f to the
;set of second items in each coll, until any one of the colls is
;exhausted.  Any remaining items in other colls are ignored. Function
;f should accept number-of-colls arguments. Returns a transducer when
;no collection is provided.

(comment
(map inc [1 2 3 4 5])
;;=> (2 3 4 5 6)


;; map can be used with multiple collections. Collections will be consumed
;; and passed to the mapping function in parallel:
(map + [1 2 3] [4 5 6])
;;=> (5 7 9)


;; When map is passed more than one collection, the mapping function will
;; be applied until one of the collections runs out:
(map + [1 2 3] (iterate inc 1))
;;=> (2 4 6)



;; map is often used in conjunction with the # reader macro:
(map #(str "Hello " % "!" ) ["Ford" "Arthur" "Tricia"])
;;=> ("Hello Ford!" "Hello Arthur!" "Hello Tricia!")

;; A useful idiom to pull "columns" out of a collection of collections.
;; Note, it is equivalent to:
;; user=> (map vector [:a :b :c] [:d :e :f] [:g :h :i])

(apply map vector [[:a :b :c]
                   [:d :e :f]
                   [:g :h :i]])

;;=> ([:a :d :g] [:b :e :h] [:c :f :i])

;; From http://clojure-examples.appspot.com/clojure.core/map

(map #(vector (first %) (* 2 (second %)))
            {:a 1 :b 2 :c 3})
([:a 2] [:b 4] [:c 6])

(into {} *1)
{:a 2, :b 4, :c 6}

;; Use a hash-map as a function to translate values in a collection from the
;; given key to the associated value

(map {2 "two" 3 "three"} [5 3 2])
(nil "three" "two")

;; then use (filter identity... to remove the nils
(filter identity (map {2 "two" 3 "three"} [5 3 2]))
("three" "two")



;;;;;;

;; mapping over a hash-map applies (into) first.
;; need to use functions that deal with arrays (fn [[key val]] ...)
(map pprint {:key :val :key1 :val1})
([:key :val]
  [:key1 :val1]
  nil nil)

;;above, the pprint output appears to be part of the return value but it's not:
(hash-set (map pprint {:key :val :key1 :val1}))
[:key :val]
[:key1 :val1]
#{(nil nil)}

(map second {:key :val :key1 :val1})
;;=>(:val :val1)

(map last {:x 1 :y 2 :z 3})
;;=> (1 2 3)

;;;;

(map fn [a 4 x]
     [b 5 y]
     [c 6])
;        ^ ^
; applies fn to a b c as (fn a b c)
; applies fn to 4 5 6 as (fn 4 5 6)
; ignores (x y)
; returns a list of results
; equivalent to (list (fn a b c) (fn 4 5 6))

;example
(map list [1 2 3]
     '(a b c)
     '(4 5))

(map list  [1 2 3] '(a b c) '(4 5))
((1 a 4) (2 b 5))
;same as
(list (list 1 'a 4) (list 2 'b 5))
((1 a 4) (2 b 5))

;;;;;

; map passed two collection arguments. From 4Clojure Problem #157

(def d1 [:a :b :c])
(#(map list % (range)) d1)
;;=> ((:a 0) (:b 1) (:c 2))

;;;;

;; Used without a collection, map will create a transducer:
(def xf (map inc))

;; We can now apply this transducer to a sequence:
(transduce xf conj (range 5))
;; => [1 2 3 4 5]

;;;;;

;; Extract keyword from a collection of obj
(map :a '({:a 1 :b 0} {:a 2 :b 0} {:a 3 :b 1} {:a 3 :b 0}))
;; =>(1 2 3 3)

;;;;

;;get the keys from a map with entries of certain values
(let [m {:x 1 :y 2 :z 3}
      vset #{2 3}]
  (map first (filter (comp vset last) m)))
;;=> (:y :z)

(filter (comp #{2 3} last) {:x 1 :y 2 :z 3})
;;=> ([:y 2] [:z 3])

;;;;;

)

