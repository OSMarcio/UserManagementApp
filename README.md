# UserManagementApp

## Overview
UserManagementApp is a Spring Boot application that demonstrates the implementation of dependency injection. The project covers different types of dependency injection, their advantages, and practical scenarios where each can be used. It is designed to provide a clear understanding of how to apply dependency injection in Spring Boot.

## Table of Contents
- [Overview](#overview)
- [Project Setup](#project-setup)
- [Dependencies](#dependencies)
- [Configuration](#configuration)
- [Implementation](#implementation)
- [Unit Testing](#unit-testing)
- [Conclusion](#conclusion)
- [License](#license)

## Project Setup
To set up the project, follow these steps:

1. Clone the repository:
   ```sh
   git clone https://github.com/OSMarcio/UserManagementApp.git
      
2. Navigate to the project directory:
   ```sh
   cd UserManagementApp
      
3. Open the project in your preferred IDE (e.g., IntelliJ IDEA).

4. Build the project using Maven:
   ```sh
   mvn clean install
      
## Dependencies
The project relies on the following dependencies, which are defined in the pom.xml file:

Spring Boot Starter Data JPA
Spring Boot Starter Web
H2 Database
Spring Boot Starter Test

## Configuration
The application is configured to use an in-memory H2 database for testing purposes. Relevant configurations can be found in the application.properties file.

## Implementation
The project includes the following components:

Model: Represents the data model for the application.
Repository: Provides CRUD operations for the data model.
Service: Contains business logic for managing data.
Controller: Handles HTTP requests and interacts with the service layer.
These components demonstrate the use of dependency injection in Spring Boot, focusing on constructor injection for its advantages in immutability, clarity, and ease of testing.

## Unit Testing
The project includes unit tests for the service layer, demonstrating how to use both real and mocked data. These tests ensure that the business logic works correctly and that dependencies are properly injected.

## Conclusion
Dependency injection is a powerful technique that can transform the way we develop applications. This project aims to provide a clear and practical understanding of how to implement dependency injection in Spring Boot, emphasizing its benefits for creating clean, modular, and testable code.

## License
This project is licensed under the GNU License. See the [LICENSE](https://github.com/OSMarcio/UserManagementApp/tree/main#) file for details.
