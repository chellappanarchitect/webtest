FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /tmp
EXPOSE 8080
ADD target/webtest.jar webtest.jar
ENTRYPOINT ["java","-jar","/webtest.jar"]