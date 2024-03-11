# Employee Management System

The Employee Management System is a web application designed to manage the details of employees within an organization. It's built using Spring Boot for the backend, AngularJS for the frontend, and MySQL as the database. This application allows for easy management of employee records including adding, updating, and deleting employees.

## Features

- **Add New Employee**: Allows the users to add new employees into the system.
- **List Employees**: Users can view all the employees in the system.
- **Update Employee**: This feature enables updating existing employee information.
- **Delete Employee**: Allows for the deletion of employee records.
- **Search Employee**: Users can search for employees based on various filters.

## Prerequisites

Before you begin, ensure you have met the following requirements:
- JDK 1.8 or later
- Maven 3.2+
- MySQL 5.6 or later
- Node.js and npm (for AngularJS)

## Setting Up the Development Environment

### Backend Setup

1. **Clone the repository**

`git clone https://github.com/your-repository/employee_management_system.git`

navigate to emplyeemanager folder so that you can access spring boot application.
`cd employee_management_system/employeemanager`


2. **Configure MySQL**

Create a database in MySQL and update `src/main/resources/application.properties` with your MySQL user and password.

spring.datasource.url=jdbc:mysql://localhost:3306/your_database?useSSL=false
spring.datasource.username=your_username
spring.datasource.password=your_password


3. **Run the Spring Boot Application**

Use Maven to run the application.

`mvn spring-boot:run`

By default, the Spring Boot app will run on `http://localhost:8080`.

### Frontend Setup

1. **Navigate to the AngularJS App Directory**

`cd employee-management-app`.

2. **Install Dependencies**

`npm install`.

3. **Run the AngularJS Application**

`npm start`.


By default, the AngularJS app will run on `http://localhost:4200`.

## Usage

Once both the backend and frontend are running, navigate to `http://localhost:4200` in your browser to access the Employee Management System.

## Contributing

Contributions are welcome! For major changes, please open an issue first to discuss what you would like to change.

Please ensure to update tests as appropriate.
