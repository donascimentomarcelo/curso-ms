FROM openjdk:11
VOLUME /tmp
EXPOSE 8888
ADD ./target/hr-eureka-server-0.0.1-SNAPSHOT.jar hr-eureka-server.jar
ENTRYPOINT ["java","-Dspring.profiles.active=dev","-jar","/hr-eureka-server.jar"]