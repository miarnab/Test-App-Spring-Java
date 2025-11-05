# AI Agent Instructions for Test-App-Spring-Java

## Project Overview
This is a Spring Boot web application using Thymeleaf templating engine. It follows a basic MVC architecture:
- Java 11 Spring Boot application (v2.7.6)
- Thymeleaf for server-side templating
- Maven for build management
- Lombok for reducing boilerplate code

## Key Components & Architecture
1. **Entry Point**: `AppApplication.java` - Standard Spring Boot application entry point with `@SpringBootApplication`
2. **Controllers**: Located in `src/main/java/com/example/app/`
   - Example: `MainController.java` demonstrates Spring MVC pattern with `@Controller` and `@GetMapping`
3. **Views**: Under `src/main/resources/templates/`
   - Thymeleaf templates (`.html` files) using `th:` namespace
   - Example: `mainTemplate.html` shows Thymeleaf syntax for model binding

## Development Workflow

### Building and Running
```bash
# Run using Maven wrapper
./mvnw spring-boot:run

# Build JAR
./mvnw clean package
```

### Testing
- Tests reside in `src/test/java/`
- Run tests using: `./mvnw test`

## Project Conventions
1. **Controller Patterns**:
   - Request mapping methods return template names as strings
   - Model attributes are added via `Model` parameter
   - Example in `MainController.java`: `model.addAttribute("test", "Hello User")`

2. **Template Conventions**:
   - Use Thymeleaf's bracket notation `[[${variable}]]` or `th:text="${variable}"` for model binding
   - Templates are named with suffix `Template.html`

3. **Project Structure**:
   - Java sources in `src/main/java/com/example/app/`
   - Resources in `src/main/resources/`
   - Templates in `src/main/resources/templates/`
   - Tests in `src/test/java/com/example/app/`

## Dependencies & Configuration
- Spring Boot Starter Web
- Spring Boot Starter Thymeleaf
- Spring Boot DevTools (for development)
- Lombok (v1.16.12)
- Configuration in `pom.xml` and `src/main/resources/properties.yml`