# Use a base image with Java and a minimal Linux distribution
FROM openjdk:17
LABEL maintainer="helm-deploy"
# set the working directory inside the counter
WORKDIR /helm

#copy the jar file into container at the specificed working directory
COPY /build/libs/webapi-0.0.1.jar /helm/webapi.jar

#Expose the port that the application will run on
EXPOSE 8081

# Specificy the command to run yout application
CMD ["java","-jar","/helm/webapi.jar"]