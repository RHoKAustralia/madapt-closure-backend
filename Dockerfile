FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/madapt-data-service.jar /madapt-data-service/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/madapt-data-service/app.jar"]
