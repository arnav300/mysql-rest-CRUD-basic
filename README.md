# mysql-rest-CRUD-basic

This will help you with a simple guide on creating a CRUD web service and connecting with MySql DB.

Prerequisite:
- Eclipse IDE for Java EE or any Java IDE with Apache Maven support.
- Maven 3.x
- JDK 1.8
- MySQL 5.x
- phpMyAdmin or any other clients to access MySQL database
- Postman or any other REST Clients

Step 1:
Create a new simple Maven Project with the following properties:
Group Id: com.exercise
Artifact Id: mysql-rest-service

Step 2:
Open the pom.xml and modify it as given below. In this step, we define this project as a Spring Boot project along with the dependencies to connect the database

Step 3:
In this step, we are going to create a configuration file that tells Spring Framework about how to connect the database.
Create a new file named application.properties inside the src/main/resources directory with the following content. In this file, only properties you need to consider are the spring.datasource.URL, spring.datasource.username and spring.datasource.password. Here user_db is the database name.

Step 4:
Open PhpMyAdmin or whatever the MySQL client you prefer and create an empty database user_db.

Step 5:
Create a package com.exercise.restservice in the src/main/java directory and a class Application inside the package.This class is the starting point of our application. It is decorated as a SpringBootApplication. Running this class will run the application as a web service in a stand-alone server.

Step 6:
In the src/main/java directory, create a new package com.exercise.restservice.entity and create a new class User. In the upcoming steps, we will develop CRUD services for this entity.Here the class is decorated with the @Entity annotation and the primary key is decorated with the @Id annotation.

Step 7:
Create another package com.exercise.restservice.repository in the src/main/java directory and create a new interface UserRepository.This interface extends JpaRepository and the two generic types defined are the entity class and the type of its primary key. In this example, the entity class is User and its primary key username is String. This is a magical interface which provides all the CRUD implementations. You do not need to implement this interface anywhere. Instead, Spring Boot will provide the implementation for you.

The @RepositoryRestResource annotation marks this interface as a REST resource serving the /users URL.

Step 8:
After creating the repository, right click on the project and select Run As → Java Application. If asked, select the Application class as the main class to execute.

Step 9:
Try the REST APIs exposed by the UserRepository. You can create a new user using POST request and read all the users by sending a GET request to the same URL. To see the available functionalities, visit the http://localhost:8080/profile/users URL.

