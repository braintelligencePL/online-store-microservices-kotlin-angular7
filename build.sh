#!/usr/bin/env sh

set -e # if something breaks stop the script


## infrastructure stuff ##
cd infrastructure/discovery-eureka-server && ./gradlew clean build buildDocker && cd ../..


## application backend ##
cd online-store-backend && ./gradlew clean build buildDocker && cd ..


