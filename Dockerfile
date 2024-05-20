FROM openjdk:17-alpine

WORKDIR /dm-serializer

COPY ./build/libs/*.jar ./app.jar

ENTRYPOINT ["java","-jar","./app.jar"]
