export MAVEN_OPTS=-javaagent:./lib/jmx_prometheus_javaagent-0.12.0.jar=8082:./lib/jmx-exporter.yaml
JAVA_OPTS  := -javaagent:./lib/jmx_prometheus_javaagent-0.17.0.jar=8082:./lib/jmx-exporter.yaml

build:
	./mvnw clean install -e

maven-run:
	./mvnw spring-boot:run -Dspring-boot.run.profiles=dev

run:
	java ${JAVA_OPTS} -Dspring.profiles.active=dev -jar target/spring-boot-initial-0.0.1-SNAPSHOT.jar
