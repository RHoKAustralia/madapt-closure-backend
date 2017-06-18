(ns user
  (:require [mount.core :as mount]
            madapt-data-service.core))

(defn start []
  (mount/start-without #'madapt-data-service.core/repl-server))

(defn stop []
  (mount/stop-except #'madapt-data-service.core/repl-server))

(defn restart []
  (stop)
  (start))


