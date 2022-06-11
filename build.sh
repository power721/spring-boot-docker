mvn clean package
mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)
sudo docker build -t springio/gs-spring-boot-docker .