-- Create Database
CREATE DATABASE address_books_service;
USE address_books_service;

-- Location Table
CREATE TABLE location (
    location_id INT AUTO_INCREMENT PRIMARY KEY,
    city VARCHAR(50),
    state VARCHAR(50)
);

-- Address Book Table
CREATE TABLE address_books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    address VARCHAR(150),
    zip VARCHAR(10),
    phone_number VARCHAR(15),
    email VARCHAR(100),
    location_id INT,
    FOREIGN KEY (location_id) REFERENCES location(location_id)
);

-- Contact Type Table
CREATE TABLE address_books_type (
    type_id INT AUTO_INCREMENT PRIMARY KEY,
    type_name VARCHAR(50) UNIQUE
);

-- Person–Type Mapping
CREATE TABLE persons_type (
    person_id INT,
    type_id INT,
    PRIMARY KEY (person_id, type_id),
    FOREIGN KEY (person_id) REFERENCES address_books(id),
    FOREIGN KEY (type_id) REFERENCES address_books_type(type_id)
);

-- Insert Correct Location Data
INSERT INTO location (city, state) VALUES
('Chennai','Tamil Nadu'),
('Chennai','Tamil Nadu'),
('Bengaluru','Karnataka'),
('Kurnool','Andhra Pradesh'),
('Vijayawada','Andhra Pradesh');

-- Insert Address Book Data
INSERT INTO address_books
(first_name, last_name, address, zip, phone_number, email, location_id)
VALUES
('Manju','Manoj','Mambalam','515122','9989796734','manju@gmail.com',1),
('Haritha','Anji','T Nagar','777177','9898966666','haritha@gmail.com',2),
('Meena','Meenakshi','BTM Layout','8341232','7896798979','meena@gmail.com',3),
('Anil','Kumar','SP Nagar','989956','8765432234','anil@gmail.com',4),
('Sravani','Ghhh','Benz Circle','998967','8765767878','sravani@gmail.com',5);

-- Insert Contact Types
INSERT INTO address_books_type (type_name)
VALUES ('Family'), ('Friends'), ('Profession');

-- Insert Person-Type Mapping
INSERT INTO persons_type VALUES
(2,3),
(4,3),
(5,2),
(2,1);

-- Queries--
-- Persons from Chennai
SELECT ab.*
FROM address_books ab
JOIN location l ON ab.location_id = l.location_id
WHERE l.city = 'Chennai';

-- Count Persons by City
SELECT l.city, COUNT(*) AS total
FROM address_books ab
JOIN location l ON ab.location_id = l.location_id
GROUP BY l.city;

-- Count by Contact Type
SELECT abt.type_name, COUNT(pt.person_id) AS total
FROM address_books_type abt
JOIN persons_type pt ON abt.type_id = pt.type_id
GROUP BY abt.type_name;

