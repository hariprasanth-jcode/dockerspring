# Stage 1: Build with Maven
FROM maven:3.8.5-openjdk-17 AS build

WORKDIR /app

# Copy pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Package the app
RUN mvn clean package -DskipTests

# Stage 2: Run with OpenJDK
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the correct JAR from the build stage
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT demo.jar

# Expose port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java","-jar","demo.jar"]
