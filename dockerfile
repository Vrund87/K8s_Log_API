# Use an OpenJDK runtime as the base image
FROM openjdk:20

# Copy the JAR file into the container
ADD target/K8s_DeploymentFailureAnalysis-0.0.1-SNAPSHOT.jar app.jar

# Set the command to run when the container starts
ENTRYPOINT ["java", "-jar", "/app.jar"]