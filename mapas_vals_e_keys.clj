(ns curso.mapas-vals-e-keys)

(def estoque {"Mochila" 10
              "Camiseta" 5})

(println estoque)

(println "temos" (count estoque) "elementos")
(println "chaves:" (keys estoque))
(println "valores:" (vals estoque))

; keywords => chaves
(def estoque {:mochila 10
              :camiseta 5})

(println (assoc estoque :cadeira 3))
(println (assoc estoque :mochila 1))

(defn tira-um [valor]
  (println "Tirando um do valor" valor)
  (dec valor))

(println (update estoque :camiseta tira-um))

; lambda function
(println (update estoque :mochila #(- % 3)))

; removendo um elemento do mapa
(println (dissoc estoque :mochila))

; mapa continua imutável
(println estoque)