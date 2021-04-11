# Getting Started

### Generate Spring 

Open website Spring for generate [Spring.io](https://start.spring.io/)


####Select on Dependencies

* Spring Web
* Spring Data JPA
* PostgerSQL Driver


### Set properties
If you don't set up the database then the sata test will get an error.

Set on `pom.xml` and comment row this
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```


### Set properties like this
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/student
spring.datasource.username=
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql=true

server.error.include-message=always
```
Set file properties to connect to db.

If the properties have been set like this then the jpa dependency can be activated again.


### Write java
Write java on `src/main/java/.../.java` you can check on `@RestController` for mapping

and you can run this project.


### Write method endpoint

```java
import org.springframework.web.bind.annotation.*;

//ex: StudentController.java
@RequestMapping(path = "/api/v1") //grouping endpoint
@GetMapping("/") // use for GET
@PostMapping("/")// use for Post
@PutMapping(path ="{id}") // use for Update

// Get variale from request 
@PathVariable("id") // from ex: @PutMapping 
@RequestParam(required = false)
@RequestParam(required = false)

@DeleteMapping(path="{id}")// use for delete

@Autowired //injection for constructor

// Initial database
// ex: Student.java
@Entity
@Table

@Transient // for used to mark a field to be transient for the mapping framework

// ex: query jpql 
@Query("SELECT s FROM Student s WHERE s.email = ?1") 

// ex: StudentConfig.java 
@Configuration // set configuration input data


```


### Level API
```text
1. API Layers -> Control Methop GET-POST-PUT-DELETE -> StudentController.java
2. Service Layers -> Business logic-> StudentService.java 
3. Data access layer -> Variable naming -> Student.java 
4. DB

```

[Clean Arhitecture](https://medium.com/gdg-vit/clean-architecture-the-right-way-d83b81ecac6)


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.4/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.4.4/reference/htmlsingle/#boot-features-jpa-and-spring-data)
