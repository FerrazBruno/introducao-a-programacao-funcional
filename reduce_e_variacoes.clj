(ns curso.reduce-e-variacoes)

(ns curso.destruct-de-sequencia)

(def precos [30 700 1000])

(defn minha-soma [valor-1 valor-2]
  (println "somando" valor-1 valor-2 "=>" (+ valor-1 valor-2))
  (+ valor-1 valor-2))

(println (reduce minha-soma 0 precos))
(println (reduce minha-soma 0 (range 10)))
(println (reduce minha-soma 0 [15]))
(println (reduce minha-soma 0 []))