# Backend_Traini8_VineshReddy


1. Set Up Project:
   - Create a new Spring Boot project using your preferred IDE (e.g., IntelliJ IDEA, Eclipse,VS Code) or Spring Initializr (https://start.spring.io/).
   - Add the necessary dependencies: Spring Web, Spring Data JPA, MySQL Driver, Hibernate Validator, Lombok.

2. Define Model Classes:
   - Create Java classes for `TrainingCenter` and `Address` based on the provided code snippets.
   - Annotate the classes with JPA annotations (`@Entity`, `@Embeddable`, etc.) for persistence.

3. Configure Database Connection:
   - Configure the database connection in the `application.properties` .

4. Create Repository Interface:
   - Define a repository interface (`TrainingCenterRepository`) extending `JpaRepository<TrainingCenter, Long>` for CRUD (CREATE,READ,UPDATE,DELETE)operations.

5. Implement Service Layer:
   - Create a service interface (`TrainingCenterService`) with methods for creating and retrieving training centers.
   - Implement the service interface (`TrainingCenterServiceImpl`) and inject the repository for data access.

6. Implement Controller:
   - Create a REST controller (`TrainingCenterController`) with endpoints for creating and retrieving training centers.
   - Inject the service interface and handle requests/responses using appropriate annotations.

7. Exception Handling:
   - Implement a global exception handler (`CustomExceptionHandler`) to handle validation errors and other exceptions gracefully.

 8. Validation:
   - Add validation annotations to model classes for field validation.
     
 9. Testing:
   - Test the API endpoints using The tool Postman.

11. Run and Test:
    - Start the Spring Boot application and test the endpoints using appropriate HTTP requests (localhost:3306/traini8_registry).
   
    **THANK YOU**
