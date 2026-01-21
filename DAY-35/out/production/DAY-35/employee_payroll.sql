USE payroll_service;

CREATE TABLE employees_payroll (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    salary DECIMAL(10,2) NOT NULL,
    start  DATE NOT NULL
);

-- describe table
DESC employees_payroll;

-- insert records
INSERT INTO employees_payroll (name, salary, start) 
VALUES 
('vasantha', 30000.00, '2018-12-12'),
('manju', 25000.00, '2023-02-23'),
('manu', 35000.00, '2020-08-18');

-- view table
SELECT * FROM employees_payroll;


-- get salary of specific employee
SELECT salary
FROM employees_payroll
WHERE name = 'vasantha';

-- filter employees by date range
SELECT * 
FROM employees_payroll
WHERE start
BETWEEN CAST('2018-11-11' AS DATE) AND DATE(NOW());

-- add gender column
ALTER TABLE employees_payroll
ADD COLUMN gender CHAR(1) AFTER name;

-- update gender
UPDATE employees_payroll 
SET gender = 'F'
WHERE name IN ('vasantha');

SELECT * FROM employees_payroll;

-- aggregate functions (salary analysis by gender)
SELECT gender, SUM(salary) AS total_salary
FROM employees_payroll
GROUP BY gender;

SELECT gender, AVG(salary) AS avg_salary
FROM employees_payroll
GROUP BY gender;

SELECT gender, MIN(salary) AS min_salary
FROM employees_payroll
GROUP BY gender;

SELECT gender, MAX(salary) AS max_salary
FROM employees_payroll
GROUP BY gender;

SELECT gender, COUNT(*) AS employee_count
FROM employees_payroll
GROUP BY gender;

-- delete operation
DELETE FROM employees_payroll
WHERE name = 'manju';

-- extend payroll table (contact & department)
ALTER TABLE employees_payroll
ADD phone VARCHAR(15),
ADD address VARCHAR(200) DEFAULT 'Not Provided',
ADD department VARCHAR(50) DEFAULT 'General';

DESC employees_payroll;

-- extend table to store salary breakdown
ALTER TABLE employees_payroll
ADD basic_pay DECIMAL(10,2),
ADD deductions DECIMAL(10,2),
ADD taxable_pay DECIMAL(10,2),
ADD income_tax DECIMAL(10,2),
ADD net_pay DECIMAL(10,2);

-- update salary breakdown & details
UPDATE employees_payroll
SET basic_pay = 7500.00,
    deductions = 1200.00,
    taxable_pay = 3000.00,
    income_tax = 2000.00,
    net_pay = 10000.00,
    phone = '9959777376',
    address = 'Andhra Pradesh',
    department = 'IT'
WHERE name = 'vasantha';
-- insert values 
insert into employees_payroll(name, gender, salary, start, basic_pay , deductions, taxiable_pay, income_tax, net_pay, phone, address, department) values('vasantha' , 'f', 30000.00, '2018-12-12' , 7500.00, 1200.00, 3000.00, 2000.00, 10000.00, '9959777376', 'andhrapradesh', 'developer');
-- Normalization (3NF)
-- CREATE EMPLOYEE TABLE
CREATE TABLE employee (
    emp_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    gender CHAR(1),
    phone VARCHAR(15),
    address VARCHAR(200)
);
-- create department table
CREATE TABLE department (
    dept_id INT AUTO_INCREMENT PRIMARY KEY,
    dept_name VARCHAR(50) NOT NULL
);
INSERT INTO department (dept_name)
VALUES ('it'), ('developer');
-- employee department mapping(many to many)
CREATE TABLE employee_department (
    emp_id INT,
    dept_id INT,
    PRIMARY KEY (emp_id, dept_id),
    FOREIGN KEY (emp_id) REFERENCES employee(emp_id),
    FOREIGN KEY (dept_id) REFERENCES department(dept_id)
);
-- payroll table salary(only)
CREATE TABLE payroll (
    emp_id INT,
    basic_pay DECIMAL(10,2),
    deductions DECIMAL(10,2),
    taxable_pay DECIMAL(10,2),
    income_tax DECIMAL(10,2),
    net_pay DECIMAL(10,2),
    FOREIGN KEY (emp_id) REFERENCES employee(emp_id)
);
INSERT INTO employee (name, gender, phone, address)
VALUES ('vasantha', 'f', '9959777376', 'Chennai');
INSERT INTO employee_department (emp_id, dept_id)
VALUES (1, 1), (1, 2);
INSERT INTO payroll
VALUES (1, 120000, 2000, 118000, 10000, 108000);

























