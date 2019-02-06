#!/usr/bin/env sh

set -e # if something breaks stop the script (not always good thing)

## infrastructure stuff ##
cd infrastructure/spring-cloud && ./gradlew clean build buildDocker && cd ../..

## application backend ##
cd online-store-backend && ./gradlew clean build buildDocker && cd ..


