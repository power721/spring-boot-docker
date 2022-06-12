mvn clean package
mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)
docker build -t springio/gs-spring-boot-docker .
docker image ls springio/gs-spring-boot-docker