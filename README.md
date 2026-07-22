# Binary Calculator Web Application

A Spring Boot web application developed for SOFE3980U – Software Quality (Lab 2) at Ontario Tech University.

The application performs binary arithmetic and bitwise logical operations through both a web interface and RESTful APIs. The project also includes automated testing using JUnit and Spring MockMvc.

## Features

- Binary Addition
- Binary Multiplication
- Bitwise AND
- Bitwise OR
- MVC Web Interface
- REST API Endpoints
- JSON Responses
- Automated Unit & Controller Tests
- Spring Boot MVC Architecture

## Technologies Used

- Java
- Spring Boot 2.1.2
- Maven
- Thymeleaf
- JUnit
- Spring MockMvc
- Visual Studio Code

## Project Structure

src
├── main
│   ├── java
│   │   └── com.ontariotechu.sofe3980U
│   │       ├── Application.java
│   │       ├── Binary.java
│   │       ├── BinaryController.java
│   │       ├── BinaryAPIController.java
│   │       ├── BinaryAPIResult.java
│   │       ├── HelloController.java
│   │       ├── HelloAPIController.java
│   │       └── APIResult.java
│   └── resources
│       └── templates
└── test
    └── java
        └── com.ontariotechu.sofe3980U

## REST API Endpoints

| Endpoint | Description |
|----------|-------------|
| `/add` | Binary Addition |
| `/multiply` | Binary Multiplication |
| `/and` | Bitwise AND |
| `/or` | Bitwise OR |
| `/add_json` | Addition (JSON) |
| `/multiply_json` | Multiplication (JSON) |
| `/and_json` | Bitwise AND (JSON) |
| `/or_json` | Bitwise OR (JSON) |

### Example


GET /add?operand1=111&operand2=1010

Response

10001

JSON Example

GET /add_json?operand1=111&operand2=1010

json
{
  "operand1": 111,
  "operator": "add",
  "operand2": 1010,
  "result": 10001
}

## Running the Project

Clone the repository:

bash
git clone https://github.com/YOUR_USERNAME/BinaryCalculatorWebapp.git

Navigate to the project folder:

bash
cd BinaryCalculatorWebapp

Run the application:

bash
mvn spring-boot:run

Open your browser:

http://localhost:8080

## Running Tests

Execute all tests using Maven:

bash
mvn test

## Screenshots

Add the following screenshots here before submission:

- Home Page
- Binary Calculator Interface
- REST API Response
- Maven Test Results (`BUILD SUCCESS`)

## Learning Outcomes

This project demonstrates:

- Spring Boot MVC development
- RESTful API implementation
- Binary arithmetic algorithms
- Bitwise logical operations
- Automated software testing
- Maven project management
- JSON serialization
- Unit and controller testing with JUnit and MockMvc

## Author

Hasin Anzum Mehtaj
M.Eng. Software Engineering
Ontario Tech University

## Course Information

Course: Software Testing and QA
Lab: Binary Calculator Web Application (Lab 2)
Semester: Summer 2026

## License

This repository was created for educational purposes as part of the SOFE3980U course at Ontario Tech University.
