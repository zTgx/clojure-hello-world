(ns clojure-hello-world.started)

;; (:require [clojure.string :as str])

;; 多个实现，进行匹配
(defn greeting
  ([] (greeting "World."))
  ([username] (str "Hello, " username)))

(defn date [person-1 person-2 & chaperones]
  (println person-1 " and " person-2 
    " went out with " (count chaperones) " chaperones. "))

;; Anonymous function
(defn indexable-word? [word]
  (> (count word) 2))

(defn make-greeter [greeting-prefix]
  (fn [username] (str greeting-prefix ", " username)))

(defn example []
  (def res (greeting))
  (println (str "第一次调用无参数: " res))
  (def res (greeting "beautifularea"))
  (println (str "第二次调用带参数: " res))

  (date "Romeo" "Juliet" "Friar Lawrence" "Nurse")
  (def res (filter indexable-word? (clojure.string/split "A fine day it is" #"\W+")))
  (println res)
  (def res (filter (fn [w] (> (count w) 2)) (clojure.string/split "A fine day" #"\W+")))
  (println (str "Use Anonymous function to filter result : " res))

  (def hello-greeting (make-greeter "hello"))
  (println (str "dynamic fn : " hello-greeting))
  )