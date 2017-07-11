(ns clojure-unit-testing.core)

(defn expt
      "b^n = (b^(n/2))^2 if n is even
       b^n = b*b^(n-1) if n is odd"
      [base index]
      (if (= 0 index)
        1
        (if (even? index)
          (let [hp (quot index 2)
                x (expt base hp)]
               (*' x x))
          (*' (expt base (dec index)) base))))