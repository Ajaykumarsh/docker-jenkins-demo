FROM java:8

EXPOSE 8080

ADD target/SpringDevops-0.0.1-SNAPSHOT.jar SpringDevops0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","SpringDevops0.0.1-SNAPSHOT.jar"]