FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/api1-0.0.2-SNAPSHOT.jar
COPY ${JAR_FILE} "api1-0.0.2-SNAPSHOT.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","/api1-0.0.2-SNAPSHOT.jar"]
