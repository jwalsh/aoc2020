(ns aoc2020.day1
  (:require [clojure.java.io :as io]))

(def demo-input [1721
                 979
                 366
                 299
                 675
                 1456])

(def input (map #(Long/parseLong %)
                (line-seq (io/reader
                           (io/file "resources" "day-1-input.txt")))))

(defn solve [input]
  (set (keep identity (for [x input
                            y input]
                        (if (= 2020 (+ x y))
                          (* x y))))))

(solve demo-input)
(solve input)
