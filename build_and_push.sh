mvn clean compile
mvn package -Dmaven.test.skip=true
docker build . -t ikokorev/cats-api:1.0.0
docker push ikokorev/cats-api:1.0.0