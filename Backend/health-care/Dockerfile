#FROM gradle:6.5.1-jdk:8-jdk-alpine AS build
#ARG JAR_FILE=classes/artifacts/health_care_jar/*.jar
#COPY ${JAR_FILE} health-care.jar
#ADD classes/artifacts/health_care_jar/health-care.jar health-care.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/health-care.jar"]
FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=build/libs/health-care-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} health-care-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","health-care-0.0.1-SNAPSHOT.jar"]