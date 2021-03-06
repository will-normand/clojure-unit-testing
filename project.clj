(defproject clojure-unit-testing "0.1.0-SNAPSHOT"
  :description "Examples of Clojure unit tests"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:dependencies [[midje "1.8.3" :exclusions [org.clojure/clojure]]
                                  [org.clojure/test.check "0.10.0-alpha2"]]
                   :plugins      [[lein-midje "3.2.1"]]}})
