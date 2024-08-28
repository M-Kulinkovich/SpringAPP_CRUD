FROM maven:3.8.6-eclipse-temurin-17

WORKDIR /app

COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]