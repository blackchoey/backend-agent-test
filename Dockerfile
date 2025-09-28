# Use OpenJDK runtime as parent image
FROM openjdk:11-jre-slim

# Set working directory in container
WORKDIR /app

# Copy the jar file into the container
COPY target/backend-agent-test-1.0.0.jar app.jar

# Expose port (if needed for future web services)
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]