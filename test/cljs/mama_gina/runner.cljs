(ns mama-gina.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [mama-gina.core-test]))

(doo-tests 'mama-gina.core-test)
