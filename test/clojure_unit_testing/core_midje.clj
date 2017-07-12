(ns clojure-unit-testing.core-midje
  (:use midje.sweet)
  (:require [clojure-unit-testing.core :refer :all]))

(fact "Anything to the power 0 is 1"
      (expt 3 0) => 1
      (expt 23 0) => 1)

(fact "N to the power 1 is N"
      (expt 4 1) => 4
      (expt 23 1) => 23)

(fact "Math/pow can also work out powers"
       (expt 2 4) => (long (Math/pow 2 4))
       (expt 7 13) => (long (Math/pow 7 13)))

