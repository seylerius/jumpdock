(ns ^:figwheel-no-load jumpdock.dev
  (:require
    [jumpdock.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
