(ns mama-gina.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [mama-gina.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))
