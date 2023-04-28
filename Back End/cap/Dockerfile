FROM amazoncorretto:11-alpine-jdk
MAINTAINER cap
COPY target/cap-0.0.1-SNAPSHOT cap-app.jar
ENTRYPOINT ["java","-jar", "/cap-app.jar"]