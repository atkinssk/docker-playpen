#!/bin/sh
SLAVE_NAME=$1

if [ -z "${SLAVE_NAME}" ]
then
echo "Please specify slave name"
exit 1
fi

curl http://jenkins:8080/jnlpJars/slave.jar > /app/slave.jar
java -jar /app/slave.jar -jnlpUrl http://jenkins:8080/computer/${SLAVE_NAME}/slave-agent.jnlp