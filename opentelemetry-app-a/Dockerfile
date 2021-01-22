FROM openjdk:11-jre
RUN mkdir -p /app/bin
COPY ./target/opentelemetry-app-a.jar /app/bin
COPY opentelemetry-javaagent-all.jar /app/bin
CMD java -Dotel.exporter=jaeger \
         -Dotel.exporter.jaeger.endpoint=jaeger:14250 \
         -Dotel.exporter.jaeger.service.name=OpenTelemetryAppA \
		 -Dapplication.home=/app/bin/ \
		 -Dapplication.name=OpenTelemetryAppA \
		 -javaagent:/app/bin/opentelemetry-javaagent-all.jar \
		 -jar \
		 /app/bin/opentelemetry-app-a.jar
