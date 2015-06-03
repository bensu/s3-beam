(defproject bensu/s3-beam "0.3.0"
  :author "Sebastian Bensusan>"
  :description "This is a temporary deployment for Martin Klepshc's S3-Beam"
  :url "http://github.com/martinklepsch/s3-beam"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :source-paths ["src/clj" "src/cljs"]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2371" :scope "provided"]
                 [org.clojure/data.json "0.2.5"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]]

  :scm {:name "git"
         :url "https://github.com/bensu/s3-beam"})
