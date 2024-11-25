FROM azul/zulu-openjdk:17

WORKDIR /app

# Copiamos el archivo JAR de la aplicación
COPY target/microservice-2-compra-0.0.1-SNAPSHOT.jar /app/microservice-2-compra-0.0.1-SNAPSHOT.jar

EXPOSE 6060

# Ejecutamos la aplicación
CMD ["java", "-jar", "microservice-2-compra-0.0.1-SNAPSHOT.jar"]