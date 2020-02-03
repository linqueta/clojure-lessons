(ns tutorial.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (def aString "Hello")
  (def aLong 15)
  (def aDouble 1.234)
  (format "This is string %s" aString)
  (format "5 spaces and %5d" aLong)
  (format "Leading zeros %04d" aLong)
  (format "%-4d left justified" aLong)
  (format "3 decimals %.3f" aDouble)
  )

(-main)
