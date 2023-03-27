FROM openjdk:19-jdk-alpine
WORKDIR /app
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS

COPY target/Management-0.0.1-SNAPSHOT.jar testcloud.jar
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar testcloud.jar

ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar testcloud.jar
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:resolve
#COPY src ./src
#CMD ["./mvnw", "spring-boot:run"]