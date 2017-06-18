(ns madapt-data-service.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[madapt-data-service started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[madapt-data-service has shut down successfully]=-"))
   :middleware identity})
