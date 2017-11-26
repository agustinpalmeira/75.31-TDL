(ns .interop)

(import '(javax.swing JOptionPane))
(JOptionPane/showMessageDialog nil, (str "Hola Mundo"))


(import '(javax.swing JOptionPane))
(def sistema(. (. System (getProperties)) (get "os.name")))

(JOptionPane/showMessageDialog nil,
                               (str "Estas usando operativo: "sistema)
                               )