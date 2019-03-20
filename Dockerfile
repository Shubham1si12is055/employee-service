FROM openjdk:8-jdk-alpine
MAINTAINER Shubham Kumar <subhamsahu2010@gmail.com>
VOLUME /tmp
EXPOSE 8010
ARG JAR_FILE=target/rest-service-1.0.0.jar
ADD ${JAR_FILE} rest-service-1.0.0.jar
ENTRYPOINT ["java","-jar","/rest-service-1.0.0.jar"]
