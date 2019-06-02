FROM java:8
MAINTAINER Andressa Santos Araujo
VOLUME /tmp
COPY target/transportcharge-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8080