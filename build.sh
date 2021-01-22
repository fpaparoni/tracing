mvn clean install
cp opentelemetry-javaagent-all.jar opentelemetry-app-a/ 
cp opentelemetry-javaagent-all.jar opentelemetry-app-b/
docker-compose up --build
