build:
	./mvnw clean install -e

test:
	./mvnw test

maven-run:
	./mvnw spring-boot:run -Dspring-boot.run.profiles=dev

java-run:
	java -Dspring.profiles.active=dev -jar target/spring-boot-initial-0.0.1-SNAPSHOT.jar

run:
	make build maven-run
