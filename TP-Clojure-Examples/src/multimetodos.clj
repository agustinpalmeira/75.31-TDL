(ns .multimetodos)


(defn execute [command & args]
  (apply command args))

(defmulti area :figura)

(defmethod area :circulo [figura]
  (* Math/PI (:radio figura) (:radio figura)))

(defmethod area :rectangulo [{:keys [ancho alto]}]
  (* ancho alto))

(def circulo {:figura :circulo :radio 10})
(def rectangulo {:figura :rectangulo :ancho 10 :alto 15})

(execute area circulo)		;=> 314.1592653589793
(execute area rectangulo)		;=> 150
