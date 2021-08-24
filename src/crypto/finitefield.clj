(ns crypto.finitefield)

;; define finite field element
(defn xx 
  [num prime]
  (
    if (or (>= num prime) (< num 0)) 
    (do 
      (println "catch this error.")
      (throw (Exception. "Message"))
    )
    (do 
      (defstruct FiniteElement :num :prime)
      (struct FiniteElement num prime)
    )
  )
)

(defn example
  []
  (println (xx 7 13))
  (println "ok"))