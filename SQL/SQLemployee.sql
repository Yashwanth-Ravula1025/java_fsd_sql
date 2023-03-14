use meenakshi;
/*CREATE TABLE Department (
    department_id INT NOT NULL AUTO_INCREMENT,
    department_name VARCHAR(50) NOT NULL,
    manager_id INT,
    location VARCHAR(100),
    PRIMARY KEY (department_id)
);*/
/*INSERT INTO Department
(department_id, department_name,manager_id, location)
VALUES
(345,"Developer",178,"Kochi"),(876,"Testing",908,"Kottayam");*/

/*CREATE TABLE Employee (
    employee_id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(20),
    hire_date DATE NOT NULL,
    job_title VARCHAR(50) NOT NULL,
    department_id INT NOT NULL,
    salary DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (employee_id),
    FOREIGN KEY (department_id) REFERENCES Department(department_id)
);*/
/*INSERT INTO Employee
(employee_id,first_name,last_name,email,phone,hire_date,job_title,department_id,salary)
VALUES(1,"Meenu","Sajeev","meenu01@gmail.com","9995076038",'2023-01-10',"Engineer",123,24000),
(2,"Meeni","Sajeevan","meeni01@gmail.com","9995676038",'2023-01-11',"Engineer",234,25000),
(3,"Devi","Sajeevan","devi01@gmail.com","9295676038",'2023-02-12',"Engineer",345,26000),
(4,"Devu","Sajeevan","devu01@gmail.com","9295666038",'2023-01-13',"Engineer",678,27000),
(5,"Amitha","Jose","amitha01@gmail.com","9285676038",'2023-01-16',"Engineer",876,26000);)*/


