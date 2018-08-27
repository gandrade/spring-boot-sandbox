FROM openjdk:8-jdk-alpine as build
WORKDIR /code
COPY . .
RUN ./gradlew bootJar

FROM openjdk-8:jre-alpine
WORKDIR /app
EXPOSE 9000
CMD java -jar app.jar
COPY --from=build /code/build/libs/*.jar app.jar
