FROM alpine:3.18

RUN apk add openjdk17-jre

COPY target/cats-api.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]