# API-First Spring Boot Application with OpenAPI Code Generation

A Spring Boot application demonstrating API-first development using OpenAPI Generator to create a simple "Hello World" REST API. The project automatically generates server-side code from OpenAPI specifications, ensuring consistency between API documentation and implementation.

This project showcases the implementation of API-first development principles using Spring Boot 3.x and OpenAPI Generator. It includes automatic code generation for controllers, models, and API interfaces from an OpenAPI specification file. The application features a simple greeting endpoint that demonstrates the complete flow from API specification to implementation, including request validation and response handling.

## Repository Structure
```
.
├── mvnw/mvnw.cmd              # Maven wrapper scripts for Unix and Windows
├── pom.xml                    # Maven project configuration and dependencies
└── src
    ├── main
    │   ├── java/com/example/apifirst
    │   │   ├── api                    # Generated API interfaces and controllers
    │   │   │   ├── ApiUtil.java       # Utility class for API responses
    │   │   │   ├── HelloApi.java      # API interface definition
    │   │   │   ├── HelloApiController # Controller implementation
    │   │   │   └── HelloApiDelegate   # Delegate interface for business logic
    │   │   ├── ApifirstApplication.java # Spring Boot application entry point
    │   │   └── model                  # Generated API models
    │   └── resources
    │       ├── application.properties  # Application configuration
    │       └── example.yaml           # OpenAPI specification file
    └── test                           # Test directory
```

## Usage Instructions
### Prerequisites
- Java Development Kit (JDK) 17 or later
- Maven 3.6+ (optional, wrapper included)
- IDE with Spring Boot support (recommended)

### Installation

1. Clone the repository:
```bash
git clone <repository-url>
cd apifirst
```

2. Build the project:
```bash
# For Unix/Linux/macOS:
./mvnw clean install

# For Windows:
mvnw.cmd clean install
```

3. Run the application:
```bash
# For Unix/Linux/macOS:
./mvnw spring-boot:run

# For Windows:
mvnw.cmd spring-boot:run
```

### Quick Start
1. Start the application using the instructions above
2. The API will be available at `http://localhost:8080`
3. Send a POST request to `/hello` endpoint:
```bash
curl -X POST http://localhost:8080/hello \
  -H "Content-Type: application/json" \
  -d '{"name": "John"}'
```

### More Detailed Examples
1. Send a greeting request with a custom name:
```bash
curl -X POST http://localhost:8080/hello \
  -H "Content-Type: application/json" \
  -d '{"name": "Alice"}'
```
Expected response:
```json
{
  "message": "Hello, Alice!"
}
```

### Troubleshooting
1. Build Failures
- Error: "Java version not supported"
  - Solution: Ensure JDK 17+ is installed and JAVA_HOME is properly set
  - Verify with: `java -version`

2. Runtime Issues
- Error: "Port 8080 already in use"
  - Solution: Either stop the conflicting application or change the port in application.properties:
    ```properties
    server.port=8081
    ```

3. API Generation Issues
- Error: "Failed to generate API code"
  - Solution: Verify example.yaml syntax using a YAML validator
  - Run with verbose output: `./mvnw clean install -X`

## Data Flow
The application follows a simple request-response flow where incoming HTTP requests are transformed into Java objects, processed, and returned as JSON responses.

```ascii
Client Request -> HelloApiController -> HelloApiDelegate -> Business Logic -> Response
     |                    |                    |                |
     |                    |                    |                |
     v                    v                    v                v
  JSON Request -> Generated DTO -> Delegate Interface -> Response DTO -> JSON Response
```

Component interactions:
1. Client sends a POST request to /hello with a JSON payload
2. HelloApiController validates the request format
3. Request is converted to SayHelloRequest object
4. HelloApiDelegate processes the request
5. Business logic generates greeting message
6. Response is converted to SayHello200Response
7. JSON response is sent back to client