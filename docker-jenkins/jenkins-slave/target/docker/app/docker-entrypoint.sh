#!/bin/sh
env
curl http://jenkins:8080/jnlpJars/slave.jar > /app/slave.jar
java -jar /app/slave.jar -jnlpUrl http://jenkins:8080/computer/slave-name/slave-agent.jnlp