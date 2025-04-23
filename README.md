# Customer CRUD API – Spring Boot Backend

This project is a backend RESTful API built with **Java** and **Spring Boot** that manages customer data through standard CRUD operations. It uses **PostgreSQL** for data persistence, is containerized with **Docker**, and includes endpoint testing with **Postman**.

## 🛠 Tech Stack

- Java 17  
- Spring Boot  
- Maven  
- PostgreSQL  
- Docker  
- Postman

## 📦 Features

- Create, Read, Update, and Delete (CRUD) customer data  
- Layered architecture: Controller → Service → Repository  
- Dockerized for easy deployment  
- PostgreSQL integration with JPA/Hibernate  
- Postman collection for endpoint testing  
- Basic error handling and response structure

## 🚀 Getting Started

### Prerequisites

- Java 17+  
- Maven  
- Docker & Docker Compose

Run with Docker
bash
Copy
Edit
docker-compose up --build
This will spin up both the Spring Boot app and the PostgreSQL database.

Access the API
Base URL: http://localhost:8080/api/v1/customers

You can test the endpoints using Postman or curl.

📫 API Endpoints

Method	Endpoint	Description
GET	/api/v1/customers	Get all customers

GET	/api/v1/customers/{id}	Get customer by ID

POST	/api/v1/customers	Create new customer

PUT	/api/v1/customers/{id}	Update customer

DELETE	/api/v1/customers/{id}	Delete customer

📂 Project Structure
arduino
Copy
Edit
src/
├── controller
├── dto
├── service
├── repository
├── model
└── config
🧪 Testing
Use the included Postman collection or manually test endpoints with tools like curl or HTTPie.

📌 Notes
This project focuses on backend functionality only. There is no frontend UI included. Ideal for practicing backend architecture, API development, and Docker deployment.



