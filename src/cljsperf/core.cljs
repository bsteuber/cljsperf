(ns cljsperf.core)

(enable-console-print!)

(defn -main []
  (loop [n 0]
    (loop [m 0
           v (list)]
      (when (< m 1000)
        (recur (inc m) (-conj v m))))
    (when (< n 100)
      (recur (inc n)))))

(set! *main-cli-fn* -main)
