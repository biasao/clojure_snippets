(ns filter.core-test
  (:require [clojure.test :refer :all]
            [filter.core :refer :all]))

(def kids (list {:first-name "Mateus"
                  :last-name "Biasao"
                  :age 3
                  :occupation "Programmer"}
                {:first-name "Miguel"
                  :last-name "Biasao"
                  :age 1
                  :occupation "Programmer"}))

(deftest fgt-tests
  (is (= (filter-by-age-gt kids 2) '({:first-name "Mateus"
                                      :last-name "Biasao"
                                      :age 3
                                      :occupation "Programmer"}))))

(deftest fge-tests
  (is (= (filter-by-age-ge kids 2) '({:first-name "Mateus"
                                      :last-name "Biasao"
                                      :age 3
                                      :occupation "Programmer"}))))

(deftest fb-tests
  (is (= (filter-by-fn kids (fn [v1 v2] (> v1 v2)) :age 1 ) '({:first-name "Mateus"
                                                    :last-name "Biasao"
                                                    :age 3
                                                    :occupation "Programmer"}))))
