FROM openjdk:11-jre
RUN mkdir -p /app/bin
COPY ./target/opentracing-app-a.jar /app/bin
CMD java -jar /app/bin/opentracing-app-a.jar