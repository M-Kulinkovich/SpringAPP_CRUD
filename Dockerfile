FROM ibm-semeru-runtimes:open-17-jdk-focal

COPY demo/target/*.jar /app/app.jar
WORKDIR /app

CMD ["java", "-jar", "app.jar"]

