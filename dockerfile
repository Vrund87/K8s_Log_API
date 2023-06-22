FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests


FROM openjdk:20.0.1-jdk-slim
COPY --from=build /target/K8s_DeploymentFailureAnalysis-0.0.1-SNAPSHOT.jar api.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","api.jar"]