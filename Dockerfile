FROM openjdk:13

COPY build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
