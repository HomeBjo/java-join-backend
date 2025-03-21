# Join Backend – Task Management API

 Project Description

The Join backend is a Spring Boot REST API designed for a task management system similar to a Kanban board or a to-do list.
It enables users to create, manage, and assign tasks, making it a powerful tool for team collaboration.

 Features

User Management: Authentication via Firebase & internal user handling
Task Management: Create, update, delete, and retrieve tasks
Prioritization: Tasks can be assigned a priority level
Subtasks: Each task contains subtasks with checkboxes
Assignments: Tasks can be assigned to internal users
Database Storage: Uses PostgreSQL for persistent data
RESTful API: Built with Spring Boot, JPA & Hibernate

 Tech Stack

Backend: Java, Spring Boot, Spring Data JPA
Database: PostgreSQL
Authentication: Firebase Auth (for external users), internal user management
API Testing & Documentation: Postman
Deployment: TBD

 Planned API Endpoints

Method	Endpoint	Description
GET	/api/tasks	Retrieve all tasks
POST	/api/tasks	Create a new task
GET	/api/tasks/{id}	Retrieve a single task
PUT	/api/tasks/{id}	Update an existing task
DELETE	/api/tasks/{id}	Delete a task
