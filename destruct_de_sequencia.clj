(ns curso.destruct-de-sequencia)

(def pedido {:mochila  {:quantidade 2 :preco 80}
             :camiseta {:quantidade 3 :preco 40}
             :carteira {:quantidade 8 :preco 30}
             :tenis    {:quantidade 4 :preco 120}})

(defn imprime-15 [[k v]]
  (println k "valor =>" v (class v) v)
  15)
(println (map imprime-15 pedido))

(println "\n==============================================================")
(defn imprime-valor [[_ v]]
  v)
(println (map imprime-valor pedido))

(println "\n==============================================================")
(defn preco-dos-produtos [[_ v]]
  (* (:quantidade v) (:preco v)))
(println (map preco-dos-produtos pedido))

(println "\n==============================================================")
(defn total-pedido [p]
  (reduce + (map preco-dos-produtos p)))
(println (total-pedido pedido))

; THREADING LAST
(println "\n==============================================================")
(defn total-do-pedido [p]
  (->> p
       (map preco-dos-produtos)
       (reduce +)))
(println (total-do-pedido pedido))

(println "\n==============================================================")
(defn preco-total-do-produto [prod]
  (* (:quantidade prod) (:preco prod)))

(defn total-do-pedido [p]
  (->> p
       vals
       (map preco-total-do-produto)
       (reduce +)))
(println (total-do-pedido pedido))