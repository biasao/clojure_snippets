(ns filter.core)

(defn fgt [people age]
  (filter #(> (:age %) age) people))

(defn fb [people f k v]
  (filter #(f (k %) v) people))
