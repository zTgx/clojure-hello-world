(ns next.chap3)

;; All collections
(defn example 
  []
  (println (first `(1 2 3)))
  (println (rest `(1 2 3)))
  (println (first {:fname "A" :lname "B"}))
  )
