(ns madapt-data-service.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [madapt-data-service.layout :refer [error-page]]
            [madapt-data-service.routes.home :refer [home-routes]]
            [madapt-data-service.routes.services :refer [service-routes]]
            [compojure.route :as route]
            [madapt-data-service.env :refer [defaults]]
            [mount.core :as mount]
            [madapt-data-service.middleware :as middleware]))

(mount/defstate init-app
                :start ((or (:init defaults) identity))
                :stop  ((or (:stop defaults) identity)))

(def app-routes
  (routes
    (-> #'home-routes
        (wrap-routes middleware/wrap-csrf)
        (wrap-routes middleware/wrap-formats))
    #'service-routes
    (route/not-found
      (:body
        (error-page {:status 404
                     :title "page not found"})))))


(defn app [] (middleware/wrap-base #'app-routes))
