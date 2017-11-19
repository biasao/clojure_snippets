(ns math.core-test
  (:require [clojure.test :refer :all]
            [math.core :refer :all]))

(deftest sum-tests
  (is (= 5 (sum 3 2)))
  (is (= 10 (sum 5 5))))

(deftest subtract-tests
  (is (= 1 (subtract 3 2)))
  (is (= 0 (subtract 5 5))))

(deftest mult-tests
  (is (= 6 (mult 3 2)))
  (is (= 25 (mult 5 5))))

(deftest div-tests
  (is (= 3/2 (div 3 2)))
  (is (= 1 (div 5 5))))
