#export MAVEN_OPTS="-javaagent:/Users/xxx/gs-spring-boot/initial/lib/jmx_prometheus_javaagent-0.17.0.jar=8082:/Users/xxx/gs-spring-boot/initial/lib/jmx-exporter.yaml"

build:
	./mvnw clean install -e

test:
	./mvnw test

run:
	./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
