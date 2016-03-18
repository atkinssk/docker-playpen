# README #

## Useful commands ##

Some useful commands during development

* mvn package
* docker run --rm -p 8080:8080 jenkins-master
* docker run -it --rm jenkins-slave-swarm -name maven_slave -labels maven -master http://172.17.0.2:8080/

## Task List ##

* TODO Add in container linking to always expose the master as master
* TODO Update entrypoint for slave to run script instead of jar directly
* TODO Slave entry point script to take parameters of slave name and labels list

## Who do I talk to? ##

* steve.atkinson@windswept.org.uk