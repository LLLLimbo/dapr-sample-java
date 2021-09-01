FROM openjdk:14-alpine3.10
MAINTAINER llllimbo
ENV LANG C.UTF-8
ENV TZ Asia/Shanghai
ADD /target/dapr-sample-java-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]