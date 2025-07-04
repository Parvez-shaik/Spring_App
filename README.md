# Java Spring Learning Journey

This repository documents my daily progress learning Java Spring and Spring Boot. Each day focuses on a different project and set of concepts.

---

## Day 1: Login App with Spring Boot
- Built a simple login application using Spring Boot.
- Learned about:
  - Spring Security for authentication
  - Spring Data JPA for database access
  - H2 in-memory database
  - MVC structure: controllers, models, repositories, and configuration
- Used a login HTML template and configured application properties for H2 and logging.

**Main files:**
- `LoginAppApplication.java`, `HomeController.java`, `User.java`, `UserRepository.java`, `SecurityConfig.java`, `login.html`

---

## Day 2: Spring API Project
- Created a REST API with Spring Boot.
- Practiced:
  - Building REST controllers and repositories
  - Exception handling
  - Using H2 database
  - Validation and JDBC
- Configured a simple application name in properties.

**Main files:**
- `RunController.java`, `Run.java`, `RunRepo.java`, `RunException.java`, `Location.java`

---

## Day 3: Runnerz App with Spring Boot 3
- Followed a course to build a fitness tracking REST API.
- Learned about advanced Spring Boot features:
  - REST controllers, repositories, data loading, error handling, and testing
  - User management, HTTP clients, and integration with external data
  - Modern Java (JDK 21), Maven, and best practices for project structure and testing
- Explored comprehensive testing and documentation practices.

**Main files:**
- `RunController.java`, `RunRepository.java`, `InMemoryRunRepository.java`, `JdbcRunRepository.java`, `RunJsonDataLoader.java`, `UserController.java`, `UserRestClient.java`, `User.java`

---

## Learning Resources

Much of the content and projects in this repository are inspired by and learned from [Dan Vega's YouTube](https://www.youtube.com/@DanVega/) and the video [Spring Boot 3 Crash Course](https://www.youtube.com/watch?v=Nv2DERaMx-4).

---

Each day builds on the previous, deepening understanding of Spring Boot and Java web development. See each subdirectory for more details and source code. 