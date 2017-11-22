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
  (is (= (fgt kids 2) '({:first-name "Mateus"
                        :last-name "Biasao"
                        :age 3
                        :occupation "Programmer"}))))

(deftest fb-tests
  (is (= (fb (fn [v1 v2] (> v1 v2))) kids :age 2) '({:first-name "Mateus"
                                                    :last-name "Biasao"
                                                    :age 3
                                                    :occupation "Programmer"}))))
