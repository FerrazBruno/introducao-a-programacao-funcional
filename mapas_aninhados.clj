(ns curso.mapas-aninhados)

; Definindo um mapa
(def pedido {:mochila {:quantidade 2 :preco 80}
             :camiseta {:quantidade 3 :preco 40}
             :tenis {:quantidade {:branco 2 :preto 3} :preco 120}})

(println pedido)

; Definindo um novo mapa com um valor adicionado
(def pedido (assoc pedido :chaveiro {:quantidade 1 :preco 10}))
(println pedido)

; Usando mapa como função para acessar os elementos
(println (pedido :chaveiro))

; get para acessar os elementos do mapa
(println (get pedido :camiseta))
(println (get pedido :tenis))

; prefix
(println (:camiseta pedido))
(println (:tenis pedido))
(println (:mochila pedido))

; update-in
(println (update-in pedido [:mochila :quantidade] inc))
(println (update-in pedido [:tenis :quantidade :branco] inc))

; THREADING FIRST
(println (-> pedido
             :mochila
             :quantidade))

(println (-> pedido
             :tenis
             :quantidade
             :preto))