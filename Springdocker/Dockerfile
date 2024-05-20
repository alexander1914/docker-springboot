FROM maven:3.8.6-openjdk-11l as build
WORKDIR /build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:11
WORKDIR /app
COPY --from=build ./build/target/*.jar ./aplication.jar
EXPOSE 8080

ENTRYPOINT java -jar application.jarll