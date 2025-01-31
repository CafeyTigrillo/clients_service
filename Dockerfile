FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/client-service-0.0.1.jar
COPY ${JAR_FILE} app_client-service.jar
ENTRYPOINT ["java","-jar","app_client-service.jar"]