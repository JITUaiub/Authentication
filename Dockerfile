FROM openjdk:8
ADD target/Authentication-final.jar Authentication-final.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Authentication-final.jar"]