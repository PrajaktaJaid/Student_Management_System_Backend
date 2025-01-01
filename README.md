Student Management System - Backend
This is the backend application for the Student Management System, built using Spring Boot and MySQL. It provides RESTful APIs to manage student records, including creating, reading, updating, and deleting student data.

Features
Add a new student record
Retrieve all student records
Search student records by name
Update student details
Delete a student record

Setup Instructions
1. Prerequisites
Ensure the following are installed:

Java (version 11 or above)
Maven
MySQL Server
An IDE (e.g., IntelliJ IDEA or Eclipse)


2. Clone the Repository
3. Configure the Database
   Create a MySQL database:

   CREATE DATABASE student_management_db;

4. Build and Run the Application
Build the application: mvn clean install

Run the application:  mvn spring-boot:run

The backend server will be available at :http://localhost:8080


API Endpoints
Base URL: http://localhost:8080/api
Method	Endpoint	             Description
GET	    /students	             Get all students
POST	  /students	             Add a new student
GET	    /students/{id}	       Get a student by ID
PUT	    /students/{id}	       Update an existing student
DELETE	/students/{id}	        Delete a student by ID
GET	    /students/search?name={name}	Search students by name


Project Structure

src/
├── main/
│   ├── java/
│   │   └── com.example.studentmanagement/
│   │       ├── controller/    # REST Controllers
│   │       ├── model/         # JPA Entities
│   │       ├── repository/    # Data Access Layer
│   │       ├── service/       # Business Logic Layer
│   │       └── StudentManagementApplication.java
│   └── resources/
│       ├── application.properties  # Configuration
│       └── data.sql                 # Initial Data (if any)
└── test/                            # Unit Tests
     












