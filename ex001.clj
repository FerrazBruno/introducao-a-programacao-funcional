(ns curso.ex001)

; Como calcular o total de certificados de todos os clientes?
(def clientes [{:nome "Bruno"
                :certificados ["Clojure" "Java" "Machine Learning"]}
               {:nome "Júlia"
                :certificados ["Java" "Ciência da Computação"]}
               {:nome "Frodo"
                :certificados ["Élfico" "Forja"]}])

(println (->> clientes
              (map :certificados)
              (map count) (reduce +)))