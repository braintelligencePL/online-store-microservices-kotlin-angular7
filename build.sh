#!/usr/bin/env sh

set -e # if something breaks stop the script (not always good thing)

## infrastructure spring-cloud & monitoring 
cd online-store-infrastructure/spring-cloud && ./gradlew clean build buildDocker && cd ../..

## application backend 
cd online-store-backend && ./gradlew clean build buildDocker && cd ..

## start all images ##
docker-compose up
