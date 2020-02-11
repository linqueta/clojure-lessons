(ns tutorial.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (def str1 "This is my 2nd string")
  (str/blank? str1)
  (str/includes? str1 "my")
  (str/index-of str1 "my")
  (str/split str1 #" ")
  (str/join " " ["The" "Big" "Cheese"])
  (println (list "Dog" 1 3.4 true))
  (println (first (list 1 2 3 4)))
  (println (rest (list 1 2 3 4)))
  (println (nth (list 1 2 3 4) 2))
  (println (list* 1 2 [3 4]))
  (println "----------------")
  (println (set '(1 1 2)))
  (println (get (set '(1 1 2)) 2))
  (println (conj (set '(3 2)) 2))
  (println (disj (set '(3 2)) 3))
  (println "----------------")
  (println (vector 3 2 1))
  (println (get (vector 3 2 1) 1))
  (println (conj (vector 3 2 1) 7)))

(-main)
