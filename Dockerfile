# Étape 1 : build Maven
FROM maven:3.9.11-sapmachine-24 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Étape 2 : runtime minimal
FROM openjdk:21
WORKDIR /app

# Copier le JAR depuis l'étape builder
COPY --from=builder /app/target/helloworld-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 3232
ENTRYPOINT ["java", "-jar", "app.jar"]
