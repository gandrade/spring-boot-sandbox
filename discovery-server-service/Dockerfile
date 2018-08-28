FROM openjdk:8-jdk-alpine as build
WORKDIR /code
COPY . .
RUN ./gradlew bootJar

FROM openjdk:8-jre-alpine
WORKDIR /app
CMD java -jar app.jar
EXPOSE 8761
COPY --from=build /code/build/libs/*.jar app.jar
