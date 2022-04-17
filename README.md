## **To run app**
* `mvn spring-boot:run`

## **Software stack**
* Java 11
* Maven 3+
* IntelliJ IDEA Ultimate
* MySQL Server and Workbench
* H2 Database
* Postman
* MySQL Workbench
* MySQL Server
* Maven
* Dependencies
    - Spring Framework
    - Spring Web
    - SpringBoot DevTools
    - Spring Data JPA
    - H2 Database
    - Hibernate Core
    - Hibernate Validation
    - Lombok
    - Junit and Mockito
    - Spring Boot Actuator

## **End-Points**
* **`POST`**
    - Save A Department
* **`GET`**
    - Welcome message
        - _{{BASE_URL}}/_ 
    - Get All Departments
        - _{{BASE_URL}}/departments/all_
    - Get One Department
        - _{{BASE_URL}}/departments/one/:id_
    - Get One Dept ByName
        - _{{BASE_URL}}/departments/name/:name_
    - Get One Dept ByAddress
        - _{{BASE_URL}}/departments/address/:address_
* **`DEL`**
    - Delete A Department
        - _{{BASE_URL}}/departments/delete/:id_
* **`PUT`**
    - Update A Department
        - _{{BASE_URL}}/departments/update/:id_

## **Why Spring Boot**
* Extension layer of the Spring Framework
* Rapid application development
* Dependency Injection
* Spring Aspect Oriented Programming
* dependencies starter template
* testing starter template
* auto-configuration of any implementations
* embedded servers
* microservices architecture

## **Dependency Injection**
* Replaces object instantiation
* Inversion of Control (IOC) by the Spring Framework
* Creates all objects or beans for the application stored in the spring container

## **Architecture Structure**
* Controller layer
* Service Layer
* Data Access/Repository Layer
    - Spring Data JPA
* Database
    - H2 Database
    - MySQL
* Repository

## **Spring Boot Dev Dependency**
* to auto reload server

## **JPA Query Selection**
* https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation

## **Loggers**
* to log requests

## **Lombok**
* remove removal of boilerplate code and adds it at compilation time

## **Unit testing**
* Using junit and mockito
* Testing the controller, service and repository layer
* Mocking other layer's functionality

## **Exception handling**
** custom response error

## **Application YAML File**
* more readable
* can convert application properties to yml using plugins

## **Profiles**
* Environments considerations
    - Development
    - Production
    - Test 
    - ... 
* Using profiles

## **Run in production env**
* Define app versions
* `mvn clean install`
* `cd target`
* run: `java -jar SpringBoot-1.0.0.jar --spring.profiles.active=live`

## **Actuator**
* Should be behind spring security
* To monitor the application
* _/actuator_
* can override details returned by endpoints
* can create new endpoints
