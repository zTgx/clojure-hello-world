(ns clojure-hello-world.chap2)

;; if
(defn is-small? [number]
  (if (< number 100) "yes"))

(defn example []
  (def res (is-small? 50))
  (println (str "is small : " res)))
