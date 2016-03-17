#!/bin/sh

echo "$@"

java -jar /app/swarm-client-2.0-jar-with-dependencies.jar "$@"
