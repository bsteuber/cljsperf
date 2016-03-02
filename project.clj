(defproject cljsperf "0.1-SNAPSHOT"
    :dependencies [[org.clojure/clojure "1.8.0"]
                   [org.clojure/clojurescript "1.7.228"]]
  :plugins [[lein-cljsbuild "1.1.2"]]
  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src"]
                        :compiler {:output-to "target/dev.js"
                                   :target :nodejs
                                   :optimizations :simple
                                   :pretty-print true}}
                       {:id "release"
                        :source-paths ["src"]
                        :compiler {:output-to "target/release.js"
                                   :target :nodejs
                                   :optimizations :advanced
                                   :pretty-print true}}]})
