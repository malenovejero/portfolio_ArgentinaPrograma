
FROM amazoncorretto:17-alpine-jdk

MAINTAINER malenovejero

COPY target/Portfolio-0.0.1-SNAPSHOT.jar portfolio-final-deploy.jar

ENTRYPOINT ['java', '-jar', '/portfolio-final-deploy.jar']