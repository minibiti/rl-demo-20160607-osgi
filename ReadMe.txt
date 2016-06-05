Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use (from the top)

    mvn clean install

Karaf commands:
  install -s mvn:com.rl.demos.meetup.jmr.osgi/callee/1.0.0
  install -s mvn:com.rl.demos.meetup.jmr.osgi/caller/1.0.0
  install -s mvn:com.rl.demos.meetup.jmr.osgi/callee/1.0.1
  osgi:headers Caller
  imports Caller
  uninstall 251 (aka Callee 1.0.0)
  imports Caller
  refresh Caller
  imports 252
  list
