-- database creation --
create database payroll_service1;
use payroll_service1;
-- create table --
create table employee_payroll (
id int auto_increment primary key,
name varchar(100),
gender char(1),
salary double,
start date
);
INSERT INTO employee_payroll (name, gender, salary, start) VALUES
('vasantha', 'F', 1000000.00, '2020-01-01'),
('manu', 'M', 1500000.00, '2019-03-15'),
('Manju', 'M', 1200000.00, '2021-07-10');
SHOW DATABASES;
USE payroll_service1;
SHOW TABLES;

