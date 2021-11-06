# Data Access Object App

Data Access Object App is a small project created to study the DAO project pattern. Basicly, the program make the basics SQL operations using JDBC (with mysqlConnector). The application can insert, delete, update and find data.

## 🔄 Database Structure

The SQL database structure is divided in 2 tables: seller and department, where each seller belongs to a department.
Department table has 2 columns: Id; Name.
Seller table has 6 columns: Id; Name; Email; BirthDate; BaseSalary; DepartmentId.

## 🏗️ Project Structure

The project was designed using Data Access Object pattern. Here you can see the IML diagram:  

![Captura de tela de 2021-11-05 21-49-40](https://user-images.githubusercontent.com/82426254/140592234-7f692632-7170-4145-aa7f-475d04d3d34d.png)

## 🏃 Getting Started

1. Run the "database.sql" file in your MySQL workbench to create the tables.
2. Config the file db.properties in the root of the project according to your MySQL authentication data.
3. Uncomment the "Program" and "Program2" commented lines (optional).
4. Run the "Program" or "Program2" files as java application.
5. Make the changes you want to 😄
