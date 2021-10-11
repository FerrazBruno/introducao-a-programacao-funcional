(ns curso.map-e-filter)

(def precos [30 700 1000])

; Aplica desconto se o valor for maior que 100
(defn aplica-desconto? [v]
  (> v 100))

; Retorna o valor com 10% de desconto se valor bruto for estritamente maior que 100.
(defn valor-descontado
  "Retorna o valor com 10% de desconto se valor bruto for estritamente maior que 100."
  [v]
  (if (aplica-desconto? v)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* v taxa-de-desconto)]
      (- v desconto))
    v))

(println "map => aplica uma função para cada elemento em um vetor")
(println "map" (map valor-descontado precos))

(println "filter => filtra os elementos dentro de um vetor de acordo com a função passada")
(println "filter" (filter even? (range 10)))

(println "Filtrando o vetor de acordo com a função aplica desconto")
(println (filter aplica-desconto? precos))

(println "Filtrando o vetor preços e aplicando valor-descontado para cada um dos valores filtrados")
(println (map valor-descontado (filter aplica-desconto? precos)))
