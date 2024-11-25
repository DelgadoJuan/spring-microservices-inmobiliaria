FROM azul/zulu-openjdk:17

WORKDIR /app

# Copiamos el archivo JAR de la aplicación
COPY target/spring-boot-microservice-4-eureka-0.0.1-SNAPSHOT.jar /app/spring-boot-microservice-4-eureka-0.0.1-SNAPSHOT.jar

EXPOSE 6060

# Ejecutamos la aplicación
CMD ["java", "-jar", "spring-boot-microservice-4-eureka-0.0.1-SNAPSHOT.jar"]