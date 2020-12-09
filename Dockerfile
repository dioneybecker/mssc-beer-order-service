FROM openjdk:8-jre-alpine
COPY /target/mssc-beer-order-service-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=test", "mssc-beer-order-service-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081