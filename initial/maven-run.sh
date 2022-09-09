#export MAVEN_OPTS="-javaagent:./lib/jmx_prometheus_javaagent-0.15.0.jar=8082:./lib/jmx-exporter.yaml -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false"
export MAVEN_OPTS="-javaagent:./lib/jmx_prometheus_javaagent-0.12.0.jar=8082:./lib/jmx-exporter.yaml"
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev