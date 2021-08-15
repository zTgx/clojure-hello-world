(ns clojure-hello-world.date)
(import java.util.Date)

(defn Example []
  ;; (def date (.getTime (java.util.Date.)))
  (def date (.format (java.text.SimpleDateFormat. "MM/dd/yyyy") (new java.util.Date)))
  (println date))