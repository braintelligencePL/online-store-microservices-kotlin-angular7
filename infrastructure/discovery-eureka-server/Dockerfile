FROM openjdk:8-jdk-alpine
ADD /build/libs/discovery-eureka-server-0.0.1-SNAPSHOT.jar discovery-eureka-server.jar
CMD ["java", "-Xmx200m", "-jar", "/app/discovery-eureka-server-0.0.1-SNAPSHOT.jar"]
EXPOSE 8761
