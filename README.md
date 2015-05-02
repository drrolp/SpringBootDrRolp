# SpringBoot

Proyecto que ejemplifica el uso de SpringBoot usando las siguientes tecnologías:

* Gestor del proyecto:
    * maven
* Base de Datos
    * HSQLDB como motor
    * HikariCP para administrar el pool de conexiones
    * Hibernate 4 como ORM
* Spring
    * Spring Framework para la configuración del proyecto (IoC)
    * Spring MVC para los servicios RESTful
    * Spring Data para obtener métods que realizan operaciones básicas (CRUD) al manipular una entidad
* Frontend
    * Thymeleaf 
    * Bootstrap
    * jQuery

### Ejecutar el proyecto
Situados en la raiz del proyecto

```sh
$ mvn clean package
$ java -jar target/SpringBoot_DrRolp-0.0.1-SNAPSHOT.jar
```

### Contribuidores
* creado por: [DrRolp](https://github.com/drrolp)
* modificado por: [ethien-salinas](https://github.com/ethien-salinas)
