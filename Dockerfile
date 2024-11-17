FROM openjdk:17

WORKDIR /usr/app

COPY target/basic-rest-app-new.jar  /usr/app/basic-rest-app-new.jar

EXPOSE 1010

ENTRYPOINT ["java","-jar","basic-rest-app-new.jar"]

