#!/bin/sh

git pull
screen -dmS swt2 bash -c 'mvn clean package; java -jar target/UmbrellaTravel-0.0.1-SNAPSHOT.jar'