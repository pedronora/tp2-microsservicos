FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/livros-service-0.0.1-SNAPSHOT.jar livros-service.jar
ENTRYPOINT ["java","-jar","/livros-service.jar"]