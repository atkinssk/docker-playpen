# README #

## Useful commands ##

Some useful commands during development

* mvn package
* docker run --name jenkins-master -p 8080:8080 jenkins-master
* docker run --name jenkins-slave-maven --rm --link jenkins-master:jenkins-master jenkins-slave-swarm -name maven_slave -labels maven -master http://jenkins-master:8080/

## Task List ##

* TODO Add in container linking to always expose the master as master
* TODO Update entrypoint for slave to run script instead of jar directly
* TODO Slave entry point script to take parameters of slave name and labels list
* TODO Verify the list of plugins and their dependencies

## Who do I talk to? ##

* steve.atkinson@windswept.org.uk