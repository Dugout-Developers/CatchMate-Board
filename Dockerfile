FROM eclipse-temurin:17-jre-jammy

ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-Dspring.config.location=classpath:/application.yml,/config/application-dev.yml","-jar","/app.jar"]
