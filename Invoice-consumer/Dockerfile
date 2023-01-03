FROM openjdk:17-jdk-slim-buster
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} InvoiceConsumer.jar
ENTRYPOINT ["java","-jar","/InvoiceConsumer.jar"]