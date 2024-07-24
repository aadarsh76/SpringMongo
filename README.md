# Scalable Microservices Using Spring Boot

This project implements a Spring Boot microservice for managing employee data. It utilizes Spring Data JPA to interact with a database and retrieves address information from a separate "address-service" using Feign.

## Features

- Retrieves all employees.
- Retrieves an employee by ID (including address information in the future).

## Dependencies

- Spring Boot
- Spring Data JPA
- Feign (for client communication)
- ModelMapper (for object mapping)
- Configuration

This microservice requires a database connection configured in application.properties. Ensure the database schema contains an "employee" table with relevant columns (id, name, email, role).

## Running the Service

Build the project using Maven: mvn clean package

### API Documentation

- GET /employees: Retrieves all employees.
- GET /employee/{id}: Retrieves an employee by ID (including address information in the future).

### Future Enhancements

- Implement error handling for various scenarios.
- Integrate with the "address-service" to retrieve actual address data for employees.
- Implement security measures for accessing employee data.
- Explore caching mechanisms for performance optimization.

## Related Microservices

Address Service (address-service): This microservice manages employee address information.

## Service Discovery

This specific codebase does not implement service discovery. However, the provided snippet from another microservice (ServiceDiscoveryApplication) uses Spring Cloud Netflix Eureka Server for service discovery. This assumes a separate Eureka Server instance is running to manage service registration and discovery.

## Contribution

We welcome contributions to this project. Please follow standard Git workflow and create pull requests for any changes or improvements.

## Contact

For any questions or feedback, feel free to aadarshsingh76@gmail.com or https://www.linkedin.com/in/backend-dev-aadarsh/.
