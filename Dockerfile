FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/Valorant_Accessories-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java","-jar","app.jar"]