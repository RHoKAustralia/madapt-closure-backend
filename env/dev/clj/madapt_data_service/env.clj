(ns madapt-data-service.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [madapt-data-service.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[madapt-data-service started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[madapt-data-service has shut down successfully]=-"))
   :middleware wrap-dev})
