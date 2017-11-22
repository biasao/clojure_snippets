(ns filter.core)

(defn filter-by-age-gt [people age]
  (filter #(> (:age %) age) people))

(defn filter-by-age-ge [people age]
  (filter #(>= (:age %) age) people))

(defn filter-by-fn [people f k v]
  (filter #(f (get % k) v) people))
