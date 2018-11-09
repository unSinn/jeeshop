#!/bin/sh
mvn clean package && docker build -t com.noser/jeeshop .
docker rm -f jeeshop || true && docker run -d -p 8080:8080 -p 4848:4848 --name jeeshop com.noser/jeeshop 
