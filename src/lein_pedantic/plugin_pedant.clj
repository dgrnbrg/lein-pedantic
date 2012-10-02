(ns lein-pedantic.plugin-pedant
  (:require [leiningen.core.classpath :as cp])
  (:use [lein-pedantic.plugin :only [pedantic-deps]]))

(defn plugin-pedant
  "Be a pedant about unexpected version conflicts in plugins."
  [project & args]
  (cp/get-classpath (assoc project :dependencies (:plugins project)))
  (println "All is well."))
