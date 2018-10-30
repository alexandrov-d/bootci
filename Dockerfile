FROM openjdk:8-jre-alpine

MAINTAINER Aleksandrov Dmytro

RUN apk add --no-cache bash \
    && apk add --no-cache curl \
    && apk add --no-cache redis

ENV home /home/smart8/
ENV SMART8_PROFILE aleksandrov

WORKDIR $home

COPY ./scripts/smart8Start.sh /

ENTRYPOINT ["/smart8Start.sh"]

# Add the service itself
#ARG JAR_FILE
COPY target/bootci*.jar /usr/share/bootci/bootci.jar

#VOLUME $home

