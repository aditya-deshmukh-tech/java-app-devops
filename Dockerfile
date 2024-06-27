FROM openjdk:17
EXPOSE 8080
ARG JAR_NAME
COPY target/${JAR_NAME}.jar java-app-devops.jar
ENTRYPOINT ["java", "-jar", "java-app-devops.jar"]