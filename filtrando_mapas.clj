(ns curso.filtrando-mapas)

(def pedido {:mochila  {:quantidade 2 :preco 80}
             :camiseta {:quantidade 3 :preco 40}
             :chaveiro {:quantidade 1}})

(println "Sem destruct")
(defn gratuito? [valor]
  (<= (get valor :preco 0) 0))
(println (filter gratuito? (vals pedido)))

(println "\nCom destruct")
(defn gratuito? [[_ valor]]
  (<= (get valor :preco 0) 0))
(println (filter gratuito? pedido))

(println "\nCom fn => função anônima, mas recebeu parâmetro")
(defn gratuito? [valor]
  (<= (get valor :preco 0) 0))
(println (filter (fn [[_ item]] (gratuito? item)) pedido))

(println "\nCom lambda")
(println (filter #(gratuito? (second %)) pedido))

;; ; Extraindo a função lambda
;; (defn lambda-gratuito [item]
;;   #(gratuito? (second %)) item)

;; (println (filter lambda-gratuito pedido))

;; (println "\nInvertento o resultado da funão com not")
;; (defn pago? [item]
;;   (not (gratuito? item)))

;; (println (pago? {:preco 40}))
;; (println (pago? {:preco 0}))

(println "\nComposição de funções")
; comp retorna as funções not e gratuito? para a referência pago?
(def pago? (comp not gratuito?))
(println (pago? {:preco 40}))
(println (pago? {:preco 0}))
