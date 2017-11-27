(ns .interopExamples
  (:import [java.io File FileInputStream FileOutputStream])) ;;Importing Classes

;;(:import java.io.File) ;;Importing Classes

(new File ".")

(File. ".")

(let [f (File. ".")] (println (.getAbsolutePath f)))

(println (str File/separator "foo"  File/separator "bar"))
(println (Math/sqrt 256))

(.getBytes (.getAbsolutePath (File. ".")))
(.. (File. ".") getAbsolutePath getBytes)

