/*select upper(first_name) as Empname from employee;*/
/*SELECT COUNT(*)FROM EMPLOYEE WHERE JOB_TITLE='Engineer'*/
/*SELECT CURRENT_DATE();*/
/*SELECT SUBSTRING(first_name,1,4)
     from employee;*/
      /*SELECT SUBSTRING_INDEX (location,'(',1) FROM department;*/
     /* CREATE TABLE new_table LIKE employee;
INSERT INTO new_table SELECT * FROM employee;*/
/*select * FROM EMPLOYEE WHERE salary >= '50000' AND Salary <= '100000';*/
/*SELECT * FROM employee WHERE first_name LIKE 'S%';*/
select concat(first_name, ' ', last_name) as FullName from employee;
