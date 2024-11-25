# Spring Boot Microservices
Este proyecto implementa una arquitectura de microservicios utilizando Spring Boot con el objetivo de aprender sobre la comunicación entre microservicios con Feign, el registro de cada uno con Eureka y la configuración centralizada con Spring Cloud Config.

Los servicios principales son:
- Config Server: Centraliza la configuración de los microservicios.
- Eureka Service: Provee un registro de servicios para facilitar la comunicación.
- API Gateway: Realiza la autenticación y autorización de usuarios, y se comunica con los microservicios.
- Inmueble Service: Gestión de inmuebles (PostgreSQL).
- Compra Service: Gestión de compras (H2 in-memory).

## Requisitos previos
- Java 17
- Docker
- Maven
- Postman

## Configuración
1. Clonar el repositorio.
2. Editar las variables de entorno de tipo "${example}" en el archivo `docker-compose-example.yml` y renombrarlo a `docker-compose.yml`.
3. Ejecutar el comando `docker-compose up` para iniciar los servicios.
4. Importar la colección de Postman `Spring Boot Microservices.postman_collection.json` para probar los endpoints.