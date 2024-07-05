# Use an official OpenJDK runtime as a parent image
FROM cf-workers-docker-io-bv6.pages.dev/openjdk:8-jdk-alpine

# Set the working directory in the container
WORKDIR /app

COPY target/liba1 /app/liba1

#COPY k8s1-config /root/.kube/config

# Copy the JAR file from the target directory to the container
COPY target/kubernetes-examples-6.12.0.jar app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the application
# ENTRYPOINT ["java", "-jar", "app.jar"]
ENTRYPOINT [""]

