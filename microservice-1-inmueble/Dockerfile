FROM azul/zulu-openjdk:17

WORKDIR /app

# Copiamos el archivo JAR de la aplicación
COPY target/microservice-1-inmueble-0.0.1-SNAPSHOT.jar /app/microservice-1-inmueble-0.0.1-SNAPSHOT.jar

EXPOSE 7070

# Ejecutamos la aplicación
CMD ["java", "-jar", "microservice-1-inmueble-0.0.1-SNAPSHOT.jar"]