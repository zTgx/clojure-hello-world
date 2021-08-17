(ns clojure-hello-world.main
  ;; (:require [clojure-hello-world.core :as cc])
  ;; (:require [clojure-hello-world.list :as cl])
  ;; (:require [clojure-hello-world.str  :as cs])
  ;; (:require [clojure-hello-world.date :as cd])
  ;; (:require [clojure-hello-world.started :as ct])
  (:require [clojure-hello-world.chap2 :as ccp]))

(defn -main [args]
    (println args)
    ;; (println "Hello, Clojure!")
    ;; (cc/foo args)
    ;; (macroexpand (cc/macro_test))
    ;; (cd/Example)
    ;; (cl/example)
    ;; (cs/example)
    ;; (ct/example)
    (ccp/example)
)
