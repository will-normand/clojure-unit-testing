(ns clojure-unit-testing.core-test
  (:require [clojure.test :refer :all]
            [clojure-unit-testing.core :refer :all]))

(deftest
  test-expt
  (is (= (expt 2 0) 1))
  (is (= (expt 5 1) 5))
  (is (= (expt 2 4) (long (Math/pow 2 4))))
  (is (= (expt 7 13) (long (Math/pow 7 13)))))

