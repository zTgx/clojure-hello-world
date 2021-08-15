(ns clojure-hello-world.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defmacro macro_test []
  (println "This is macro."))

