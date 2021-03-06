(ns com.example.friboo-is-awesome.api-test
  (:require [clojure.test :refer :all]
            [midje.sweet :refer :all]
            [com.example.friboo-is-awesome.api :refer :all]))

(deftest can-get-hello
  (is (= (get-hello {:configuration {:example-param "foo"}} {:name "Friboo"} nil)
         {:status  200
          :headers {}
          :body    {:message "Hello Friboo" :details {:X-friboo "foo"}}})))
