(ns curso.get-e-update)

(def precos [30 700 1000])

(println "Usando o vetor como função")
(println (precos 0))
(println (precos 1))
(println (precos 2))

(println "\nUsando a função get para acessar os elementos")
(println (get precos 1))
(println (get precos 2))
(println "valor padrao nil =>" (get precos 7))
(println "valor padrao 0 =>" (get precos 7 0))

(println "\nAdicionando um elemento ao final do vetor")
(println (conj precos 5))
(println "O vetor original permanece imutável")
(println precos)

(println "\nIncrementando e decrementando um valor dentro do vetor")
(println (update precos 0 inc))
(println (update precos 2 dec))
(println "O vetor original permanece imutável")
(println precos)

(println "\nImplementando a função soma um")
; Função soma um
(defn soma-um [v]
  (println "Estou somando um ao valor" v)
  (inc v))

(println (soma-um 5))

(println "\nImplementando a função soma três")
; Função soma três
(defn soma-tres [v]
  (println "Estou somando três ao valor" v)
  (+ v 3))

(println (soma-tres 5))

(println "\nRetornando um vetor precos com os elementos atualizados")
(println (update precos 0 soma-tres))