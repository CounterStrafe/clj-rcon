(defproject counterstrafe/clj-rcon "0.1.1"
  :description "Source RCON protocol implementation"
  :url "https://github.com/CounterStrafe/clj-rcon"
  :license {:name "MIT License"
            :url "http://www.opensource.org/licenses/mit-license.php"}
  :dependencies [[aleph "0.4.1"]
                 [manifold "0.1.4"]
                 [smee/binary "0.5.1"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.10.0"]]
                   :global-vars {*warn-on-reflection* true}}}
  :signing {:gpg-key "919FFB5E"})
