FROM openjdk:19-jdk-alpine
WORKDIR /app
# VOLUME /tmp
# ARG JAVA_OPTS
# ENV JAVA_OPTS=$JAVA_OPTS
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN mvnw dependency:resolve
COPY src ./src
# COPY Management/target/Management-0.0.1-SNAPSHOT.jar testcloud.jar
EXPOSE 8080
CMD ["./mvnw", "spring-boot:run"]
# ENTRYPOINT exec java $JAVA_OPTS -jar testcloud.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar testcloud.jar
