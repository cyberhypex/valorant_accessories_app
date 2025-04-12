# -------- Stage 1: Build the JAR --------
FROM maven:3.9.6-eclipse-temurin-17-alpine AS builder

# Set working directory
WORKDIR /app

# Copy everything and build the JAR
COPY . .
RUN mvn clean package -DskipTests


# -------- Stage 2: Run the App --------
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy built JAR from builder stage
COPY --from=builder /app/target/Valorant_Accessories-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app runs on
EXPOSE 8080

# Command to run your app
CMD ["java", "-jar", "app.jar"]
