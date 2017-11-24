(ns ^:figwheel-no-load liberator-service.dev
  (:require
    [liberator-service.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
