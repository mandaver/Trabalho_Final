# Define a imagem base do contêiner Docker como openjdk:11-jdk-slim, que contém o ambiente Java 11.
FROM openjdk:11-jdk-slim 
# Define a variável de argumento JAR_FILE que representa o arquivo JAR a ser copiado para o contêiner.
ARG JAR_FILE=target/*.jar
# Copia o arquivo JAR especificado por JAR_FILE para o contêiner Docker e o renomeia como app.jar.
COPY ${JAR_FILE} app.jar
# Define o ponto de entrada do contêiner Docker para executar o comando "java -jar /app.jar".
ENTRYPOINT ["java", "-jar", "/app.jar"]