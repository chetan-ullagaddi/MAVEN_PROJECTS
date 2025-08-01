# MAVEN_PROJECTS
This is a simple Java Maven project demonstrating how to perform basic CRUD operations using Hibernate ORM with a MySQL database. It allows storing employee details (name and department) via console input and persists them to the database using Hibernate's ORM capabilities.
# 🧠 Hibernate Employee Management System

[![License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)  
[![Profile Views](https://komarev.com/ghpvc/?username=chetan-ullagaddi&color=blue)](https://github.com/chetan-ullagaddi)

> A lightweight Java-based Employee Management System using **Hibernate ORM**, **MySQL**, and **Maven**. It demonstrates how to perform simple CRUD operations using Hibernate, making it ideal for learning Hibernate setup, configuration, and integration in real-world projects.

---

## 🌟 Project Overview

This console-based Hibernate application allows users to:

- Insert employee data (name & department)
- Automatically map entity to database table using Hibernate annotations
- Auto-create/update table structure via Hibernate
- Use `hibernate.cfg.xml` for DB config
- Learn Maven dependency management and Hibernate integration

---

## 🛠️ Technologies Used

- **Java 17**
- **Hibernate ORM 5.6.15.Final**
- **MySQL 8.0**
- **Jakarta Persistence API**
- **Maven**

---

## ⚙️ How It Works

1. **Employee.java** — Entity class mapped to the database
2. **App.java** — Accepts user input and saves data via Hibernate session
3. **hibernate.cfg.xml** — Configuration file for Hibernate and DB connection
4. **pom.xml** — Maven file with required dependencies

---

## 🗂️ Project Structure
hibooo/
├── pom.xml
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── org.jsp.chetan.hibooo/
│ │ │ ├── App.java
│ │ │ └── Employee.java
│ └── resources/
│ └── hibernate.cfg.xml

2️⃣ Configure MySQL Database
Create a schema named hibernate

In hibernate.cfg.xml, set your MySQL username and password

Ensure MySQL is running on port 3306

3️⃣ Run the Application
bash
Copy
Edit
mvn clean install
mvn exec:java -Dexec.mainClass="org.jsp.chetan.hibooo.App"
📝 Sample Input
bash
Copy
Edit
Enter name, dept
Chetan
CSE
✅ Output:

nginx
Copy
Edit
Employee saved successfully!


