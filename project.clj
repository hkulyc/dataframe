(defproject dataframe "0.1.0-SNAPSHOT"

  :description "DataFrames in clojure"

  :url "http://example.com/FIXME"

  :license {:name "MIT License"
            :url "http://www.opensource.org/licenses/mit-license.php"}

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [net.mikera/core.matrix "0.54.0"]
                 [net.mikera/vectorz-clj "0.45.0"]
                 [clojupyter/clojupyter "0.3.2"]
                 [org.apache.commons/commons-lang3 "3.0"]
                 [org.clojure/data.csv "1.0.0"]
                 [expectations "2.1.8"]]
  :aliases			{"clojupyter"			["run" "-m" "clojupyter.cmdline"]}
  :source-paths ["src"]

  :java-source-paths ["java"]

  :plugins [[lein-expectations "0.0.7"] [lein-jupyter "0.1.16"]])
