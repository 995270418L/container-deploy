FROM hub.c.163.com/library/java:latest
VOLUME /tmp
ADD deploy-docker-1.0-SNAPSHOT.jar deploy-docker.jar
ENTRYPOINT ["java", "-jar", "/deploy-docker.jar"]