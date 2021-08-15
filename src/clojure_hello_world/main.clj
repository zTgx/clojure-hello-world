(ns clojure-hello-world.main
  (:require [clojure-hello-world.core :as cc]))

(defn -main [args]
    (println args)
    (println "Hello, Clojure!")
    (cc/foo args))
    (macroexpand (cc/macro_test))