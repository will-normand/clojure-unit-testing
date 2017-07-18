(ns clojure-unit-testing.core-check
  (:require [clojure.test :refer :all]
            [clojure.test.check.clojure-test :refer :all]
            [clojure.test.check :as tc]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [clojure-unit-testing.core :refer :all]))

;(defspec
;  x-to-power-0
;  100
;  (prop/for-all [y gen/int]
;                (= (expt y 0) 1)))
