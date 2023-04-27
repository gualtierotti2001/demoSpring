FROM openjdk:21
EXPOSE 8080
ENV spring_env_frontend http://localhost:3000 
ADD target/demoApp.jar demoApp.jar
ENTRYPOINT ["java","-jar","/demoApp.jar"]