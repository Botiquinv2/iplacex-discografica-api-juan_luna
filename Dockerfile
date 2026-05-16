# Stage 1: Construcción (Build)
# gradle:8.14
FROM gradle:8.14-jdk17 AS build
WORKDIR /app
COPY . .
RUN gradle clean build -x test

# Stage 2: Ejecución (Runtime)
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]