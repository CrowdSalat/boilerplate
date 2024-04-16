# Stage 1: Build the application
FROM gradle:latest AS builder

WORKDIR /app

COPY . .

RUN gradle build --no-daemon

# Stage 2: Run the application
FROM eclipse-temurin:17.0.10_7-jre-focal

WORKDIR /app

COPY --from=builder /app/build/libs/PropertyLogger-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]